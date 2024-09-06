package lista4;

public class Exercicio04 {
    public static void resolucao(){
        System.out.println("==========================================================================");
        System.out.println(
            "4) Escreva um código que irá percorrer uma lista de números inteiros\n"
            +"lista[] = {3, 5, 6, 7, 8, 10, 22, 55, 110} e irá contar a quantidade\n"
            +"de números pares presentes nela.\n"
        );

        int[] lista = {3, 5, 6, 7, 8, 10, 22, 55, 110};
        int numerosP=0;
        for (int i = 0; i < lista.length; i++) {            
            if (lista[i]%2==0){numerosP++;}
        }
        System.out.println("\nO total é de "+numerosP+" números pares \n\n");

    }

}
