import java.util.Scanner;

/* 54) Um supermercado deseja reajustar os pre�os de seus produtos usando o seguinte
crit�rio: o produto poder� ter seu pre�o aumentado ou diminu�do. Para alterar o pre�o, o
produto deve preencher pelo menos um dos requisitos a seguir:

							Requisitos 										Reajustes
	Venda M�dia Mensal 			| 		Pre�o Atual 			| % de Aumento  | % de Diminui��o
		< 500     		 		|	< R$ 30,00         			|		10 		|		-
		>= 500 e < 1200 		|	>= R$ 30,00 e < R$ 60,00 	|		15 		|		-
		>= 1200 				|	>= R$ 80,00 				|		-	 	|		20 			
		
Fa�a um algoritmo que receba o pre�o atual e a venda mensal m�dia do produto, calcule
e mostre o novo pre�o. */

public class Exercicio54 {
	
	public static void main(String[] args){
		
		float mediaMensal, valorProduto, novoValor;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor atual do produto: ");
		mediaMensal = entrada.nextFloat();
		System.out.print("Digite o valor de venda mensal: ");
		valorProduto = entrada.nextFloat();
		
		if((mediaMensal < 500) && (valorProduto < 30)){
			
			novoValor = (valorProduto * (10 / 100) + valorProduto);
			
		} else if (((mediaMensal >= 500) && (mediaMensal < 1200)) && ((valorProduto >= 30) && (valorProduto < 60))){
			
			novoValor = (valorProduto * (15/ 100) + valorProduto);
			
		} else {
			
			novoValor = (valorProduto * (20 / 100) + valorProduto);
			
		}

		System.out.print("Novo pre�o do produto: " +novoValor);
	}

}
