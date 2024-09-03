package lista1;

import java.util.Scanner;

public class Exercicio02 {
    public static void resolucao(){
        System.out.println("2) Escreva um programa que pergunte o nome e o");
        System.out.println("sobrenome do usuário e escreva na tela: Olá, -usuário-");

        String nome, sobrenome;

        System.out.println("Digite seu nome: ");

        Scanner leia = new Scanner(System.in);
        nome = leia.nextLine();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = leia.nextLine();

        System.out.println("Olá, "+nome+" "+sobrenome+"!");
        leia.close();
    }

}
