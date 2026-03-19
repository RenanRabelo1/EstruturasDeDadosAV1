package interfaces;

public interface IPilha<T> {//Não entendi pq a interface é feita aqui. Ele não precisa ser só na classe?
    void push(T elemento);
    T pop();
    T peek();
    int busca(T elemento);
    boolean estaVazia();
    boolean estaCheia();
    void imprimir();
    void liberar();
    int tamanho();

}
