package lista1;

import java.util.Scanner;

public class Exercicio08 {
    public static void resolucao(){
        System.out.println(
            "8) Suponha que você trabalhe em um laboratório e seu\n"
            +"colega mediu a temperatura de um objeto em Fahrenheit.\n"
            +"Escreva um programa capaz de converter Fahrenheit em Celsius\n");

        Scanner leia = new Scanner(System.in);

        float fahrenheit, celsius, kelvin;

        System.out.println("Digite a temperatura fornecida em Fahrenheit: ");
        fahrenheit = leia.nextFloat();

        celsius = ((fahrenheit-32)/1.8f);
        kelvin = (celsius+273.15f);
        System.out.println("Convertendo para Celsius, "
                            +"a temperatura está em "+celsius+"°C ("+fahrenheit+"°F ou "+kelvin+"K)");
        leia.close();
    }

}
