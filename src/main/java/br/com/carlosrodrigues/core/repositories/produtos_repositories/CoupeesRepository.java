package br.com.carlosrodrigues.core.repositories.produtos_repositories;

import br.com.carlosrodrigues.core.models.models_produtos.Coupees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoupeesRepository extends JpaRepository<Coupees, Long> {
}