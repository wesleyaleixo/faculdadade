import java.util.Scanner;

/* 45) Escreva um algoritmo que receba o valor de um depósito e o valor da taxa de juros,
calcule e mostre o valor do rendimento e o valor total depois do rendimento. */

public class Exercicio45 {
	
	public static void main(String[] args){
		
		double deposito, taxaJuros, valorRendimento, valorTotal;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do depósito: ");
		deposito = entrada.nextDouble();
		System.out.print("Digite o valor da taxa de juros: ");
		taxaJuros = entrada.nextDouble();
		
		valorRendimento = (deposito * taxaJuros) / 100;
		valorTotal  = valorRendimento + deposito;
		
		System.out.println("Valor do rendimento: " +valorRendimento+ "\nValor total com rendimento: " +valorTotal);
		
	}

}
