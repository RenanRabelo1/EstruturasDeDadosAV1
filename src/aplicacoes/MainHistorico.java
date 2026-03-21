package aplicacoes;


import pilha.GerenciadorHistorico;

public class MainHistorico {
    public static void main(String[] args) {
        GerenciadorHistorico nav = new GerenciadorHistorico();

        //navegação inicial
        nav.visitarPagina("google.com");
        nav.visitarPagina("unifor.br");
        nav.visitarPagina("youtube.com");
        nav.exibirEstado();

        //Tentando voltar
        nav.voltar();
        nav.voltar();
        nav.exibirEstado();

        //avançando
        nav.avancar();
        nav.exibirEstado();

        nav.visitarPagina("github.com");
        nav.exibirEstado();



    }
}
