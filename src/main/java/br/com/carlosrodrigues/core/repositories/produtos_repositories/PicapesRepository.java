package br.com.carlosrodrigues.core.repositories.produtos_repositories;

import br.com.carlosrodrigues.core.models.models_produtos.Picapes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PicapesRepository extends JpaRepository<Picapes, Long> {
}