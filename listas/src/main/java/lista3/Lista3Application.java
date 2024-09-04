package lista3;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lista3Application {

    public static void main(String[] args) {
        SpringApplication.run(Lista3Application.class, args);
        
        Scanner leiaopcao = new Scanner(System.in); 

        int opcao;
        System.out.print(
            "\n\n==========================================================================\n"
            +"Boas vindas a Lista de Exercicios 3 do Professor Arthur - SerraTec 2024-2\n"
            +"Escolha um dos 7 exercícios digitando de 1 a 7 ou digite 0 para sair: "
            );

        opcao = leiaopcao.nextInt();        
        switch(opcao){
        case 1:
        Exercicio01.resolucao();
        break;
        case 2:
        Exercicio02.resolucao();
        break;

        case 0:
        System.out.println("Encerrando aplicação");
        break;
        default:
        System.out.println("Digite uma opção entre 1 e 7");

        }
        leiaopcao.close();
    }

}
