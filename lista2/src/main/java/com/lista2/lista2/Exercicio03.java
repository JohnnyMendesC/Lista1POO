package com.lista2.lista2;
import java.util.Scanner;

public class Exercicio03 {
    public static void resolucao(){
        System.out.println(
            "\n3) Um banco contratou você para que escreva um programa que será utilizado\n"
            +"pelo usuário em um tablet. O programa irá fazer 3 perguntas e encaminhar o\n"
            +"cliente para 2 filas. A fila comum e a preferencial. Se o cliente antender a uma\n"
            +"das condições a seguir ele deve ser encaminhado para a fila preferencial. As\n"
            +"condições são: Ter mais de 65 anos, ser deficiente ou gestante.");
        
        Scanner leia = new Scanner(System.in);
        int opcao;
                
        System.out.println("\nBoas vindas ao auto-atendimento do BancoTec.\n"
                            +"Responda as perguntas a seguir para prosseguir para a fila indicada:");
        System.out.println("\nVocê tem mais de 65 anos? \n1-Sim\n0-Não");
        opcao=leia.nextInt();
            if (opcao==1) {
                System.out.println("Vá para a fila preferencial");
            } else {
                System.out.println("\nVocê é uma Pessoa com Deficiência(PCD)? \n1-Sim\n0-Não");
                opcao=leia.nextInt();
                if (opcao==1) {
                    System.out.println("Vá para a fila preferencial");
                } else {
                    System.out.println("\nVocê é Gestante? \n1-Sim\n0-Não");
                    opcao=leia.nextInt();
                    if (opcao==1) {
                        System.out.println("Vá para a fila preferencial");
                    } else {
                        System.out.println("Vá para a fila comum");
                    }
                }
            }  
        leia.close();      
    }
}
