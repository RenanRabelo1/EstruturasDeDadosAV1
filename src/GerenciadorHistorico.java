public class GerenciadorHistorico {
    private final PilhaDinamica<String> pilhaVoltar; //Pilha para ficar salvando quando for para voltar
    private final PilhaDinamica<String> pilhaAvancar; //Pilha para ficar salvando quando for para Avançar
    private String paginaAtual;

    public GerenciadorHistorico() {
        this.pilhaVoltar = new PilhaDinamica<>(); //Criação Encapsulada
        this.pilhaAvancar = new PilhaDinamica<>(); //Criação Encapsulada
        this.paginaAtual = "Página Inicial"; //Criação Encapsulada
    }

    public void visitarPagina(String novaURL) {
        if (paginaAtual != null) {
            pilhaVoltar.push(paginaAtual); // Guardo a que eu estava no monte do passado.
        }
        pilhaAvancar.liberar(); // Se eu escolhi um caminho novo, o "futuro" antigo não existe mais.
        paginaAtual = novaURL; //A pagina atual recebe a nova URL
        System.out.println("Visitando: " + paginaAtual); //Visitando a página especifica
    }

    public void voltar() {
        if (pilhaVoltar.estaVazia()) {
            System.out.println("Não tem histórico para voltar"); //Se tiver vazia, não volta nada
            return;
        }
        pilhaAvancar.push(paginaAtual); // Antes de voltar, guardo a atual no monte do futuro.
        paginaAtual = pilhaVoltar.pop(); // Pego a última página que visitei do monte do passado.
        System.out.println("Voltou para: " + paginaAtual);
    }

    public void avancar() {
        if (pilhaAvancar.estaVazia()) {
            System.out.println("Não tem histórico para avançar."); //Se tiver vazia para avançar, não volta nada
            return;
        }
        pilhaVoltar.push(paginaAtual); // Guardo a atual no passado para poder voltar depois.
        paginaAtual = pilhaAvancar.pop(); // Pego a página do topo do monte do futuro.
        System.out.println("Avançou para: " + paginaAtual);
    }

    public void exibirEstado() {
        System.out.println("\nPagina Atual: " + paginaAtual); //Mostra a pagina atual
        System.out.print("Histórico Voltar: ");
        pilhaVoltar.imprimir(); //Mostra o que tem no histórico voltar
        System.out.print("Histórico Avançar: ");
        pilhaAvancar.imprimir(); //Mostra o que tem no histórico avançar
        System.out.println();
    }

    public static void main(String[] args) {
        GerenciadorHistorico nav = new GerenciadorHistorico();

        nav.visitarPagina("google.com");
        nav.visitarPagina("unifor.br");
        nav.visitarPagina("youtube.com");

        System.out.println("--- Testando Voltar ---");
        nav.voltar();
        nav.exibirEstado();

        // Resolvendo o aviso de "avancar() is never used":
        System.out.println("--- Testando Avançar ---");
        nav.avancar();
        nav.exibirEstado();
    }
}