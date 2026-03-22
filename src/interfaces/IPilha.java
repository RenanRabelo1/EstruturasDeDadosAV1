package interfaces;

public interface IPilha<T> {
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
