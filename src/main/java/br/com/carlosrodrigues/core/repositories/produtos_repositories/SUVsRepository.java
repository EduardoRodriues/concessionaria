package br.com.carlosrodrigues.core.repositories.produtos_repositories;

import br.com.carlosrodrigues.core.models.models_produtos.SUVs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SUVsRepository extends JpaRepository<SUVs, Long> {
}
