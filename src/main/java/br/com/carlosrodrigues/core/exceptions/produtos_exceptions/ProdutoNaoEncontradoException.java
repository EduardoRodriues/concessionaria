package br.com.carlosrodrigues.core.exceptions.produtos_exceptions;

public class ProdutoNaoEncontradoException extends RuntimeException {
    public ProdutoNaoEncontradoException(String message) {
        super(message);
    }
}
