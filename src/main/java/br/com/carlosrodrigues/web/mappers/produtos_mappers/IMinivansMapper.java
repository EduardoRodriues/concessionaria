package br.com.carlosrodrigues.web.mappers.produtos_mappers;

import br.com.carlosrodrigues.core.models.models_produtos.Minivans;
import br.com.carlosrodrigues.web.dto.dto_produtos.MinivansForm;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface IMinivansMapper {
    Minivans toModel(MinivansForm form);

    MinivansForm toForm(Minivans model);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Minivans partialUpdate(MinivansForm minivansForm, @MappingTarget Minivans minivans);
}