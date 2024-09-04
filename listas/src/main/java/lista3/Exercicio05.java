package lista3;

import java.util.Scanner;

public class Exercicio05 {
    public static void resolucao(){
        System.out.println("==========================================================================");
        System.out.println(
            "5) Crie um algoritmo que receba login e senha e verifique as credenciais. Caso"
            +"\nalgum deles estiver errado o programa deve retornar ao usuário quais das"
            +"\nopções está errada, se é o login ou a senha. O programa deve bloquear o"
            +"\nacesso após 3 tentativas erradas. Quando for a última tentativa ele deve emitir"
            +"\num alerta: 'Última tentativa, mais um erro seu acesso será bloqueado!"
        );
        Scanner leia = new Scanner(System.in);
        
        String usuario="admin";
        String senha="admin";
        String u="";
        String s="";
        int tentativas = 3;
        
        while(tentativas>=1){
            System.out.print("Digite o Usuário: ");
            u=leia.nextLine();
            System.out.print("Digite a Senha: ");
            s=leia.nextLine();
            
            
            if (usuario.equals(u) && senha.equals(s)) { //programação positiva, primeiro faz a afirmação com o return e depois as negações
                System.out.println("Login efetuado com sucesso");
                return;
            }
            else if (!usuario.equals(u) && senha.equals(s)) {
                System.out.println("Usuário incorreto");
                tentativas--;
                if(tentativas>1){
                    System.out.println("Você tem mais "+tentativas+" tentativas para efetuar o login.\n");
                }
                else if(tentativas==1){
                    System.out.println("ALERTA! VOCÊ SÓ TEM MAIS UMA TENTATIVA ANTES DE BLOQUEAR SEU ACESSO\n");
                }
            }
            
            else if (usuario.equals(u) && !senha.equals(s)) {
                System.out.println("Senha incorreta");
                tentativas--;
                if(tentativas>1){
                    System.out.println("Você tem mais "+tentativas+" tentativas para efetuar o login.\n");
                }
                else if(tentativas==1){
                    System.out.println("ALERTA! VOCÊ SÓ TEM MAIS UMA TENTATIVA ANTES DE BLOQUEAR SEU ACESSO\n");
                }
            }
            
            else if (!usuario.equals(u) && !senha.equals(s)) {
                System.out.println("Usuário e Senha incorretos");
                tentativas--;
                if(tentativas>1){
                    System.out.println("Você tem mais "+tentativas+" tentativas para efetuar o login.\n");
                }
                else if(tentativas==1){
                    System.out.println("ALERTA! VOCÊ SÓ TEM MAIS UMA TENTATIVA ANTES DE BLOQUEAR SEU ACESSO\n");
                }
            }
            //bloqueador de acesso
            if(tentativas==0){
                System.out.println("\nSEU ACESSO FOI BLOQUEADO");
                leia.close();
                return;
            }
        }
        leia.close();
    }
}
