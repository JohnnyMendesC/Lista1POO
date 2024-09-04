package lista3;

import java.util.Scanner;

public class Exercicio06 {
    public static void resolucao(){
        System.out.println("==========================================================================");
        System.out.println(
            "6) Escreva um programa que seja capaz de desenhar uma pirâmide de\n"
            +"asteriscos. O usuário deverá informar quantos andares ele deseja que a\n"
            +"pirâmide tenha.\n"
        );
    
        Scanner leia = new Scanner(System.in);

        int andaresDesejados;
        int andaresFaltando;
        System.out.print("Vamos construir uma Pirâmide. Quantos andares você deseja construir? ");
        andaresDesejados = leia.nextInt();
        leia.close();

        //Parametros:
        int andaresConstruídos=0;
        andaresFaltando=andaresDesejados;

        System.out.println("\nMuito bem! Aqui está sua pirâmide com "+andaresDesejados+" andares:\n");
        while(andaresDesejados!=andaresConstruídos){
            for(int numeroEspacos=0; numeroEspacos<(andaresFaltando); numeroEspacos++){
                System.out.print(" ");
            }
            for(int numeroAsteriscos=0; numeroAsteriscos<=(andaresConstruídos); numeroAsteriscos++){
                System.out.print("* ");
            }            
            System.out.print("\n");

            //cumpriu a tarefa, conclui o andar e risca ele da lista faltante:
            andaresConstruídos++;
            andaresFaltando--;
        }
        System.out.println("\nO que achou de sua nova pirâmide?\nDivirta-se com ela ou construa outras de tamanhos variados!!!\n");

    }
    /*
    TESTES PARA ENTENDER A LÓGICA DA CONSTRUÇÃO DA PIRÂMIDE E FAZE-LA SER MODULAR, 
    OU SEJA PARA ELA TER TAMANHO DINÂMICO E NÃO SÓ UM CONJUNTO PRE-DESENHADO
    
    1 andar:
    * 0espaços 1asterisco

    2 andares:
     *      1espaço1ast
    * *     0espço2ast
            1et   3at

    3 andares:
      *     2espaço1ast
     * *    1espaço2ast
    * * *   0espaço3ast
            3et    6at

        6 andares:
         *          5espaços1asterisco
        * *         4esp2ast
       * * *        3esp3ast
      * * * *       2esp4ast
     * * * * *      1esp5ast
    * * * * * *     0esp6ast
                    15et 21at
    
    No final não foi necessário utilizar o et e at(espaços total e astericos total)

    Se resolveu o problema analisando que o numero de espaços e de asteriscos são
    "fixos" porém opostos. 

    Daí surge a ideia de implementar algo que acompanhe esta lógica dentro do "for"
    entretanto sem quebrar o while que garante a repetição do sistema até sua completude

    Foi observado que uma aumenta enquanto a outra diminui.
    Com isso são criadas as variáveis:

    - andaresDesejados: que é o input do usuário de quantos andares ele quer

    - andaresConstruídos: que começa em zero e sobe conforme eles são de fato construidos
    - andaresFaltando: que começa com o valor igual ao número desejado de andares e diminui


    Agora é só atribuir cada variavel do "for" a uma das duas lógicas:
    O número de asteriscos(numeroAsteriscos) começa em 1 aumenta conforme a pirâmide se aproxima
    da base
    - com isso ela acompanha o valor da variavel andaresConstruídos, que começa em 0 e termina
    no valor total quando chega na base onde todos andares estão construídos

    o número de espaços(numeroEspacos) começa no valor máximo e diminui até 0 conforme a pirâmide chega
    mais proxima da base
    - com isso ela acompanha o valor da variavel andaresFaltando, que começa faltando o total de andares
    e termina em 0 faltando quando chega no ultimo andar

    Ou seja
    int andaresDesejados atribui int andaresFaltando // por exemplo 6 andares
    int andaresConstruidos=0

    int numeroAsteriscos trabalha com andaresConstruídos para começar de baixo e subir (0 até 6)
    int numeroEspacos trabalha com andaresFaltando para começar de cima e descer (6 até 0)

    O While executa os dois "for" acima e antes de repetir o loop ele faz:
    andaresConstruídos++
    andaresFaltando--
    Para garantir a lisura do próximo andar.
    Até que o andaresConstruidos seja igual ao andaresDesejados e finalize a operação toda!
     */

}
