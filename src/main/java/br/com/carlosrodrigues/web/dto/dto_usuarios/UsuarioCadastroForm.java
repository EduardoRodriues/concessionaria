package br.com.carlosrodrigues.web.dto.dto_usuarios;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UsuarioCadastroForm{

    @NotEmpty(message = "O campo deve ser preenchido")
    private String nome;

    @Email(message = "o campo deve ser preenchido com um email")
    @NotEmpty(message = "O campo deve ser preenchido")
    private String email;

    @Size(min = 11, max = 11, message = "o campo deve conter 11 digitos")
    @NotEmpty(message = "O campo deve ser preenchido")
    private String cpf;

    @NotEmpty(message = "O campo deve ser preenchido")
    private String senha;

    @NotEmpty(message = "O campo deve ser preenchido")
    private String confirmacaoSenha;

    public @NotEmpty(message = "O campo deve ser preenchido") String getNome() {
        return nome;
    }

    public void setNome(@NotEmpty(message = "O campo deve ser preenchido") String nome) {
        this.nome = nome;
    }

    public @Email(message = "o campo deve ser preenchido com um email") @NotEmpty(message = "O campo deve ser preenchido") String getEmail() {
        return email;
    }

    public void setEmail(@Email(message = "o campo deve ser preenchido com um email") @NotEmpty(message = "O campo deve ser preenchido") String email) {
        this.email = email;
    }

    public @Size(min = 11, max = 11, message = "o campo deve conter 11 digitos") @NotEmpty(message = "O campo deve ser preenchido") String getCpf() {
        return cpf;
    }

    public void setCpf(@Size(min = 11, max = 11, message = "o campo deve conter 11 digitos") @NotEmpty(message = "O campo deve ser preenchido") String cpf) {
        this.cpf = cpf;
    }

    public @NotEmpty(message = "O campo deve ser preenchido") String getSenha() {
        return senha;
    }

    public void setSenha(@NotEmpty(message = "O campo deve ser preenchido") String senha) {
        this.senha = senha;
    }

    public @NotEmpty(message = "O campo deve ser preenchido") String getConfirmacaoSenha() {
        return confirmacaoSenha;
    }

    public void setConfirmacaoSenha(@NotEmpty(message = "O campo deve ser preenchido") String confirmacaoSenha) {
        this.confirmacaoSenha = confirmacaoSenha;
    }
}