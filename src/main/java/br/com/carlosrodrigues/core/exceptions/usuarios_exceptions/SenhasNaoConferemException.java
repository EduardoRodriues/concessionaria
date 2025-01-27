package br.com.carlosrodrigues.core.exceptions.usuarios_exceptions;

import org.springframework.validation.FieldError;

public class SenhasNaoConferemException extends ValidacaoException {

    public SenhasNaoConferemException(String mensagem, FieldError fieldError) {
        super(mensagem,fieldError);
    }


}
