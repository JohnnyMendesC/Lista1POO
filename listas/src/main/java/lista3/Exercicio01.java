package lista3;

import java.util.Scanner;

public class Exercicio01 {
    public static void resolucao(){
        System.out.println(
            "\n1) Escreva um programa que sirva como um cronômetro. O usuário deve\n"
            +"digitar um número em segundos e o programa deve contabilizar os segundos\n"
            +"digitados. O programa deve receber somente números entre 1 e 59, do contrário \n"
            +"ele deve retornar um erro e solicitar que o usuário digite um número válido\n"
        );
        Scanner leia = new Scanner(System.in);

        int segundos;
        System.out.print("\nDe 1 a 59, digite quantos segundos você deseja cronometrar: ");
        segundos = leia.nextInt();

        while(segundos<1 || segundos>59){            
                System.out.print("\nDe 1 a 59, digite quantos segundos você deseja cronometrar: ");
                segundos = leia.nextInt();            
        }

        
        if (segundos==1){System.out.println("Iniciando cronômetro com "+segundos+" segundo...");}
        else {System.out.println("Iniciando cronômetro com "+segundos+" segundos...");}
        
        for(int timer = 0; timer <= segundos; timer++){
            
            try {
                Thread.sleep(1000); // Aguarda 1 segundo                
                System.out.println("Segundos: " + timer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } //metodo try catch, o catch é caso de erro para ele nao quebrar o codigo, o try é o código executado
        }
        System.out.println("Timer finalizado!");
        leia.close();
    }
}
