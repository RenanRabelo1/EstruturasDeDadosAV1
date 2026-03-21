// Caique
public class ListaEstatica {
    private int[] dados;
    private int tamanho;


    public ListaEstatica(int capacidade) {
        dados = new int[capacidade];
        tamanho = 0;
    }

    // Inserir valores na Lista
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

    // Remover valores da lista
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

    // Buscar valores na lista
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

    // Retornar o tamanho da lista
    public int tamanho(){
        return tamanho;
    }

    // Imprimir a lista
    public void imprimir(){
        for (int i = 0; i < tamanho; i++) {
            System.out.println(dados[i] + " ");
        }
        System.out.println();
    }

    // Verificar se a lista está vazia
    public boolean isEmpty(){
        if (tamanho == 0){
            System.out.println("A lista está vazia");
            return true;
        }
        
        System.out.println("A lista não está vazia");
        return false;
    }
    
    // Verificar se a lista está cheia
    public boolean isFull(){
        if (tamanho == dados.length){
            System.out.println("A lista está cheia");
            return true;
        }

        System.out.println("A lista não está cheia");
        return false;
    }

    // Esvaziar a lista
    public void esvaziar(){
        tamanho = 0;
    }

    // Inverter a lista
    public void inverter(){
        int aux;
        for (int i = 0; i < tamanho/2; i++) {
            aux = dados[i];
            dados[i] = dados[tamanho - 1 - i];
            dados[tamanho - 1 - i] = aux;
        }
    }

    // Rertornar a soma dos números da lista
    public float somar(){
        float soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += dados[i];
        }
        return soma;
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

        // Buscar numeros na lista
        l.buscar(10);
        l.buscar(70);

        l.isEmpty();
        l.isFull();
        
        l.imprimir();

        // Contar elementos
        System.out.println("Tamanho da lista: " + l.tamanho());

        // Inverter lista
        l.inverter();

        l.imprimir();

        // Retornar soma
        System.out.println("Soma dos elementos da lista: " + l.somar());

        // Liberar memória
        l.esvaziar();

        System.out.println("A lista está vazia após liberar espaço? " + l.isEmpty() );

    }
}