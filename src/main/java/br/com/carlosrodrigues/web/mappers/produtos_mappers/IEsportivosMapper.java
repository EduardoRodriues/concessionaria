package br.com.carlosrodrigues.web.mappers.produtos_mappers;

import br.com.carlosrodrigues.core.models.models_produtos.Esportivos;
import br.com.carlosrodrigues.web.dto.dto_produtos.EsportivosForm;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface IEsportivosMapper {

    Esportivos toModel(EsportivosForm form);

    EsportivosForm toForm(Esportivos model);

}