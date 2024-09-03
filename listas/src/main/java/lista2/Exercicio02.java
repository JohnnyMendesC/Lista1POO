package lista2;
import java.util.Scanner;

public class Exercicio02 {
    public static void resolucao(){
        System.out.println(
            "Desenvolva um algoritmo que seja capaz de receber dois números digitados\n"
            +"pelo usuário e diga qual deles é maior.");
        
        Scanner leia = new Scanner(System.in);

        int num1, num2;
        
        System.out.println("Digite o primeiro número: ");
        num1 = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = leia.nextInt();

        if (num1 > num2){
            System.out.println("O número "+num1+" é maior que o número "+num2);
        } 
        else if (num2 > num1){
            System.out.println("O número "+num2+" é maior que o número "+num1);
        }
        else if (num1 == num2){
            System.out.println("Os números são iguais");
        }
        else {
            System.out.println("Esta opção não é reconhecida");
        }
        leia.close();
    }

}
