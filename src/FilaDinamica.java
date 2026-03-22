public class FilaDinamica {

    protected static class No {
        int valor;
        int tempo;
        No prox;

        No(int valor, int tempo){
            this.valor = valor;
            this.tempo=tempo;
        }
        No(int valor){
            this.valor = valor;
        }
    }


    protected No inicio;
    protected No fim;
    protected int tamanho;

    public void enfileirar(int valor, int tempo){

        No novo = new No(valor, tempo);


        if(isEmpty()){
            inicio = novo;
        } else{
            fim.prox = novo;
        }

        fim = novo;

        tamanho++;

    }
    
    public void enfileirar(int valor){

        No novo = new No(valor);


        if(isEmpty()){
            inicio = novo;
        } else{
            fim.prox = novo;
        }

        fim = novo;

        tamanho++;

    }

    public void desenfileirar(){

        if (isEmpty()){
            System.out.println("Fila está vazia");
            return;
        }

        int valor = inicio.valor;

        inicio = inicio.prox;

        if(inicio == null){
            fim = null;
        }
        tamanho--;

    }
    public Integer frente() {

        if (isEmpty())
            return null;

        return inicio.valor;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    // Retorna quantidade
    public int tamanho() {
        return tamanho;
    }

    // Imprime fila
    public void imprimir() {

        No atual = inicio;

        while (atual != null) {
            System.out.print(atual.valor + " (tempo: " + atual.tempo + ") " +" ");
            atual = atual.prox;
        }

        System.out.println();
    }


    public boolean buscar(int valorDesejado) {

        No atual = inicio;
        while (atual != null) {

            if (atual.valor == valorDesejado) {

                return true;
            }
            atual = atual.prox;
        }

        return false;
    }

    public static void main(String[] args) {
        FilaDinamica fila = new FilaDinamica();

        System.out.println("--- Testando Enfileiramento ---");
        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);
        System.out.print("Fila atual: ");
        fila.imprimir(); // Esperado: 10 20 30

        System.out.println("\n--- Testando Informações ---");
        System.out.println("Tamanho da fila: " + fila.tamanho()); // Esperado: 3
        System.out.println("Elemento na frente: " + fila.frente()); // Esperado: 10

        System.out.println("\n--- Testando Busca ---");
        System.out.println("Existe o valor 20? " + (fila.buscar(20) ? "Sim" : "Não")); // Sim
        System.out.println("Existe o valor 50? " + (fila.buscar(50) ? "Sim" : "Não")); // Não

        System.out.println("\n--- Testando Desenfileiramento ---");
        fila.desenfileirar(); // Remove o 10
        System.out.print("Fila após remover um: ");
        fila.imprimir(); // Esperado: 20 30

        System.out.println("Novo elemento na frente: " + fila.frente()); // Esperado: 20

        System.out.println("\n--- Esvaziando a fila ---");
        fila.desenfileirar();
        fila.desenfileirar();
        System.out.println("Fila está vazia? " + (fila.isEmpty() ? "Sim" : "Não")); // Sim

        // Testando erro de subfluxo (underflow)
        fila.desenfileirar(); // Deve imprimir: "Fila está vazia"
    }



}
