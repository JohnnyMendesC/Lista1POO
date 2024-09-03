package lista3;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lista3.Lista3Application;

@SpringBootApplication
public class Lista3Application {
    public static void main(String[] args) {
        SpringApplication.run(Lista3Application.class, args);
        
        Scanner leia = new Scanner(System.in); 

        int opcao;

        opcao = leia.nextInt();
        leia.close();
        
        switch(opcao){
        case 1:
        Exercicio01.resolucao();
        break;

        }
    }

}
