package lista3;

import java.util.Scanner;

public class Exercicio02 {
    public static void resolucao(){
        System.out.println("==========================================================================");
        System.out.println("2) Desenvolva um programa que receba um número do usuário e escreva a tabuada dele:");

        Scanner leia = new Scanner(System.in);
        int numero;
        System.out.print("\nDigite um número para ver sua tabuada: ");
        numero = leia.nextInt();        
        
        System.out.print("\nA tabuada de "+numero+" é:\n");
        System.out.println(numero+" x 1 = "+(numero*1));
        System.out.println(numero+" x 2 = "+(numero*2));
        System.out.println(numero+" x 3 = "+(numero*3));
        System.out.println(numero+" x 4 = "+(numero*4));
        System.out.println(numero+" x 5 = "+(numero*5));
        System.out.println(numero+" x 6 = "+(numero*6));
        System.out.println(numero+" x 7 = "+(numero*7));
        System.out.println(numero+" x 8 = "+(numero*8));
        System.out.println(numero+" x 9 = "+(numero*9));
        System.out.println(numero+" x 10 = "+(numero*10));
        leia.close();
    }
}
