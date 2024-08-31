package com.lista1.lista1;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lista1Application {

	public static void main(String[] args) {
		SpringApplication.run(Lista1Application.class, args);

		int opcao;
		System.out.println("Boas vindas a Lista de Exercicios 1 do Professor Arthur - SerraTec 2024-2");
		System.out.println("Escolha um dos exerecícios:");
		Scanner leia = new Scanner(System.in);
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


		
	}

		leia.close();
	}

}
