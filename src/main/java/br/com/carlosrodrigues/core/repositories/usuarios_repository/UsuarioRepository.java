package br.com.carlosrodrigues.core.repositories.usuarios_repository;

import br.com.carlosrodrigues.core.models.models_usuarios.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);

    @Query("SELECT count(*) > 0 FROM Usuario u WHERE u.email = :email and (:id is null or u.id != :id) ")
    Boolean isEmailJaCadastrado(String email, Long id);
}