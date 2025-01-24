package br.com.carlosrodrigues.core.repositories.produtos_repositories;

import br.com.carlosrodrigues.core.models.models_produtos.Esportivos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EsportivosRepository extends JpaRepository<Esportivos, Long> {
}