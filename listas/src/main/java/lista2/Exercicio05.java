package lista2;
import java.util.Scanner;

public class Exercicio05 {
    public static void resolucao(){
        System.out.println(
            "5) Crie um algoritmo que receba login e senha e verifique as credenciais. Caso\n"
            +"algum deles estiver errado o programa deve retornar ao usuário quais das opções\n"
            +"está errada, se é o login ou a senha.");
        
        Scanner leia = new Scanner(System.in);
        
        String usuario="admin";
        String senha="admin";
        String u="";
        String s="";
        
        System.out.print("Digite o Usuário: ");
        u=leia.nextLine();
        System.out.print("Digite a Senha: ");
        s=leia.nextLine();
        
        leia.close();
        if (usuario.equals(u) && senha.equals(s)) { //programação positiva, primeiro faz a afirmação com o return e depois as negações
            System.out.println("Login efetuado com sucesso");
            return;
        }
        else if (!usuario.equals(u) && senha.equals(s)) {
            System.out.println("Usuário incorreto");
        }
        else if (usuario.equals(u) && !senha.equals(s)) {
            System.out.println("Senha incorreta");
        }
        else if (!usuario.equals(u) && !senha.equals(s)) {
            System.out.println("Usuário e Senha incorretos");
        }
    }
}
