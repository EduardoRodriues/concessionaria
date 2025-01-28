package br.com.carlosrodrigues.web.dto.dto_usuarios;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class UsuarioEdicaoForm {

    @NotEmpty(message = "O campo deve ser preenchido")
    private String nome;

    @Email
    @NotEmpty(message = "O campo deve ser preenchido")
    private String email;

    @Size(min = 11, max = 11, message = "o campo deve conter 11 digitos")
    private String cpf;

    public @NotEmpty(message = "O campo deve ser preenchido") String getNome() {
        return nome;
    }

    public void setNome(@NotEmpty(message = "O campo deve ser preenchido") String nome) {
        this.nome = nome;
    }

    public @Email @NotEmpty(message = "O campo deve ser preenchido") String getEmail() {
        return email;
    }

    public void setEmail(@Email @NotEmpty(message = "O campo deve ser preenchido") String email) {
        this.email = email;
    }

    public @Size(min = 11, max = 11, message = "o campo deve conter 11 digitos") String getCpf() {
        return cpf;
    }

    public void setCpf(@Size(min = 11, max = 11, message = "o campo deve conter 11 digitos") String cpf) {
        this.cpf = cpf;
    }
}
