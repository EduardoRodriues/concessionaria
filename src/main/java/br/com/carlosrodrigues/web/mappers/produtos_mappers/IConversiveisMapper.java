package br.com.carlosrodrigues.web.mappers.produtos_mappers;

import br.com.carlosrodrigues.core.models.models_produtos.Conversiveis;
import br.com.carlosrodrigues.web.dto.dto_produtos.ConversiveisForm;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IConversiveisMapper {

    Conversiveis toModel(ConversiveisForm form);

    ConversiveisForm toForm(Conversiveis model);
}
