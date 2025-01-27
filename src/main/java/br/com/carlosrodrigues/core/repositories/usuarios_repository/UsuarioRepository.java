package br.com.carlosrodrigues.core.repositories.usuarios_repository;

import br.com.carlosrodrigues.core.models.models_usuarios.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}