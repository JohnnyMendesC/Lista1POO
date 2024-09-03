package lista2;

import java.util.Scanner;
public class Exercicio08 {
    public static void resolucao(){
        System.out.println(
            "\n8) Crie um joguinho de perguntas e respostas múltipla escolha. O programa\n"
            +"deverá fazer 5 perguntas (Uma por vez). Se errar 3 vezes, perde o jogo. Se\n"
            +"o usuário chegar até o final o programa deve exibir o número de acertos.");
        Scanner leia = new Scanner(System.in);

        int erros=0, acertos=0, perguntas=0, resposta;

        System.out.println("Boas vindas ao SerraQuiz! \n"
                            +"Acerte as perguntas e some pontos. "
                            +"Erre 3 e perca tudo!!");


        while (erros<3){            
            System.out.println("Acertos: "+acertos+" | Erros: "+erros);
            System.out.println("Pergunta número 1:\n"
                +"Qual é o elemento químico com o símbolo 'Au'?\n"
                +"1)Prata\n2)Ouro\n3)Alumínio\n4)Cobre\n5)Platina");
            resposta=leia.nextInt();
            if (resposta==2) {acertos+=1; perguntas+=1;}  
            if (resposta!=2) {erros+=1; perguntas+=1;}

            System.out.println("Acertos: "+acertos+" | Erros: "+erros);
            System.out.println("Pergunta número 2:\n"
                +"Qual é o maior rio do mundo por volume de água?\n"
                +"1)Rio Nilo\n2)Rio Yangtze\n3)Rio Mississippi\n4)Rio Mekong\n5)Rio Amazonas");
            resposta=leia.nextInt();
            if (resposta==5) {acertos+=1; perguntas+=1;}  
            if (resposta!=5) {erros+=1; perguntas+=1;}    

            System.out.println("Acertos: "+acertos+" | Erros: "+erros);
            System.out.println("Pergunta número 3:\n"
            +"Qual é o ponto de ebulição da água em graus Celsius no nivel do mar?\n"
            +"1)100°C\n2)90°C\n3)110°C\n4)50°C\n5)0°C");
            resposta=leia.nextInt();
            if (resposta==1) {acertos+=1; perguntas+=1;}  
            if (resposta!=1) {erros+=1; perguntas+=1;}
            if (erros==3) {
                break;
            }

            System.out.println("Acertos: "+acertos+" | Erros: "+erros);
            System.out.println("Pergunta número 4:\n"
                +"Qual é o principal componente da água do mar?\n"
                +"1)Nitrato de Amônio\n2)Carbonato de Magnésio\n3)Cloreto de Sódio\n4)Cloreto de Potássio\n5)Sulfato de Cálcio");
            resposta=leia.nextInt();
            if (resposta==3) {acertos+=1; perguntas+=1;}  
            if (resposta!=3) {erros+=1; perguntas+=1;}
            if (erros==3) {
                break;
            }

            System.out.println("Acertos: "+acertos+" | Erros: "+erros);
            System.out.println("Pergunta número 5:\n"
                +"Qual é o maior planeta do Sistema Solar?\n"
                +"1)Terra\n2)Vênus\n3)Marte\n4)Júpiter\n5)Saturno");
            resposta=leia.nextInt();            
            if (resposta==4) {acertos+=1; perguntas+=1;}  
            if (resposta!=4) {erros+=1; perguntas+=1;}         
            if (erros==3 || perguntas==5) {
                break;
            }

        }
        

        if (erros==3) {     
            System.out.println("3 erros! Perdeu tudo!!");
        }
        else if (acertos == 5) {
            System.out.println("Parabéns!! Você acertou todas!");
        }
        else {
            System.out.println("Você fez "+acertos+" pontos!\n"
                +"Será que consegue acertar todas na próxima?");
        }
        leia.close();
    }

}
