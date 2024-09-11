package com.listasrevisao.listas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListasApplication.class, args);
		/*float numeroprimo, numeroprimoguardado=1, diferenca=0, numcomparativo=0;
		int qtdnp=1; //diftotal=0;
		/*double np0=0, 		np1=1,	 	np2=2;
		double np3=3, 		np5=5, 		np7=7;
		double np11=11, 	np13=13, 	np17=17;*/
		/*
		System.out.println(np0+" 	|	"+np0/(np0*np0));
		System.out.println(np1+" 	|	"+np1/(np1*np1));
		System.out.println(np2+" 	|	"+np2/(np2*np2));
		System.out.println(np3+" 	|	"+np3/(np3*np3));
		System.out.println(np5+" 	|	"+np5/(np5*np5));
		System.out.println(np7+" 	|	"+np7/(np7*np7));
		System.out.println(np11+" 	| 	"+np11/(np11*np11));
		System.out.println(np13+" 	| 	"+np13/(np13*np13));
		System.out.println(np17+" 	| 	"+np17/(np17*np17));*/
/*
		for (numeroprimo = 3; numeroprimo<=501; numeroprimo+=2){
			for (int i = 2; i <= 501; i++) {
				if(numeroprimo!=i && numeroprimo%i==0){
					//System.out.println(numeroprimo+" não é primo");
					break;
				}
				else if(numeroprimo==i) {
					//como todos os numeros primos depois de 2 são ímpares, a soma deles sempre é par

					//System.out.print(numeroprimo+" np | ");
					diferenca = numeroprimo-numeroprimoguardado;
					//if (qtdnp%2!=0){System.out.print((diftotal-=diferenca)/*+" diftotal | ");}
					//else {System.out.print((diftotal+=diferenca)/*+" diftotal | \n");}
					if(diferenca>0.9){
						System.out.println("-----------------------------------");
						System.out.print(numeroprimo+" | "+(numeroprimo-numcomparativo)+" |");
						System.out.print(diferenca+" dif | ");
						System.out.println("");

					numcomparativo=numeroprimo;}
					/*
					if (qtdnp%2==0){System.out.print((diftotal-=diferenca)+" diftotal | ");}
					else {System.out.print((diftotal+=diferenca)+" diftotal | ");}
					
					System.out.print((numeroprimoguardado*numeroprimoguardado)-diferenca*(numeroprimo*numeroprimo)+" | ");
					
					System.out.print((numeroprimoguardado*numeroprimoguardado)-diftotal*(numeroprimo*numeroprimo)+" | ");
					System.out.println(numeroprimo/(numeroprimo*numeroprimo)+" np^-1 | ");
					*//*					
					System.out.print(numeroprimo/qtdnp);
					if (diferenca/(diferenca*diferenca)<=0.16666668 && diferenca/(diferenca*diferenca)>=0.16666665){System.out.print("0.16 dif^-1 |	");}
					else{System.out.print(diferenca/(diferenca*diferenca)+" dif^-1 | ");}*/

					//System.out.println(diferenca/numeroprimo+"		|	div np");
					//System.out.println(diferenca/(diferenca*diferenca)/numeroprimo+"		|	^-1 div np");
					//System.out.println(diferenca/numeroprimoguardado+"		|	div ng");
					//System.out.println(diferenca/(diferenca*diferenca)/numeroprimoguardado+"		|	^-1 div ng\n");
/*					//if (numeroprimo==) {}/*
					
					qtdnp++;
					numeroprimoguardado = numeroprimo;
					break;					
				}
				
			}
		}
		System.out.println("Total de numeros primos "+qtdnp);
*/
	/*
	um numero par dividido por 2 vai retornar metade dos resultados impares e a outra metade pares
	8880 = 0
	8882 = 1
	8884 = 2
	8886 = 3
	8888 = 4
	8890 = 5
	8892 = 6
	8894 = 7
	8896 = 8
	8898 = 9
	8900 = 0
	8902 = 1
	8904 = 2

	Dois tipos de pares, os que a metade geram pares, e os que a metade geram impares:
	//2 gera impar 1
	4 gera par 2 que gera impar 1
	//6 gera impar 3 P
	8 gp 4 gp 2 gi 1
	//10 gi 5 P
	12 gp 6 gi 3 P
	//14 gi 7 P
	16 gp 8 gp 4 gp 2 gi 1
	//18 gi 9 NAOPRIMOtab3e9
	20 gp 10 gi 5 P
	//22 gi 11 P
	24 gp 12 gp 6 gi 3 P gera uma decimal sem dizima periodica 1.5 que gera 0.75 que gera
	//26 gi 13 P
	28 gp 14 gi 7 P
	//30 gi 15 NAOPRIMOtab3
	32 gp 16 gp 8 gp 4 gp 2 gi 1 que gera uma decimal sem dizima periodica 0.5
	//34 gi 17 P
	36 gp 18 gi 9 NAOPRIMOtab9
	//38 gi 19 P
	40 gp 20 gp 10 gi 5 P
	//42 gi 21 NAOPRIMOtab3e7
	44 gp 22 gi 11 P
	//46 gi 23 P
	48 gp 14 gi 7 P
	//50 gi 25 NÃOPRIMOtab5

	daria para seguir uma lógica parecida com a metade dos multiplos de 3?
	3  i	PRIMO1
	6  gi 3 PRIMO1
	9  i
	12 gp 6 gi 3
	15 i
	18 gi 9
	21 i
	24 gp 12 gp 6 gi 3
	27 i
	30 gi 15
	33 i
	36 gi 13PRIMO2
	39 i
	42 gi 21
	45 i
	48 gp 14 gi 7PRIMO3


	Todos os impares diretos do 3 maiores que o proprio 3 não são primos, pois são multiplos de 3
	6, 9, 15, 21, 33, 39 dividos por 3 geram PRIMOS
	O 6 dividido por 2 gera um PRIMO

	


	quantos tipos de primos existem? 
	os que o dobro vai ser um par>impar e os que o dobro vai ser um par>par?
	2-42	1
	3-6 	3
	5-10 	5
	7-14 	7
	11-22	11
	13-26	13
	17-34	17
	Não, todos os dobros de Primo vao gerar um par>impar, pois é ele próprio


	Toda vez que você encontra um numero primo, você encontra vários não primos, que são o dobro, ou o triplo dele(e todos seus multiplos)
	Assim você ja elimina pelo menos uns 10 numeros para cada primo encontrado
	O dobro dele vai ser par (P*2=par) o mesmo para 4 6 8 10
	O triplo vai ser um impar com múltiplos (P*3=ímparM)
	O quintuplo dele vai gerar um impar com final 5 multiplo de 5
	Todo ímpar maior que 5 com final 5 é múltiplo de 5 e não será PRIMO

	Essa é a questão dos números primos, sempre que você acha um, você perde todos eles
	A única base forte é saber que metade dos números são pares e só o 2 será primo

	(infinito / 2) - 1
	(todos  pares) menos o 2

	Metade da lista(+1) ja foi. 
	Da outra metade do infinito, que são os números ímpares, uma porção é de PRIMOS e outra não.
	Binariamente, "5 -> 050505", o 5 sempre vai gerar um par e um ímpar não PRIMO, que sempre termina com 5.
	Um décimo da lista a mais para fazer a menos, (pares) e (x5)

	((infinito/2)+1/10)-1)-1)
	((os pares) mais os ímpares com final com 5 que são um décimo do infinito) 
	(menos o 2) menos o 5)
		"reduntante?"

	Todos os outros números ímpares seguem padrões mais erráticos que se cruzam frequente com os múltiplos de 3
	3-6-(9)primeiro IMPAR não primo, mas 19 é, e 29 também só que 39 e 49 não, 59 sim, 69 não, 79 e 89 sim, 99 não
	Aqui é onde a pista se perde:
	Pois, os números terminados em 1, 3, 7 e 9 também são: 
	Múltiplos de números terminados em 1, 3, 7, 9
	Mas é interessante pensar que somente números com esse final são primos.
	Com isso:
	(infinito*0.6)-2 ou 3/5 dos números não é PRIMO
	(infinito*0.4)+2 ou 2/5 dos números "pode" ser PRIMO ou não
	
	-Pra mim, 1, 2, 3, 5 entram na lista dos PRIMOS e iniciam a contagem com (+4)
	(só que quando se pensa que o 0 poderia entrar como par ou neutro, e o 1 como ímpar,
	mas como nem um nem outro entram, então não tem problema não definir 0 e 1.)

	-Então se seguir a risca, somente 2, 3 e 5 contam e inicia-se com (+3).
	(Isso importa mais em caso de somar as distancias ou contar cada um).
	Em nível de programação, partir do 5 é possível definir regras generalistas que não se aplicariam ao 2 
	que é o par PRIMO e ao 5 que o único 5 PRIMO dos ímpares e o 3 ta ali perdido, pois daqui em diante ele
	poderá ser um PRIMO ou não.
	O 6 é par, então 7 inicia a rodagem e o 9 ja quebra a lista como primeiro ímpar não primo. 
	for(contagem=7)

	Mas a partir daqui se pode implementar as regras de fato.
	
	Então o contador sobe de dois em dois e não de um em um para não mudar de estado entre par e impar atoa.
	(contagem+=2)

	Os únicos números processados daqui pra frente serão os que terminam em 1, 3, 7, 9
	**Como se faz isso em código? %1 %3 %7 %9
	7_9_1_3_7
	+2+2+2+4 analisado

	Lembrando que isso serve pro número analisado e pro analisador
	Ele não precisará mais ir de um em um pois %1, %3, %7, %9 não são divisiveis por nenhum par. -(n/2)
	Ele irá partir do 3 até chegar no número analisado.
	Os %5 não precisam ser avaliados -(n/10)
	Assim o contador precisará seguir este caminho:
	3_7_9_1_3
	+4+2+2+2 analisador

	2 2 2 4 e repete.
	**Como seria isto em código*/

	int primos1379analisados; //numeros 1 3 7 9 que serão analisados
	int contAnalisado=0;	//contador que fará 2 2 2 4
	int puloDoAnalisado=0; // contador do gap de 4
	
	int analisador;
	int contAnalisador=4;
	int puloDoAnalisador=3;
	
	int totalAnalisados=51000;//serão avaliados números até este valor
	int contPrimosAchados=3;//2,3,5 ja são e começa no 7
	System.out.println(2+" P\n"+3+" P\n"+5+" P");
	
	
	for (primos1379analisados = 7; primos1379analisados < totalAnalisados; primos1379analisados+=contAnalisado) {		
		if(puloDoAnalisado==3){contAnalisado=4; puloDoAnalisado=-1;}
		else{contAnalisado=2;}
		puloDoAnalisado+=1;

			for (analisador = 3; analisador < totalAnalisados; analisador+=contAnalisador) {
				if(puloDoAnalisador==3){contAnalisador=4; puloDoAnalisador=-1;}
				else{contAnalisador=2;}
				puloDoAnalisador+=1;
				

				if(primos1379analisados>analisador && primos1379analisados%analisador==0){
					break;
				}
				else if(primos1379analisados==analisador){
					System.out.println(primos1379analisados+" P");
					contPrimosAchados++;
					break;
				}
				
			}	
		}
		System.out.println(contPrimosAchados+" números Primos encontrados");
		/*O código ficou absurdamente mais rápido/eficiente com essa solução!!

	

	


	

	


	Todos os números primos estão a um par de distancia uns dos outros por conta da ideia de pares e impares.
	Assim todo par está a um par de distancia de outro, e todo ímpar também está a um par de distância de outro,
	pois assim que se soma um ímpar com outro ímpar, você gera um par.
	A soma com par mantém o estado, e a soma com ímpar muda o estado.
	Dessa forma, para manter o estado ímpar, se deve utilizar uma soma par, por isso a distância entre
	Primos costuma variar por 2, 4, e 6.

	
	*/
	}
}
