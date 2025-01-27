package br.com.carlosrodrigues.web.mappers.usuarios_mappers;

import br.com.carlosrodrigues.core.models.models_usuarios.Usuario;
import br.com.carlosrodrigues.web.dto.dto_usuarios.UsuarioCadastroForm;
import br.com.carlosrodrigues.web.dto.dto_usuarios.UsuarioEdicaoForm;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface IUsuarioMapper {

    Usuario toModel(UsuarioCadastroForm form);


    Usuario toModel(UsuarioEdicaoForm form);
    UsuarioEdicaoForm toForm(Usuario model);
}
