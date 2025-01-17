package br.com.carlosrodrigues.web.mappers.produtos_mappers;

import br.com.carlosrodrigues.core.models.models_produtos.SUVs;
import br.com.carlosrodrigues.web.dto.dto_produtos.SUVsForm;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ISUVsMapper {

    SUVs toModel(SUVsForm form);

    SUVsForm toForm(SUVs model);
}
