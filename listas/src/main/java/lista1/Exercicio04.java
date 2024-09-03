package lista1;

import java.util.Scanner;

public class Exercicio04 {
    public static void resolucao(){
        System.out.println("4) Construa um algoritmo que leia um número inteiro");
        System.out.println("na tela e responda o número antecessor e o sucessor.");

        int numero;

        System.out.println("Digite um número: ");
        Scanner leia = new Scanner(System.in);

        numero = leia.nextInt();

        System.out.println("O antecessor de "+numero+" é "+(numero-1));
        System.out.println("O sucessor de "+numero+" é "+(numero+1));
        leia.close();
    }

}
