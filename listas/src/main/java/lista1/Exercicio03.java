package lista1;

import java.util.Scanner;

public class Exercicio03 {
    public static void resolucao(){
        System.out.println("3) Escreva uma calculadora que receba um valor em reais");
        System.out.println("e converta para dólar. Considere o valor do dólar a R$5,25");

        float reais, dolar;

        System.out.print("Diga o valor em reais que será convertido para dólar: R$");
        Scanner leia = new Scanner(System.in);

        reais = leia.nextFloat();

        dolar = (reais/(5.25f));

        System.out.println("O valor em dólar é de: $"+dolar);
        leia.close();

        
    }

}
