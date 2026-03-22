public class FilaEstatica {


    private int [] dados;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaEstatica(int capacidade){
        dados = new int [capacidade];

         inicio = 0;
         tamanho = 0;
            fim = 0;
    }

    public boolean isEmpty(){ return tamanho == 0;}



    public boolean EntrarNaFila(int valor){

    if (tamanho == dados.length){
        System.out.println("Fila está cheia");
        return false;
    }
        dados[fim]=valor;

        fim = (fim + 1) % dados.length;
        tamanho++;
        return true;
    }

    public int SairDaFila(){
        if (isEmpty()){
            System.out.println("Fila Vazia");
            return -1;
        }

        int valor = dados[inicio];
        inicio = (inicio+1) % dados.length;
        tamanho--;
        return valor;
    }

    public int peek(){
        return dados[inicio];
    }

    public void ListaInteira(){

        for(int i = 0; i < tamanho; i++){

            int indice = (inicio+i) % dados.length;
            System.out.println(i+1 + "°:" + dados[indice]);
        }
        System.out.println();
    }

    public int Tamanho(){return tamanho;}

    public int Ultimo(){
        int indiceUltimo = (inicio + tamanho - 1) % dados.length;
        return dados[indiceUltimo];
    }


    public boolean buscar(int valor) {


        for (int i = 0; i < tamanho; i++) {

            int indice = (inicio + i) % dados.length;


            if (dados[indice] == valor) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        // Criamos uma fila com capacidade para 5 elementos
        FilaEstatica fila = new FilaEstatica(5);

        System.out.println("--- Testando Inserção ---");
        fila.EntrarNaFila(10);
        fila.EntrarNaFila(20);
        fila.EntrarNaFila(30);
        fila.EntrarNaFila(40);
        fila.EntrarNaFila(50);

        System.out.println("Fila cheia? Tente inserir o 60:");
        fila.EntrarNaFila(60); // Deve imprimir "Fila está cheia"

        System.out.println("\n--- Estado Atual da Fila ---");
        fila.ListaInteira();
        System.out.println("Tamanho atual: " + fila.Tamanho());
        System.out.println("Primeiro da fila (peek): " + fila.peek());
        System.out.println("Último da fila: " + fila.Ultimo());

        System.out.println("\n--- Testando Remoção e Circularidade ---");
        System.out.println("Removido: " + fila.SairDaFila()); // Remove o 10
        System.out.println("Removido: " + fila.SairDaFila()); // Remove o 20

        System.out.println("Fila após remover dois:");
        fila.ListaInteira();

        System.out.println("Inserindo 70 e 80 (vão para o 'início' do array via %):");
        fila.EntrarNaFila(70);
        fila.EntrarNaFila(80);
        fila.ListaInteira();

        System.out.println("\n--- Testando Busca ---");
        int procurar = 40;
        System.out.println("O valor " + procurar + " está na fila? " + (fila.buscar(procurar) ? "Sim" : "Não"));

        procurar = 100;
        System.out.println("O valor " + procurar + " está na fila? " + (fila.buscar(procurar) ? "Sim" : "Não"));
    }
}
