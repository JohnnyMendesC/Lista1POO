package lista4;

public class Exercicio03 {
    public static void resolucao(){
        System.out.println("==========================================================================");
        System.out.println("3) Ainda utilizando o exercício do mercado, calcule o ticket médio de vendas do dia");

        double[] vendas = {10.00, 5.50, 16.00, 1.00, 2.50, 1.00};
        double faturamento=0d;

        for (int i = 0; i < vendas.length; i++) {
            faturamento = faturamento + vendas[i];
        }
        System.out.println("\n\n\nDETALHAMENTO DO DIA:");
        System.out.println("Foram realizadas "+vendas.length+" vendas no dia");
        System.out.println("Faturamento do dia: R$"+faturamento);
        System.out.println("Ticket médio de vendas do dia: R$"+faturamento / vendas.length);
    }

}
