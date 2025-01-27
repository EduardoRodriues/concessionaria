package br.com.carlosrodrigues.core.repositories.produtos_repositories;

import br.com.carlosrodrigues.core.models.models_produtos.Eletricos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EletricosRepository extends JpaRepository<Eletricos, Long> {
}