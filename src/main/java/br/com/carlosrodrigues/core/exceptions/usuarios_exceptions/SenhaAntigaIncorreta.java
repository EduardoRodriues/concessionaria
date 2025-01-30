package br.com.carlosrodrigues.core.exceptions.usuarios_exceptions;

import org.springframework.validation.FieldError;

public class SenhaAntigaIncorreta extends ValidacaoException {

    public SenhaAntigaIncorreta(String mensagem, FieldError fieldError) {
      super(mensagem,fieldError);
    }
}
