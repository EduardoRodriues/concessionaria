package br.com.carlosrodrigues.web.mappers.produtos_mappers;

import br.com.carlosrodrigues.core.models.models_produtos.Coupees;
import br.com.carlosrodrigues.web.dto.dto_produtos.CoupeesForm;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ICoupeesMapper {

    Coupees toModel(CoupeesForm form);

    CoupeesForm toForm(Coupees model);

}
