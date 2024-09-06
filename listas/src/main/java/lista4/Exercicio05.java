package lista4;

import java.util.Scanner;

public class Exercicio05 {
    public static void resolucao(){
        System.out.println("==========================================================================");
        System.out.println(
            "5) Escreva um programa que sirva como uma lista de compras de\n"
            +"mercado. Você irá criar um menu que pergunte se o usuário quer inserir\n"
            +"um item ou ver a lista.\n");

            System.out.println("Esta é sua lista de compras.\nDIGITE:");
            System.out.println("1 - Para ver sua lista");
            System.out.println("2 - Para adicionar um item");
            System.out.println("\n0 - Para encerrar");

            String[] lista = new String[3];
            String adicao;
            int opcao;
            int indexador=0;

            Scanner leia = new Scanner(System.in);
            opcao = leia.nextInt();
            Scanner leiaString = new Scanner(System.in);
            

            while(opcao!=0){

                switch (opcao) {
                    case 1:
                    System.out.println("\n\nLISTA DE COMPRAS:");
                    for (int i = 0; i < lista.length; i++) {
                        System.out.println(i+1+" - "+lista[i]);
                    }
                    break;                    
                    case 2:
                    System.out.println("\nADICIONAR ITEM:");                    
                    if(indexador<lista.length){
                    adicao=leiaString.nextLine();
                    lista[indexador]=adicao; indexador++;
                    System.out.println("\n\n");
                    }
                    else {
                        System.out.println("Lista de compras cheia\n");
                    }
                    
                    break;
                    case 0:
                    System.out.println("\n\nEncerrando aplicação");
                    break;
                    default:
                    System.out.println("\n\nDigite uma das opções do Menu");

                    break;                    
                }
                System.out.println("\nMENU\n1-Ver lista\n2-Adicionar Item\n0-Sair");
                opcao = leia.nextInt();
            }
            System.out.println("Encerrando aplicação\n\n");
            leia.close();
            leiaString.close();
    }

}
