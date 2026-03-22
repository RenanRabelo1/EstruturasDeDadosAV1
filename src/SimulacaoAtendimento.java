import java.util.Random;

public class SimulacaoAtendimento {

    public static void main(String[] args) {

        FilaDinamica fila = new FilaDinamica(); // Aqui estou intanciando a fila
        Random numeroAleatorio = new Random(); /* Já que é uma simulação, eu vou utilizar aleatoriedade
        para simular tanto se uma pessoa nova entra na fila, tanto o tempo de atendimento (a variável logo abaixo dessa)
*/

        int tempoAtendimentoRestante = 0;


        /* Aqui basicamente eu tô criando uma variável pra me dizer se o ''guichê'' tá ocupado ou não,
        se ele não tiver, essa variável seria igual a 0.
         */



//Professor, aqui vou simular a fila de atendimento de um banco especificamente.
        System.out.println("--Começando Simulação--");

// Vamo supor, vou simular num caso de 20 minutos de funcionamento
        for (int tempoAtual = 1; tempoAtual <= 20; tempoAtual++){

            //Agora toda vez que voltar pro for, ele vai simular cada minuto da simulação conforme incrementa
            System.out.println("Minuto " + tempoAtual + " da simulação");

            /*Agora vou usar a aleatoriedade, vou botar uma chance de 50% de aparecer alguma pessoa a cada minuto
            na teoria, isso significa que aparece em média 1 pessoa a cada 2 minutos*/
            if(numeroAleatorio.nextInt(100) < 50){

                fila.enfileirar(tempoAtual);
                /* Pode parecer um pouco confuso o fato de eu ter enfileirado o tempo atual que a pessoa
                chega, mas é basicamente assim, para simular a pessoa, ela é como se fosse o próprio ticket que
                ela pega para ser atendida, lá no voucher sempre tem o tempo de chegada dela, que funciona como se
                fosse a ordem de atendimento, ou seja, o horário de chegada dela, simboliza ela mesma dentro da
                simulação
                 */
                System.out.println("Um cliente chegou na fila");
            }

            if(tempoAtendimentoRestante > 0){
                //Como eu disse antes, caso seja maior que 0, estaria ocupado o atendimento.
                tempoAtendimentoRestante--;
                System.out.println("Caixa ocupado, faltam " + tempoAtendimentoRestante + " minutos para liberar");

            } else if(!fila.isEmpty()){
                /*Como o isEmpty é um booleano, se eu peço !isEmpty, eu basicamente quero que me diga
                se a fila não está vazia, e como usei ''else if'' eu estou usando um else no tempo de
                 atendimento sendo maior que 0, ou seja, nesse caso, a validação desse else if iria ocorrer
                 se a fila não estivesse vazia e o caixa está livre, ou seja, o próximo da fila iria para
                 o caixa*/

                int tempoChegada = fila.frente();
                //Aqui eu tô guardando a hora que o cliente chegou na variável tempoChegada
                fila.desenfileirar();
                //Aqui estou diminuindo a fila, ou seja, o antigo primeiro da fila está sendo atendido

                int tempoEspera = tempoAtual - tempoChegada;
                /* Agora eu pego a variável anterior que eu guardei da hora que ele chegou e subtraio do minuto
                atual, assim eu sei quantos minutos ele ficou esperando*/

                System.out.println("Cliente atendido, ele esperou na fila: " + tempoEspera + " minutos");

                tempoAtendimentoRestante = numeroAleatorio.nextInt(1) + 2;
                        /*O tempo de atendimento também é algo que depende, então novamente eu vou usar a
                variável que me gera números aleatórios para me aleatoriezar o tempo de atendimento, pûs um máximo
                e um mínimo também*/

            } else {
                System.out.println("Caixa livre e ninguém na fila");
                /*Também pode ocorrer o fato de não ter ninguém na fila e também ninguém sendo atendido, será nosso
                último else */
            }

        }

        System.out.println("Fim do expediente! sobraram na fila: " + fila.tamanho() + " pessoas");
        /* E agora, fora do lastro de repetição, pode ter sobrado alguém na fila e não ter sido atendido
        o que também pode acontecer, porque passou do horário de atendimento
         */

    }



}
