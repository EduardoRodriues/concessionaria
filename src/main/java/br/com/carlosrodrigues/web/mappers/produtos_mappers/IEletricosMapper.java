package br.com.carlosrodrigues.web.mappers.produtos_mappers;

import br.com.carlosrodrigues.core.models.models_produtos.Eletricos;
import br.com.carlosrodrigues.web.dto.dto_produtos.EletricosForm;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface IEletricosMapper {

    Eletricos toModel(EletricosForm form);

    EletricosForm toForm(Eletricos model);

}