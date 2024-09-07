package lista4;

import java.util.Scanner;

public class Exercicio08 {
    public static void resolucao(){
        System.out.println("==========================================================================");
        System.out.println(
            "8) Aproveite os códigos anteriores e implemente a função de impressão\n"
            +"por ordem de preço(crescente):");

        System.out.println("Esta é sua lista de compras.\nDIGITE:");
        System.out.println("1 - Para ver sua lista");
        System.out.println("2 - Para adicionar um item");
        System.out.println("3 - Para remover um item");
        System.out.println("4 - Para ordenar os itens por preço");
        System.out.println("\n0 - Para encerrar");

        String[] lista = new String[9];  //nomes dos produtos
        double[] preco = new double[9];  //preços deles
        int[] posicao = new int[9];      //posição

        String maior;       //variavel que guarda o nome temporariamente para passar do menor para o maior
        String menor;       //variavel que guarda o nome temporariamente para passar do maior para o menor
        double precoMaior;  //o mesmo de cima para os preços
        double precoMenor;

        String itemAdicionado;  //leitor de novos itens
        double precoAdicionado; //leitor de novos precos
        int posicaoAdicionada;  //leitor de posicao
        int remocao;            //marcador de qual item será removino no index = item[remocao]
        int opcao;              //escolhedor do menu
        int tamanhoLista=0;     //proteção para garantir que a lista não ultrapasse o limite do []
        int repetidor;          //repetidor que aumenta a precisao do sorteador

        Scanner leia = new Scanner(System.in);
        opcao = leia.nextInt();
        Scanner leiaString = new Scanner(System.in);
        Scanner leiaDouble = new Scanner(System.in);
        Scanner leiaIndex = new Scanner(System.in);
        


        for (int i = 0; i < lista.length; i++) { //Giro para deixar a lista Padronizada
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
                                posicaoAdicionada=i;
                                posicao[i]=posicaoAdicionada;

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
                case 4:                    
                    System.out.println("\n\nLISTA DE COMPRAS ORDENADA:");
                    repetidor=0;                                            //inicializador do repetidor
                    while(repetidor<10){                                    //repetidor que aumenta a precisão do sorteador
                        for (int i = 0; i < lista.length; i++) {            //comparado
                            for(int i2 = 0; i2 < lista.length; i2++){       //comparador
                            
                                if(preco[i]>preco[i2]){ //se o comparado for mais caro:
                                    if(i>i2){               //se o comparado for maior e estiver acima ele mantem a posição
                                    }
                                    else if(i<i2){          //se o comparado estiver abaixo no sorteador:
                                        menor=lista[i];     //grava o nome do comparado maior no valor menor (para passa-lo adiante do comparado que é maior para o comparador que é menor de fato)
                                        maior=lista[i2];    //grava o nome do comparador menor no valor maior(para passa-lo adiante do comparador que é menor para o comparado que é maior)
                                        lista[i]=maior;     //substitui-atribui o maior ao comparado maior
                                        lista[i2]=menor;    //substitui-atribui o menor ao comparador que é menor
                                        precoMenor=preco[i];//o mesmo pro preco para manter a ordem nas duas listas, de nome, e preço
                                        precoMaior=preco[i2];
                                        preco[i]=precoMaior;
                                        preco[i2]=precoMenor;
                                    }

                                }
                            }
                            /*
                            1-1, 1-2, 1-3, 2-1, 2-2, 2-3, 3-1, 3-2, 3-3 = 9 operacoes mas só 3 existem de fato
                            1 - 2
                            1 - 3
                            2 - 3
                            */
                        }                            
                        repetidor++; //checkpoint que aumenta o valor do repetidor para sair dele após 10 voltas de sorteio
                    }   
                for (int i = 0; i < posicao.length; i++) {
                    System.out.println(i+1+" - "+lista[i]+" | R$"+preco[i]);    //resultado da lista ja ordenada                        
                }                     
                repetidor=0;
                break;
                case 0:
                System.out.println("\n\nEncerrando aplicação");
                break;
                default:
                System.out.println("\n\nDigite uma das opções do Menu");

                break;                    
            }
            System.out.println("\nMENU\n1-Ver lista\n2-Adicionar Item\n3-Remover Item\n4-Ordenar por Preço\n0-Sair");
            opcao = leia.nextInt();
        }
        System.out.println("Encerrando aplicação\n\n");
        leia.close();
        leiaString.close();
        leiaIndex.close();
        leiaDouble.close();


        /*ANALISE PRATICA DO CODIGO:
        O CÓDIGO REORDENOU 100.000 ITENS COM PRECISÃO ALTA EM 2 MINUTOS E MEIO COM REPETIDOR DANDO 2 VOLTAS
        TALVEZ EM UMA VOLTA SÓ ELE JA TENHA 100% DE PRECISAO, MAS ELE TEVE GARGALOS NA PROPRIA EXIBIÇÃO DOS DADOS
        DO RESULTADO, REPETINDO A EXIBIÇÃO DA MESMA POSIÇÃO MAIS DE UMA VEZ COMO NO EXEMPLO DA SEGUINTE AMOSTRA:

        POSIÇÃO NOME           PREÇO
        99990*- Produto57411 | R$499.9157201636953
        99989 - Produto89943 | R$499.914973448287
        99990*- Produto57411 | R$499.9157201636953
        99991 - Produto18150 | R$499.9204081654478
        99992 - Produto16743 | R$499.9263994441924
        99993`- Produto40711 | R$499.929731328124
        99994 - Produto92162 | R$499.93714241006575
        99991 - Produto18150 | R$499.9204081654478
        99992 - Produto16743 | R$499.9263994441924
        99993`- Produto40711 | R$499.929731328124
        99994 - Produto92162 | R$499.93714241006575
        99993`- Produto40711 | R$499.929731328124
        99994 - Produto92162 | R$499.93714241006575
        99995 - Produto41470 | R$499.94289498968317
        99996 - Produto29113 | R$499.9432587666726
        99997´- Produto91636 | R$499.96621661209923
        99995 - Produto41470 | R$499.94289498968317
        99996 - Produto29113 | R$499.9432587666726
        99997´- Produto91636 | R$499.96621661209923
        99997´- Produto91636 | R$499.96621661209923
        99998*- Produto58443 | R$499.9676572565602
        99999 - Produto45707 | R$499.9729210504168
        99998*- Produto58443 | R$499.9676572565602
        99999 - Produto45707 | R$499.9729210504168
        100000 - Produto39028 | R$499.9736966396776


        MOLDE GENERICO DE GERADOR DE NOMES E PREÇOS ALEATÓRIOS PARA TESTE
        // Arrays para os nomes dos produtos e seus preços
        String[] nomesProdutos = new String[100];
        double[] precosProdutos = new double[100];

        // Preenchendo as arrays
        for (int i = 0; i < 100; i++) {
            // Gerando um nome de produto genérico
            nomesProdutos[i] = "Produto" + (i + 1);

            // Gerando um preço aleatório entre 10 e 500
            precosProdutos[i] = 10 + (Math.random() * (500 - 10));
        }

        // Exibindo os resultados (opcional)
        for (int i = 0; i < 100; i++) {
            System.out.printf("Produto: %s, Preço: %.2f%n", nomesProdutos[i], precosProdutos[i]);
        }
    }
} */
    }

}
