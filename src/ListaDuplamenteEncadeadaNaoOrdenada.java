public class ListaDuplamenteEncadeadaNaoOrdenada {

    // Classe do nó
    private static class No {
        int valor;
        No anterior;
        No proximo;

        public No(int valor) {
            this.valor = valor;
            this.anterior = null;
            this.proximo = null;
        }
    }

    private No inicio;
    private No fim;
    private int tamanho;
    private int capacidade; 

    public ListaDuplamenteEncadeadaNaoOrdenada(int capacidade) {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
        this.capacidade = capacidade;
    }

    // Inserção (no final)
    public boolean inserir(int valor) {

        if (estaCheia()) {
            System.out.println("Lista cheia!");
            return false;
        }

        No novo = new No(valor);

        if (estaVazia()) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }

        tamanho++;
        return true;
    }

    // Remoção
    public boolean remover(int valor) {

        if (estaVazia()) {
            System.out.println("Lista vazia!");
            return false;
        }

        No atual = inicio;

        while (atual != null && atual.valor != valor) {
            atual = atual.proximo;
        }

        if (atual == null) {
            return false;
        }

        // Removendo o único elemento
        if (inicio == fim) {
            inicio = fim = null;
        }
        // Removendo o primeiro
        else if (atual == inicio) {
            inicio = atual.proximo;
            inicio.anterior = null;
        }
        // Removendo o último
        else if (atual == fim) {
            fim = atual.anterior;
            fim.proximo = null;
        }
        // Removendo do meio
        else {
            atual.anterior.proximo = atual.proximo;
            atual.proximo.anterior = atual.anterior;
        }

        tamanho--;
        return true;
    }

    // Busca
    public boolean buscar(int valor) {

        No atual = inicio;

        while (atual != null) {
            if (atual.valor == valor) {
                System.out.println("Valor " + valor + " encontrado");
                return true;
            }
            atual = atual.proximo;
        }

        System.out.println("Valor " + valor + " não encontrado");
        return false;
    }

    // Verificar vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Verificar cheia
    public boolean estaCheia() {
        return tamanho == capacidade;
    }

    // Impressão (início -> fim)
    public void imprimir() {

        No atual = inicio;

        while (atual != null) {
            System.out.print(atual.valor + " <-> ");
            atual = atual.proximo;
        }

        System.out.println("null");
    }

    // Impressão reversa (extra)
    public void imprimirReverso() {

        No atual = fim;

        while (atual != null) {
            System.out.print(atual.valor + " <-> ");
            atual = atual.anterior;
        }

        System.out.println("null");
    }

    // Liberação de memória
    public void liberar() {

        No atual = inicio;

        while (atual != null) {
            No temp = atual;
            atual = atual.proximo;

            temp.anterior = null;
            temp.proximo = null;
        }

        inicio = null;
        fim = null;
        tamanho = 0;

        System.out.println("Lista liberada!");
    }

    public static void main(String[] args) {

        ListaDuplamenteEncadeadaNaoOrdenada lista = new ListaDuplamenteEncadeadaNaoOrdenada(5);

        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);

        System.out.print("Lista: ");
        lista.imprimir();

        lista.remover(20);

        System.out.print("Após remover 20: ");
        lista.imprimir();

        lista.buscar(10);
        lista.buscar(50);

        System.out.println("Está vazia? " + lista.estaVazia());
        System.out.println("Está cheia? " + lista.estaCheia());

        lista.imprimirReverso();

        lista.liberar();

        System.out.println("Está vazia após liberar? " + lista.estaVazia());
    }
}
