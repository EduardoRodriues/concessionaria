package br.com.carlosrodrigues.core.exceptions.usuarios_exceptions;

import org.springframework.validation.FieldError;

public class ValidacaoException extends RuntimeException {

    private FieldError fieldError;

    public ValidacaoException(String mensagem, FieldError fieldError) {
        super(mensagem);
        this.fieldError = fieldError;
    }

    public FieldError getFieldError() {
        return fieldError;
    }
}
