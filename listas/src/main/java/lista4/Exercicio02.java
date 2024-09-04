package lista4;

public class Exercicio02 {
    public static void resolucao(){
        System.out.println("==========================================================================");
        System.out.println(
            "2) Agora que você sabe o fechamento do dia, monte um código que\n"
            +"identifique a compra de menor valor e a compra de maior valor\n"
        );

        double[] vendas = {10.00, 5.50, 16.00, 1.00, 2.50, 1.00};
        
        double valorMenor=500;
        double valorMaior=0;

        for(int i=0; i<6;i++){
            if (valorMenor>vendas[i]){valorMenor = vendas[i];}
            if (valorMaior<vendas[i]){valorMaior = vendas[i];}            
        }
        System.out.println("A maior venda foi de R$"+valorMaior);
        System.out.println("A menor venda foi de R$"+valorMenor);

    }
}
