package pilha;

public class PilhaDinamica<T> {

    protected static class No<T> { // O Nó é como cada elo da corrente.
        T informacao;
        No<T> proximo; // Cada elo segura a mão do elo que está em baixo dele.

        No(T informacao) {
            this.informacao = informacao; // Faz o encapsulamento
            this.proximo = null; // Faz o encapsulamento
        }
    }

    private No<T> topo; // Atrela o nó do topo
    private int tamanho; // guarda o valor do tamanho

    public PilhaDinamica() {
        this.topo = null; //A pilha dinâmica começa com o topo nulo e valor zero
        this.tamanho = 0;
    }

    public void push(T elemento) {
        No<T> novoNo = new No<>(elemento); //Instancia a parte da lista T uma nova lista com No
        novoNo.proximo = topo; // O novo elo segura a mão de quem era o topo antes.
        topo = novoNo; // O novo elo agora é o novo topo da corrente.
        tamanho++; //Aumenta o tamanho
    }

    public T pop() {
        if (estaVazia()) {
            throw new RuntimeException("Underflow: Não tem nada!"); //Só não crasha se não tem nada
        }
        T valor = topo.informacao;
        topo = topo.proximo; // O topo agora passa a ser quem estava em baixo dele.
        tamanho--; //Diminui o valor e só retornar
        return valor;
    }

    public T peek() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia"); //Só diz que tá vazia
        }
        return topo.informacao; //Mostra o topo da informação
    }

    public int busca(T elemento) {
        No<T> atual = topo; //A partir do topo
        int indice = tamanho - 1; //Vai procurar o indice do elemento T que está procurando
        while (atual != null) { // Vou a seguir a corrente, de mão em mão, até o fim.
            if (atual.informacao.equals(elemento)) { //Se os valores baterem
                return indice; //Retorna o indice
            }
            atual = atual.proximo; //Enquanto não achar
            indice--; //vai passar o indice.
        }
        return -1; //Ao final, se não tiver, só retorna -1
    }

    public boolean estaVazia() { return topo == null; }

    public void imprimir() {
        if (estaVazia()) {
            System.out.println("Pilha vazia");
            return; //Se não tiver nada, só retorna a pilha
        }
        No<T> atual = topo;
        System.out.println("Topo dinâmico");
        while (atual != null) {
            System.out.println("[" + atual.informacao + "]");
            atual = atual.proximo; //No topo dinamico, imprime a informação atual
        }
        System.out.println("Base");
    }

    public void liberar() {
        topo = null; // Eu solto a mão do primeiro elo. Como ninguém segura mais ninguém, o Java limpa tudo.
        tamanho = 0; //Volta o tamanho da lista para zero
    }

    public int tamanho() { return tamanho; }

    public static void main(String[] args) {
        System.out.println("--- Testando Pilha Dinâmica ---");
        PilhaDinamica<String> p = new PilhaDinamica<>();

        p.push("Primeiro");
        p.push("Segundo");
        p.push("Terceiro");

        // Usando os métodos que estavam "esquecidos":
        System.out.println("Espiando o topo: " + p.peek());
        System.out.println("Onde está o 'Primeiro'? " + p.busca("Primeiro"));
        System.out.println("Tamanho da corrente: " + p.tamanho());

        p.imprimir();
        p.liberar();
        System.out.println("Depois de liberar, está vazia? " + p.estaVazia());
    }
}