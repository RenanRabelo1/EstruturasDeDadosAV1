package pilha;

public class PilhaEstatica<T> { // Não seria melhor fazer um inteiro?
    // Explicação: Usamos <T> para a caixa aceitar qualquer coisa (carrinho, boneca, números). Se fosse só int, só caberia números.
    private final T[] elementos; // T é de Type, que define um Tipo Abstrato de Dados TADs
    private int topo; // Isso é um ponteiro, usado como contador. É como o seu dedo apontando para o brinquedo de cima.

    @SuppressWarnings("unchecked")
    public PilhaEstatica(int capacidade) {
        // Isso aqui é pra criar a lista né? Eu achei meio-confuso, vou precisar praticar
        this.elementos = (T[]) new Object[capacidade];
        this.topo = -1; // Começamos no -1 porque a primeira vaga da caixa é a de número 0.
    }

    public void push(T elemento) {
        if (estaCheia()) {
            // pq não precisa estabelecer um exception throws antes?
            // Explicação: É como um alarme. Se a caixa encher e você tentar colocar mais, o alarme toca!
            throw new RuntimeException("Overflow: Pilha cheia!");
        }
        elementos[++topo] = elemento; // Quando o elemento é implementado, ele é implementado no indice ++topo.
        // Primeiro subimos o dedo, depois colocamos o brinquedo. [cite: 114]
    }

    public T pop() {
        if (estaVazia()) {
            // isso é necessário pro código não crashar, eu acho
            throw new RuntimeException("Overflow: Pilha vazia!");
        }

        T valorRemovido = elementos[topo]; // Pega o bixo do topo
        elementos[topo] = null; // Limpa a memória. É como tirar o brinquedo e deixar o espaço limpinho.
        topo--; // O contador é usado como um ponteiro. O dedo desce para o brinquedo que ficou embaixo.

        return valorRemovido;
    }

    public T peek() {
        if (estaVazia()) {
            // Precisa fazer isso sempre para o código não crashar?
            throw new RuntimeException("Overflow: Pilha vazia!");
        }
        return elementos[topo]; // Você só dá uma "espiadinha" no brinquedo do topo, mas não tira ele da caixa. [cite: 117]
    }

    public int busca(T elemento) { // Percorre o Last In First Out
        for (int i = topo; i >= 0; i--) {
            if (elementos[i].equals(elemento)) {
                return i; // Retorna o Indice. Você encontrou o brinquedo e diz em qual vaga ele está! [cite: 122]
            }
        }
        return -1; // Não encontrou, então ficou com zero (ou melhor, -1 para dizer que sumiu). [cite: 123]
    }

    public boolean estaVazia() {
        return topo == -1; // Se o dedo aponta para o -1, a caixa está totalmente vazia.
    }

    public boolean estaCheia() {
        return topo == elementos.length - 1; // Se o dedo chegou na última vaga, não cabe mais nada. [cite: 113]
    }

    public void imprimir() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return;
        }
        System.out.println("Topo");
        for (int i = topo; i >= 0; i--) {
            System.out.println("[" + i + "]: " + elementos[i]);
        }
        System.out.println("Base");
    }

    public void liberar() { // Isso aqui é pra liberar a memória né? Só não sei como isso funciona
        // Explicação: É como se você tirasse todos os brinquedos da caixa de uma vez para guardar outra coisa.
        for (int i = 0; i <= topo; i++) {
            elementos[i] = null;
        }
        topo = -1; // Aqui não deveria ter algo como if else?
        // Explicação: Não precisa! A gente só avisa que o dedo agora aponta para o começo de tudo de novo.
    }

    public int tamanho() {
        return topo + 1; // Se o dedo aponta para a vaga 2, significa que temos 3 brinquedos (0, 1 e 2).
    }

    public static void main(String[] args) {
        System.out.println("--- Testando Pilha Estática ---");
        // Criamos uma caixa que cabe 5 brinquedos
        PilhaEstatica<Integer> p = new PilhaEstatica<>(5);

        System.out.println("Colocando os brinquedos 10, 20 e 30...");
        p.push(10);
        p.push(20);
        p.push(30);
        p.push(50);
        p.push(110);
        p.push(220);

        p.imprimir(); // Mostra como a pilha está agora

        System.out.println("\n--- Usando o pop() ---");
        System.out.println("Tirando o brinquedo que está bem no topo: " + p.pop());
        // Explicação: O 30 foi o último a entrar, então ele é o primeiro a sair!

        System.out.println("\nComo a pilha ficou depois de tirar um:");
        p.imprimir();

        int procurar = 20;
        int ondeEsta = p.busca(procurar);
        System.out.println("Onde está o brinquedo " + procurar + "? Está no andar: " + ondeEsta);

        System.out.println("Dando uma espiadinha (peek) no novo topo: " + p.peek());
        System.out.println("Quantos brinquedos sobraram? " + p.tamanho());

        // Explicação: O liberar é quando você decide limpar o quarto inteiro.
        // Você joga tudo que estava na caixa fora para deixar ela novinha e vazia de novo!
        System.out.println("Limpando a caixa toda...");
        p.liberar();

        System.out.println("A caixa está vazia agora? " + (p.estaVazia() ? "Sim, limpinha!" : "Não, ainda tem coisa."));
        p.imprimir();
    }
}