public class EscalonadorDeProcessos {

    public static void main(String[] args) {


        FilaDinamica fila = new FilaDinamica();

        fila.enfileirar(10, 5);
        fila.enfileirar(1, 2);
        fila.enfileirar(30, 1);


        System.out.println("Fila inicial:");
        fila.imprimir();

        while (!fila.isEmpty()) {


            int maior = -1;
            FilaDinamica.No atual = fila.inicio;

            while (atual != null) {
                if (atual.valor > maior) {
                    maior = atual.valor;

                }
                atual = atual.prox;

            }

            FilaDinamica.No anterior = null;
            atual = fila.inicio;

            

            while (atual != null) {
                if (atual.valor == maior) {
                    System.out.println("Prioridade: " + atual.valor + " (tempo: " + atual.tempo + ")") ;

                    if (anterior == null){
                        fila.inicio = atual.prox;
                    }
                    else{
                        anterior.prox = atual.prox;
                    }

                    if (atual == fila.fim){
                        fila.fim = anterior;
                    }
                    fila.tamanho--;
                    break;
                }
                anterior = atual;
                atual = atual.prox;
            }

            System.out.print("Fila restante: ");
            fila.imprimir();
        }

    }
}
