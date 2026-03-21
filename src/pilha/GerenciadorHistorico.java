package pilha;

import interfaces.IPilha;
import pilha.PilhaDinamica;

public class GerenciadorHistorico {
    private IPilha<String> pilhaVoltar;
    private IPilha<String> pilhaAvancar;
    private String paginaAtual;

    public GerenciadorHistorico() {
        //encapsulamento das estruturas
        this.pilhaVoltar = new PilhaDinamica<>();
        this.pilhaAvancar = new PilhaDinamica<>();
        this.paginaAtual = "Página Inicial";
    }

    public void visitarPagina (String novaURL) {
        if (paginaAtual != null) {
            pilhaVoltar.push(paginaAtual); //
        }

        //Aqui ao visitar um novo link, limpa o historico de avançar
        pilhaAvancar.liberar();
        paginaAtual = novaURL;
        System.out.println("Visitando: " + paginaAtual);
    }

    //Criando o botão de voltar
    public void voltar() {
        if (pilhaVoltar.estaVazia()) {
            System.out.println("Não tem histórico para voltar");
            return;
        }
        pilhaAvancar.push(paginaAtual); //guardando a atual para avancar depois
        paginaAtual = pilhaVoltar.pop();
        System.out.println("Voltou para: " +  paginaAtual);

    }

    //Criando o botão de voltar
    public void avancar() {
        if (pilhaAvancar.estaVazia()) {
            System.out.println("Não tem histórico para avançar.");
            return;
        }
        pilhaVoltar.push(paginaAtual); //guardando a atual para avancar depois
        paginaAtual = pilhaAvancar.pop();
        System.out.println("Avançou para: " +  paginaAtual);
    }

    public void exibirEstado() {
        System.out.println("Paginal Atual: " + paginaAtual);
        System.out.println("Histórico Voltar: "); pilhaVoltar.imprimir();
        System.out.println("Histórico Voltar: "); pilhaAvancar.imprimir();

    }

}
