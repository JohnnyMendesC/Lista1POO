package lista1;

import java.util.Scanner;

public class Exercicio05 {
    public static void resolucao(){
        System.out.println("5)Construa um algoritmo que calcule o valor de");
        System.out.println("um terreno baseado na sua área e valor por m2\n");

        Scanner leia = new Scanner(System.in);

        float comprimento, largura, area, valorm2, valorterreno;

        System.out.println("Digite o comprimento do terreno em metros:");
        comprimento = leia.nextFloat();

        System.out.println("Digite a largura do terreno em metros:");
        largura = leia.nextFloat();

        area = (comprimento*largura);

        System.out.print("Digite o valor do metro quadrado na região do terreno: R$");
        valorm2 = leia.nextFloat();

        valorterreno = (area*valorm2);

        System.out.println("\nO terreno custa R$"+valorterreno+" nos seguintes parametros:");
        System.out.println("Area: "+area+"m² | Valor do m²: R$"+valorm2+" | Valor do Terreno: R$"+valorterreno);
        
        
        leia.close();
    }

}
