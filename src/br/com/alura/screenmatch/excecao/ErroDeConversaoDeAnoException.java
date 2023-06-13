package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoDeAnoException(String mensagem) {
        super("Não consegui converter o ano ");
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
