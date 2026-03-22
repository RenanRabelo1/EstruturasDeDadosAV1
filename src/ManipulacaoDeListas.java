public class ManipulacaoDeListas {
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
        
    }
}
