package com.lista2.lista2;

import java.util.Scanner;

public class Exercicio07 {
    public static void resolucao(){
        System.out.println(
            "\n7) Escreva um programa Identificador de Divisibilidade, isto é, que identifique se\n"
            +"um determinado número informado pelo usuário é divisível por X (Que também de ser\n"
            +"informado pelo usuário)");
        
        Scanner leia = new Scanner(System.in);
        float numero1, numero2;

        System.out.println("Digite o primeiro número: ");
        numero1=leia.nextFloat();
        System.out.println("Digite o segundo número: ");
        numero2=leia.nextFloat();

        if (numero1==0 && numero2 ==0){
            System.out.println("\nDivisão não realizada pois não é possível dividir por zero\n"
                                +"Logo: \n"+numero1+"/"+numero2+" = "+numero1/numero2);
        }
        else if (numero1==0 || numero2 ==0){
            System.out.println("\nZero dividido por qualquer número é igual a zero\n"
                                +"Qualquer número dividido por zero é uma indeterminação matemática"
                                +"\nLogo: \n"+numero1+"/"+numero2+" = "+numero1/numero2
                                +"\n"+numero2+"/"+numero1+" = "+numero2/numero1);
        }

        else if (numero1==numero2){
            System.out.println("Os números são iguais, portanto tem resto = "+numero1%numero2+"\n"
            +"E sua divisão sempre será = "+numero2/numero1);
        }

        else if (numero1%numero2==0){
            System.out.println("O primeiro número é divisível pelo segundo pois tem resto = "+numero1%numero2+" | "
            +"Resolução: "+numero1+"/"+numero2+" = "+(numero1/numero2)
            +"\nO segundo dividido pelo primeiro tem resto = "+numero2%numero1+" portanto não é divisível por ele e seu resultado "
            +"é "+numero2+"/"+numero1+" = "+numero2/numero1);
        }
        else if (numero2%numero1==0){
            System.out.println("O segundo número é divisível pelo primeiro pois tem resto = "+numero2%numero1+" | "
            +"Resolução: "+numero2+"/"+numero1+" = "+(numero2/numero1)
            +"\nO primeiro dividido pelo segundo tem resto = "+numero1%numero2+" portanto não é divisível por ele e seu resultado "
            +"é "+numero1+"/"+numero2+" = "+numero1/numero2);
        }
        else {
            System.out.println("Um não é divisível pelo outro pois ambas operações tem resto diferente de 0\n"
            +"Primeiro dividido pelo Segundo tem resto = "+numero1%numero2+" | "
            +"Resolução: "+numero1+"/"+numero2+" = "+(numero1/numero2)+"\n"
            +"Segundo dividido pelo Primeiro tem resto = "+numero2%numero1+" | "
            +"Resolução: "+numero2+"/"+numero1+" = "+(numero2/numero1));

        }
    }
}
