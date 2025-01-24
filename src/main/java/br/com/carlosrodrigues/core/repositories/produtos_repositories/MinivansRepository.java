package br.com.carlosrodrigues.core.repositories.produtos_repositories;

import br.com.carlosrodrigues.core.models.models_produtos.Minivans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MinivansRepository extends JpaRepository<Minivans, Long> {
}