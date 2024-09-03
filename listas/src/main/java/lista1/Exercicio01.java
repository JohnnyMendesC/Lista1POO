package lista1;

import java.util.Scanner;

public class Exercicio01 {
    public static void resolucao(){
        System.out.println("1) Escreva um programa que faça a soma entre 2 números");
        int numero1, numero2;

        System.out.print("Digite o primeiro número: ");

        Scanner leia = new Scanner(System.in);

        numero1 = leia.nextInt();

        System.out.print("Digite o segundo número: ");

        numero2 = leia.nextInt();

        System.out.println("A soma entre "+numero1+" e "+numero2+" é = "+(numero1+numero2));

        leia.close();

    }

}
