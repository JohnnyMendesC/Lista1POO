package lista4;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lista4Application {

    public static void main(String[] args) {
        SpringApplication.run(Lista4Application.class, args);

        Scanner leiaopcao = new Scanner(System.in); 

        int opcao;        
        System.out.print(
            "\n\n==========================================================================\n"
            +"Boas vindas a Lista de Exercicios 4 do Professor Arthur - SerraTec 2024-2\n"
            +"Escolha um dos 8 exercícios digitando de 1 a 8 ou digite 0 para sair: "
            );
            
        opcao = leiaopcao.nextInt();

        switch(opcao){
            case 1:
            Exercicio01.resolucao();
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