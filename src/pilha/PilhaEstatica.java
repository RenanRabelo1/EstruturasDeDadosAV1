package pilha;

import interfaces.IPilha;

public class PilhaEstatica<T> implements IPilha<T> { //Não seria melhor fazer um inteiro
    private T[] elementos; //T é de Type, que pega um Tipo Abstrato de Dados TADs
    private int topo; //Isso é um ponteiro, usado como contador

    @SuppressWarnings("unchecked")
    public PilhaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; //Isso aqui é pra criar a lista né? Eu achei meio confuso, vou precisar praticar
        this.topo = -1; //Se um elemento é adicionado, ele fica 0. Com outro, fica 1 e assim por diante.
    }


    @Override
    public void push(T elemento) {
        if (estaCheia()) {
            throw new RuntimeException("Overflow: Pilha cheia!"); //pq não precisa estabelecer um exception throws antes?
        }
        elementos[++topo] = elemento; //Quando o elemento é implementado, ele é implementado no indice ++topo
    }

    @Override
    public T pop() {
        if (estaVazia()) {
            throw new RuntimeException("Overflow: Pilha vazia!"); //isso é necessário pro código não crashar, eu acho
        }

        T valorRemovido =  elementos[topo]; //Pega o bixo do topo
        elementos[topo] = null; // limpa a memoria
        topo--; //O contador é usado como um ponteiro

        return valorRemovido;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new RuntimeException("Overflow: Pilha vazia!"); //Precisa fazer isso sempre para o código não crashar?
        }
        return elementos[topo];
    }

    @Override
    public int busca(T elemento) { //Percorre o Last In First Out
        for (int i = topo; i >= 0; i--) {
            if (elementos[i].equals(elemento)) {
                return i; //Retorna o Indice
            }
        }
        return -1; //Não encontrou, então ficou com zero
    }

    @Override
    public boolean estaVazia() {
        return topo == -1;
    }

    @Override
    public boolean estaCheia() {
        return topo == elementos.length -1;
    }

    @Override
    public void imprimir() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return;
        }
        System.out.println("Topo");
        for (int i = topo; i >= 0; i--) {
            System.out.println("[" + i + "]: " + elementos[i]);
        }
        System.out.println("Base");
    }

    @Override
    public void liberar() {  //Isso aqui é pra liberar a memória né? Só não sei como isso funciona
    for (int i =0; i <= topo; i++) {
        elementos[i] = null; //
    }
    topo = -1; //Aqui não deveria ter algo como if else?
    }

    @Override
    public int tamanho() {
        return topo + 1;
    }
}
