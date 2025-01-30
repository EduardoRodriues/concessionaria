package br.com.carlosrodrigues.web.service.usuarios_service;

import br.com.carlosrodrigues.core.enums.enums_usuarios.TipoUsuario;
import br.com.carlosrodrigues.core.exceptions.usuarios_exceptions.SenhaAntigaIncorreta;
import br.com.carlosrodrigues.core.exceptions.usuarios_exceptions.SenhasNaoConferemException;
import br.com.carlosrodrigues.core.exceptions.usuarios_exceptions.UsuarioNaoEncontradoException;
import br.com.carlosrodrigues.core.models.models_usuarios.Usuario;
import br.com.carlosrodrigues.core.repositories.usuarios_repository.UsuarioRepository;
import br.com.carlosrodrigues.web.dto.dto_usuarios.AlterarSenhaForm;
import br.com.carlosrodrigues.web.dto.dto_usuarios.UsuarioCadastroForm;
import br.com.carlosrodrigues.web.dto.dto_usuarios.UsuarioEdicaoForm;
import br.com.carlosrodrigues.web.mappers.usuarios_mappers.IUsuarioMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private IUsuarioMapper mapper;


    public List<Usuario> mostrarTodos() {
        return repository.findAll();
    }

    public Usuario cadastrar(UsuarioCadastroForm form) {

        var senha = form.getSenha();
        var confirmacaoSenha = form.getConfirmacaoSenha();

        if (!senha.equals(confirmacaoSenha)) {

            var mensagem = "As senhas não conferem";

            var fieldError = new FieldError(form.getClass().getName(),
                    "confirmacaoSenha",
                    form.getConfirmacaoSenha(),
                    false,
                    null,
                    null,
                    mensagem);

            throw new SenhasNaoConferemException(mensagem, fieldError);
        }

        var model = mapper.toModel(form);

        var senhaHash = passwordEncoder.encode(senha);

        model.setSenha(senhaHash);
        model.setTipoUsuario(TipoUsuario.ADMIN);

        return repository.save(model);
    }

    public Usuario buscarPorId(Long id) {

        var mensagem = String.format("Usuario não encontrado", id);

        return repository.findById(id)
                .orElseThrow(() -> new UsuarioNaoEncontradoException(mensagem));
    }

    public Usuario buscarPorEmail(String email) {

        var mensagem = String.format("Usuario não encontrado", email);

        return repository.findByEmail(email)
                .orElseThrow(() -> new UsuarioNaoEncontradoException(mensagem));
    }

    public Usuario editar(UsuarioEdicaoForm form, Long id) {

        var usuario = buscarPorId(id);

        var model = mapper.toModel(form);

        model.setId(usuario.getId());
        model.setSenha(usuario.getSenha());
        model.setTipoUsuario(usuario.getTipoUsuario());

        return repository.save(model);
    }

    public void deletar(Long id) {

        var usuario = buscarPorId(id);
        repository.delete(usuario);
    }

    public Usuario alterarSenha(AlterarSenhaForm form, String email) {

        var usuario = buscarPorEmail(email);

        var senhaAtual = usuario.getSenha();
        var senhaAntiga = form.getSenhaAntiga();

        if(!senhaAntiga.matches(senhaAtual)) {

            var mensagem = "A senha antiga esta incorreta";

            var fieldError = new FieldError(form.getClass().getName(),
                    "senhaAntiga",
                    form.getSenhaAntiga(),
                    false,
                    null,
                    null,
                    mensagem);

            throw new SenhaAntigaIncorreta(mensagem, fieldError);
        }

        var senhaNova = form.getSenhaNova();
        var confirmacaoSenha = form.getConfirmacaoSenha();

        if (!senhaNova.equals(confirmacaoSenha)) {

            var mensagem = "As senhas não conferem";

            var fieldError = new FieldError(form.getClass().getName(),
                    "confirmacaoSenha",
                    form.getConfirmacaoSenha(),
                    false,
                    null,
                    null,
                    mensagem);

            throw new SenhasNaoConferemException(mensagem, fieldError);
        }

        var senhaNovaHash = passwordEncoder.encode(senhaNova);

        return repository.save(usuario);
    }
}
