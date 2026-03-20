// Zíltom
    public class ListaSimplesmenteEncadeadaDesordenada {
        private int limite;
        private No inicio;
        private int tamanho;

        public ListaSimplesmenteEncadeadaDesordenada(int limite) {
            this.limite = limite;
        }

        public void insercao(int conteudo) {
            if (this.tamanho == this.limite) {
                throw new RuntimeException("Lista está cheia");
            } else {
                No novo = new No(conteudo);
                novo.proximo = this.inicio;
                this.inicio = novo;
                ++this.tamanho;
            }
        }

        public boolean remocao(int conteudo) {
            No atual = this.inicio;

            No anterior;
            for(anterior = null; atual != null && atual.conteudo != conteudo; atual = atual.proximo) {
                anterior = atual;
            }

            if (atual == null) {
                System.out.println("Não existe esse valor");
                return false;
            } else {
                if (anterior == null) {
                    this.inicio = atual.proximo;
                } else {
                    anterior.proximo = atual.proximo;
                }

                --this.tamanho;
                return true;
            }
        }

        public boolean busca(int conteudo) {
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

            System.out.println();
        }

        public static void main(String[] args) {
            ListaSimplesmenteEncadeadaDesordenada lista = new ListaSimplesmenteEncadeadaDesordenada(5);
            System.out.println("A lista está vazia? " + lista.verificacaoVazio());
            lista.insercao(90);
            System.out.println("A lista está vazia? " + lista.verificacaoVazio());
            lista.insercao(10);
            lista.insercao(21);
            lista.insercao(400);
            lista.insercao(1);
            System.out.println("A lista está cheia? " + lista.verificacaoCheio());
            lista.impressao();
            lista.busca(400);
            lista.remocao(400);
            lista.busca(400);
            lista.impressao();
        }

        private static class No {
            int conteudo;
            No proximo;

            No(int conteudo) {
                this.conteudo = conteudo;
            }
        }
    }


