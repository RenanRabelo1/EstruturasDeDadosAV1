package pilha;

import interfaces.IPilha;

public class PilhaDinamica<T> implements IPilha<T> {
    private No<T> topo;
    private int tamanho;

    public PilhaDinamica() {
        this.topo = null; //Pilha vazia
        this.tamanho = 0;
    }

    @Override
    public void push(T elemento) {
        No<T> novoNo = new No<>(elemento);
        novoNo.setProximo(topo); //O novo bloco segura o antigo topo??
        topo = novoNo; //Vira o novo topo?
        tamanho++;
    }

    @Override
    public T pop() {
        if (estaVazia()) {
            throw new RuntimeException("Underflow: Não tem nada!");
        }
        T valor = topo.getInformacao();
        topo = topo.getProximo();
        tamanho--;
        return valor;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia");
        }
        return topo.getInformacao();
    }

    @Override
    public int busca(T elemento) {
        No<T> atual = topo;
        int indice = tamanho - 1;
        while (atual != null)  {
            if (atual.getInformacao().equals(elemento)) {
                return indice;
            }
            atual = atual.getProximo();
            indice--;
        }
        return -1;
    }

    @Override
    public boolean estaVazia() {
        return topo == null;
    }

    @Override
    public boolean estaCheia() {
        return false;
    }

    @Override
    public void imprimir() {
        if (estaVazia()) {
            System.out.println("Pilha vazia");
            return;
        }
        No<T> atual = topo;
        System.out.println("Topo dinâmico");
        while (atual != null) {
            System.out.println("[" + atual.getInformacao() + "]");
            atual = atual.getProximo();
        }
        System.out.println("Base");

    }

    @Override
    public void liberar() {
        topo = null;
        tamanho = 0;

    }

    @Override
    public int tamanho() {
        return tamanho;
    }
}
