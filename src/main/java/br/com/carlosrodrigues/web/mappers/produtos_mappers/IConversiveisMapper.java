package br.com.carlosrodrigues.web.mappers.produtos_mappers;

import br.com.carlosrodrigues.core.models.models_produtos.Conversiveis;
import br.com.carlosrodrigues.web.dto.dto_produtos.ConversiveisForm;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface IConversiveisMapper {

    Conversiveis toModel(ConversiveisForm form);

    ConversiveisForm toForm(Conversiveis model);


}
