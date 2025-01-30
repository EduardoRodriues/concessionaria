package br.com.carlosrodrigues.web.dto.dto_usuarios;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class AlterarSenhaForm {

    @NotEmpty(message = "o campo deve ser preenchido")
    private String senhaAntiga;

    @NotEmpty(message = "o campo deve ser preenchido")
    private String senhaNova;

    @NotEmpty(message = "o campo deve ser preenchido")
    private String confirmacaoSenha;

    public String getSenhaAntiga() {
        return senhaAntiga;
    }

    public void setSenhaAntiga(String senhaAntiga) {
        this.senhaAntiga = senhaAntiga;
    }


    public String getConfirmacaoSenha() {
        return confirmacaoSenha;
    }

    public void setConfirmacaoSenha(String confirmacaoSenha) {
        this.confirmacaoSenha = confirmacaoSenha;
    }

    public String getSenhaNova() {
        return senhaNova;
    }

    public void setSenhaNova(String senhaNova) {
        this.senhaNova = senhaNova;
    }
}
