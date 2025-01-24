package br.com.carlosrodrigues.web.mappers.produtos_mappers;

import br.com.carlosrodrigues.core.models.models_produtos.Picapes;
import br.com.carlosrodrigues.web.dto.dto_produtos.PicapesForm;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface IPicapesMapper {

    Picapes toModel(PicapesForm form);

    Picapes toForm(Picapes model);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Picapes partialUpdate(PicapesForm picapesDto, @MappingTarget Picapes picapes);
}