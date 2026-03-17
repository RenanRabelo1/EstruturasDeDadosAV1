public class FilaDinamica {

private static class No {
    int valor;
    No prox;

    No(int valor){this.valor = valor;}
}


    private No inicio;
    private No fim;
    private int tamanho;

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
            System.out.print(atual.valor + " ");
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



}
