import java.util.Scanner;

/* 47) Escreva um algoritmo que receba tr�s n�meros obrigatoriamente em ordem crescente
e um quarto n�mero que n�o siga esta regra. Mostre, em seguida, os quatro n�-
meros em ordem decrescente. */

public class Exercicio47 {

	public static void main(String[] args) {

		double numero1, numero2, numero3, numero4;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro n�mero: ");
		numero1 = entrada.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		numero2 = entrada.nextDouble();

		if (numero2 < numero1) {
			
			System.out.println("N�mero n�o s�o na ordem crescente.");
		
		} else {
			
			System.out.print("Digite o terceiro n�mero: ");
			numero3 = entrada.nextDouble();
			
			if (numero3 < numero2) {
				
				System.out.println("N�mero inv�lido.");
				
			} else {
				
				System.out.print("Digite o quarto n�mero: ");
				numero4 = entrada.nextDouble();
				
				if (numero4 < numero3) {
					
					System.out.println("N�mero inv�ildo.");
					
				} else {
					
					System.out.println("Os n�meros em ordem decrescente: " +numero4+ " > " +numero3+ " > " +numero2+ " > " +numero1);
					
				}
			}
		}
	}

}
