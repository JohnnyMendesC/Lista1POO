package com.lista2.lista2;

import java.util.Scanner;

public class Exercicio01 {
    public static void resolucao(){
        System.out.println(
            "1) Escreva um programa que recebe um número digitado pelo usuário\n"
            +"e responda se o número inserido é par ou ímpar ou 0");
        
        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = leia.nextInt();

        if(numero%2==0 && numero!=0){
            System.out.println("O número "+numero+" é par");
            }
        else if (numero%2!=0){
            System.out.println("O número "+numero+" é ímpar");
            }
        else if (numero==0){
            System.out.println("O número é zero");
            }
        else {
            System.out.println(numero+" não é válido para esta operação");
            }
        leia.close();
    }
}
