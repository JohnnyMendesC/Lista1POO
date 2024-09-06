package lista4;

import java.util.Scanner;

public class Exercicio07 {
    public static void resolucao(){
        System.out.println("==========================================================================");
        System.out.println(
            "7) Aproveite o código que estamos utilizando e implemente um preço\n"
            +"para cada item\n"
            +"(Pode-se utilizar outra lista com os mesmos itens para o item, e para o preço)");

            System.out.println("Esta é sua lista de compras.\nDIGITE:");
            System.out.println("1 - Para ver sua lista");
            System.out.println("2 - Para adicionar um item");
            System.out.println("3 - Para remover um item");
            System.out.println("\n0 - Para encerrar");

            String[] lista = new String[3];
            double[] preco = new double[3];
            String itemAdicionado;
            double precoAdicionado;
            int remocao;
            int opcao;
            int tamanhoLista=0;

            Scanner leia = new Scanner(System.in);
            opcao = leia.nextInt();
            Scanner leiaString = new Scanner(System.in);
            Scanner leiaDouble = new Scanner(System.in);
            Scanner leiaIndex = new Scanner(System.in);
            
            for (int i = 0; i < lista.length; i++) {
                lista[i]="Vazio";
                preco[i]=0d;
            }

            while(opcao!=0){

                switch (opcao) {
                    case 1:
                    System.out.println("\n\nLISTA DE COMPRAS:");
                    for (int i = 0; i < lista.length; i++) {
                        System.out.println(i+1+" - "+lista[i]+" | R$"+preco[i]);
                    }
                    break;                    
                    case 2:
                    System.out.println("\nADICIONAR ITEM:");                    
                    if(tamanhoLista<lista.length){
                        for (int i = 0; i < lista.length; i++) {
                            if(lista[i].equals("Vazio")){
                                System.out.print("Digite o nome do item: ");
                                itemAdicionado=leiaString.nextLine();
                                System.out.print("Insira o preço do item: R$");
                                precoAdicionado=leiaDouble.nextDouble();
                                System.out.println("\n");
                                lista[i]=itemAdicionado;
                                preco[i]=precoAdicionado;
                                tamanhoLista++;
                                break;
                            }                        
                        }                    
                    }
                    else {
                        System.out.println("Lista de compras cheia\n");
                    }
                    
                    break;
                    case 3:
                    System.out.println("\nREMOVER ITEM:"); 
                    System.out.println("Esta é sua lista de compras:");
                    for (int i = 0; i < lista.length; i++) {
                        System.out.println(i+1+" - "+lista[i]+" | R$"+preco[i]);
                    }
                    System.out.println("Qual item deseja remover?");
                    if (tamanhoLista==0)
                        {System.out.println("\nLista Completamente VAZIA\nRetornando ao MENU");}
                    else{
                        remocao = leiaIndex.nextInt();
                        if (remocao>lista.length||remocao<0){
                            System.out.println("Opção não existe na lista");
                        }
                        else if(lista[remocao-1].equals("Vazio")){
                            System.out.println("Espaço "+remocao+" ja se encontra vazio");
                        }
                        else{
                        lista[remocao-1]="Vazio";
                        preco[remocao-1]=0d;
                        tamanhoLista--;
                        System.out.println("Item "+remocao+" removido da lista");
                        }
                    }
                    break;
                    case 0:
                    System.out.println("\n\nEncerrando aplicação");
                    break;
                    default:
                    System.out.println("\n\nDigite uma das opções do Menu");

                    break;                    
                }
                System.out.println("\nMENU\n1-Ver lista\n2-Adicionar Item\n3-Remover Item\n0-Sair");
                opcao = leia.nextInt();
            }
            System.out.println("Encerrando aplicação\n\n");
            leia.close();
            leiaString.close();
            leiaIndex.close();
            leiaDouble.close();
        }

}
