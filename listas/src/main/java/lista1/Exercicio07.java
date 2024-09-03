package lista1;

import java.util.Scanner;

public class Exercicio07 { 
    public static void resolucao(){
        System.out.println(
            "7) Escreva um programa que receba quatro notas de\n"+
            "um aluno e calcule a média aritmética dessas notas\n");
        Scanner leia = new Scanner(System.in);

        String aluno;
        float nota1, nota2, nota3, nota4, media;

        System.out.print("Digite o nome do(a) aluno(a): ");
        aluno = leia.nextLine();

        System.out.print("Digite a primeira nota: ");
        nota1 = leia.nextFloat();

        System.out.print("Digite a segunda nota: ");
        nota2 = leia.nextFloat();

        System.out.print("Digite a terceira nota: ");
        nota3 = leia.nextFloat();

        System.out.print("Digite a quarta nota: ");
        nota4 = leia.nextFloat();

        media = ((nota1+nota2+nota3+nota4)/4);

        System.out.println("\nAluno(a): "+aluno+" | Média: "+media
                            +"\t| Nota 1: "+nota1+"\t| Nota 2: "+nota2
                            +"\t| Nota 3: "+nota3+"\t| Nota 4: "+nota4);

        leia.close();

    }

}
