// Zíltom
public class ListaSimplesmenteEncadeadaOrdenada {
    private int limite;
    private No inicio;
    private int tamanho;

    public ListaSimplesmenteEncadeadaOrdenada(int limite) {
        this.limite = limite;
    }

    public void insercao(int conteudo) {
        No novo = new No(conteudo);
        if (this.inicio != null && conteudo >= this.inicio.conteudo) {
            No atual;
            for(atual = this.inicio; atual.proximo != null && atual.proximo.conteudo < conteudo; atual = atual.proximo) {
            }

            novo.proximo = atual.proximo;
            atual.proximo = novo;
        } else {
            novo.proximo = this.inicio;
            this.inicio = novo;
        }

        ++this.tamanho;
    }

    public boolean remocao(int conteudo) {
        if (this.inicio == null) {
            return false;
        } else if (this.inicio.conteudo == conteudo) {
            this.inicio = this.inicio.proximo;
            return true;
        } else {
            No atual;
            for(atual = this.inicio; atual.proximo != null && atual.proximo.conteudo != conteudo; atual = atual.proximo) {
            }

            if (atual.proximo != null) {
                atual.proximo = atual.proximo.proximo;
                return true;
            } else {
                --this.tamanho;
                return false;
            }
        }
    }

    public boolean buscar(int conteudo) {
        No atual = this.inicio;

        while(atual != null) {
            atual = atual.proximo;
            if (atual.conteudo == conteudo) {
                return true;
            }
        }

        return false;
    }

    public boolean verificacaoVazio() {
        return this.tamanho <= 0;
    }

    public boolean verificacaoCheio() {
        return this.tamanho == this.limite;
    }

    public void impressao() {
        for(No atual = this.inicio; atual != null; atual = atual.proximo) {
            System.out.print(atual.conteudo + " ");
        }

        System.out.println("");
    }

    public static void main(String[] args) {
        ListaSimplesmenteEncadeadaOrdenada lista = new ListaSimplesmenteEncadeadaOrdenada(5);
        System.out.println("A lista está vazia?" + lista.verificacaoVazio());
        lista.insercao(78);
        System.out.println("A lista está vazia?" + lista.verificacaoVazio());
        lista.insercao(55);
        lista.insercao(2);
        lista.insercao(10);
        lista.insercao(100);
        System.out.println("A lista está vazia?" + lista.verificacaoCheio());
        lista.impressao();
    }

    public static class No {
        int conteudo;
        No proximo;

        public No(int conteudo) {
            this.conteudo = conteudo;
        }
    }
}
