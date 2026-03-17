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



}
