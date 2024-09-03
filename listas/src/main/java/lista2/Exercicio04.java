package lista2;
import java.util.Scanner;

public class Exercicio04 {
    public static void resolucao(){
        System.out.println(
            "\n4) Um cliente que promove eventos e solicitou um programa que seja capaz de\n"
            +"identificar se uma pessoa é maior de idade. Pessoas com menos de 16 anos não\n"
            +"podem entrar nos eventos. Entre 16 e 18 anos somente acompanhado pelos\n"
            +"responsáveis. Maiores de 18 podem entrar normalmente.");
        
        Scanner leia = new Scanner(System.in);

        int idade;

        System.out.println("Digite a sua idade: ");
        idade = leia.nextInt();

        if (idade >= 18){
            System.out.println("Pode entrar normalmente no evento");;
        } 
        else if (idade < 18 && idade >= 16){
            System.out.println("Pode entrar no evento somente acompanhado de responsável");
        } 
        else {
            System.out.println("Não pode entrar no evento");
        }
    leia.close();
    }

}
