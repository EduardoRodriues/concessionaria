package br.com.carlosrodrigues.auth.Service;

import br.com.carlosrodrigues.auth.model.UsuarioAutenticado;
import br.com.carlosrodrigues.core.repositories.usuarios_repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AutenticacaoService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        var mensagem = String.format("Usuario não autorizado para o email: %s", email);

        return usuarioRepository.findByEmail(email)
                .map(UsuarioAutenticado::new)
                .orElseThrow(() -> new UsernameNotFoundException(mensagem));
    }
}
