package com.lista2.lista2;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lista2Application {

	public static void main(String[] args) {
		SpringApplication.run(Lista2Application.class, args);

		Scanner leia = new Scanner(System.in);
		int opcao;
		System.out.println("\n\nBoas vindas a Lista de Exercicios 2 do Professor Arthur - SerraTec 2024-2");
		System.out.print("Escolha um dos 8 exercícios digitando de 1 a 8 ou digite 0 para sair: ");
		
		opcao = leia.nextInt();		
		switch(opcao){
			case 1:
			System.out.println("EXERCÍCIO 1:");
			Exercicio01.resolucao();
			break;
			case 2:
			System.out.println("EXERCÍCIO 2:");
			Exercicio02.resolucao();
			break;
			case 3:
			System.out.println("EXERCÍCIO 3:");
			Exercicio03.resolucao();
			break;
			case 4:
			System.out.println("EXERCÍCIO 4:");
			Exercicio04.resolucao();
			break;
			case 5:
			System.out.println("EXERCÍCIO 5:");
			Exercicio05.resolucao();
			break;
			case 6:
			System.out.println("EXERCÍCIO 6:");
			Exercicio06.resolucao();
			break;
			case 7:
			System.out.println("EXERCÍCIO 7:");
			Exercicio07.resolucao();
			break;

			case 0:
			System.out.println("Encerrando aplicação");
			break;
			default:
			System.out.println("Digite uma opção entre 1 e 8");
			
		}
		leia.close();
		
	}

}
