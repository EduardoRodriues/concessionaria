package br.com.carlosrodrigues.web.dto.mensagens;

public class FlashMessage {

    private String classeCss;

    private String mensagem;

    public FlashMessage(String classeCss, String mensagem) {
        this.classeCss = classeCss;
        this.mensagem = mensagem;
    }
}
