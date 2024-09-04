package lista4;

public class Exercicio01 {
    public static void resolucao(){
        System.out.println("==========================================================================");
        System.out.println(
            "1) Você é gerente de um supermercado e sabe que os valores das"
            +"\nvendas do dia são gravados em um vetor. Digite um código que faça o"
            +"\nfechamento)(soma) de vendas do dia de maneira automatizada.\n"
        );

        double[] vendas = {10.00, 5.50, 16.00, 1.00, 2.50, 1.00};
        double soma=0;
        double valor;

        for(int i=0; i<6;i++){
            System.out.println((i+1)+"º venda | R$"+vendas[i]);
            valor = vendas[i];
            soma += valor;
            
        }
        System.out.println("_________________________");
        System.out.println("Fechamento do dia R$"+soma);
        System.out.println("_________________________");
    }

}
