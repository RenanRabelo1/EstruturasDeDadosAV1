public class ListaEstatica {
    private int[] dados;
    private int tamanho;


    public ListaEstatica(int capacidade) {
        dados = new int[capacidade];
        tamanho = 0;
    }

    public boolean inserir(int valor){
        if (tamanho == dados.length){
            System.out.println("LISTA CHEIA");
            return false;
        }else{
            dados[tamanho] = valor;
            tamanho ++;
            return true;
        }
    }

    public boolean remover(int valor){
        if (tamanho == 0){
            System.out.println("Não há nada a remover");
            return false;
        }else{
            for (int i = 0; i < tamanho; i++) {
                if(valor == dados[i]){
                    for (int j = i; j < tamanho - 1; j++) {
                        dados[j] = dados[j+1];
                    }
                    tamanho--;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean buscar(int valor){
        for (int i = 0; i<tamanho; i++) {
            if (valor == dados[i]){
                System.out.println("O valor: " + valor + " está na lista");
                return true;
            }
        }

        System.out.println("O valor: " + valor + " não está na lista");
        return false;
    }

    public int tamanho(){
        return tamanho;
    }

    public void imprimir(){
        for (int i = 0; i < tamanho; i++) {
            System.out.println(dados[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty(){
        if (tamanho == 0){
            System.out.println("A lista está vazia");
            return true;
        }

        System.out.println("A lista não está vazia");
        return false;
    }

    public boolean isFull(){
        if (tamanho == dados.length){
            System.out.println("A lista está cheia");
            return true;
        }

        System.out.println("A lista não está cheia");
        return false;
    }

    public void esvaziar(){
        tamanho = 0;
    }
    public static void main(String[] args) {
        ListaEstatica l = new ListaEstatica(5);
        l.inserir(10);
        l.inserir(20);
        l.inserir(30);
        l.inserir(40);
        l.imprimir();
        System.out.println("Tamanho da lista: " + l.tamanho());
        l.remover(20);
        l.imprimir();
        l.buscar(10);
        l.buscar(70);
        l.isEmpty();
//        l.remover(10);
//        l.remover(30);
//        l.remover(40);
        l.isEmpty();
        l.isFull();
        l.imprimir();
        l.esvaziar();
    }
}

