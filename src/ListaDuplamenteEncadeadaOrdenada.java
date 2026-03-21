public class ListaDuplamenteEncadeadaOrdenada {

    private static class No {
        int valor;
        No anterior;
        No proximo;

        public No(int valor) {
            this.valor = valor;
        }
    }

    private No inicio;
    private No fim;
    private int tamanho;

    // Inserção ORDENADA
    public void inserir(int valor) {

        No novo = new No(valor);

        // Lista vazia
        if (inicio == null) {
            inicio = fim = novo;
        }
        // Inserir no início
        else if (valor <= inicio.valor) {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        // Inserir no final
        else if (valor >= fim.valor) {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
        // Inserir no meio
        else {
            No atual = inicio;

            while (atual != null && atual.valor < valor) {
                atual = atual.proximo;
            }

            // inserir antes do "atual"
            novo.proximo = atual;
            novo.anterior = atual.anterior;

            atual.anterior.proximo = novo;
            atual.anterior = novo;
        }

        tamanho++;
    }

    // Remoção
    public boolean remover(int valor) {

        if (inicio == null) {
            System.out.println("Lista vazia!");
            return false;
        }

        No atual = inicio;

        while (atual != null && atual.valor != valor) {
            atual = atual.proximo;
        }

        if (atual == null)
            return false;

        // único elemento
        if (inicio == fim) {
            inicio = fim = null;
        }
        // primeiro
        else if (atual == inicio) {
            inicio = atual.proximo;
            inicio.anterior = null;
        }
        // último
        else if (atual == fim) {
            fim = atual.anterior;
            fim.proximo = null;
        }
        // meio
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

        while (atual != null && atual.valor <= valor) {

            if (atual.valor == valor) {
                System.out.println("Valor " + valor + " encontrado");
                return true;
            }

            atual = atual.proximo;
        }

        System.out.println("Valor " + valor + " não encontrado");
        return false;
    }

    // Verifica vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Impressão
    public void imprimir() {

        No atual = inicio;

        while (atual != null) {
            System.out.print(atual.valor + " <-> ");
            atual = atual.proximo;
        }

        System.out.println("null");
    }

    // Impressão reversa
    public void imprimirReverso() {

        No atual = fim;

        while (atual != null) {
            System.out.print(atual.valor + " <-> ");
            atual = atual.anterior;
        }

        System.out.println("null");
    }

    // Liberar memória
    public void liberar() {

        No atual = inicio;

        while (atual != null) {
            No temp = atual;
            atual = atual.proximo;

            temp.anterior = null;
            temp.proximo = null;
        }

        inicio = fim = null;
        tamanho = 0;

        System.out.println("Lista liberada!");
    }

    // Soma dos elementos da lista
    public int somar() {

        int soma = 0;
        No atual = inicio;

        while (atual != null) {
            soma += atual.valor;
            atual = atual.proximo;
        }

        return soma;
    }   

    public static void main(String[] args) {

        ListaDuplamenteEncadeadaOrdenada lista = new ListaDuplamenteEncadeadaOrdenada();

        lista.inserir(30);
        lista.inserir(10);
        lista.inserir(50);
        lista.inserir(20);

        System.out.print("Lista ordenada: ");
        lista.imprimir();

        lista.remover(30);

        System.out.print("Após remover 30: ");
        lista.imprimir();

        // Buscar elementos na lista
        lista.buscar(20);
        lista.buscar(70);

        // SOma dos elementos
        System.out.println("Soma dos elementos: " + lista.somar());
        // Invers da lista
        lista.imprimirReverso();

        // Liberar memória
        lista.liberar();
    }
}
