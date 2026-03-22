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
