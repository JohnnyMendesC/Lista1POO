package com.lista1.lista1;

import java.util.Scanner;

public class Exercicio06 {
    public static void resolucao(){
        System.out.println(
            "Construa um algoritmo que leia\n"+
            "1- A distância percorrida por um veículo em km\n"+
            "2- O total gasto em combustível em litros\n"+
            "No final deverá ser respondido o consumo médio\n\n");

        Scanner leia = new Scanner(System.in);

        float distancia, combustivel, mediaconsumo;
        
        System.out.print("Em quilômetros, digite a distancia percorrida: ");
        distancia = leia.nextFloat();
        
        System.out.print("Em litros, digite o total de combustível gasto: ");
        combustivel = leia.nextFloat();

        mediaconsumo = (distancia/combustivel);

        System.out.println("O consumo médio deste veículo teve rendimento de "+mediaconsumo+"km/l");
        leia.close();
        }
}
