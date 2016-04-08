import java.util.Scanner;

/* 47) Escreva um algoritmo que receba três números obrigatoriamente em ordem crescente
e um quarto número que não siga esta regra. Mostre, em seguida, os quatro nú-
meros em ordem decrescente. */

public class Exercicio47 {

	public static void main(String[] args) {

		double numero1, numero2, numero3, numero4;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		numero1 = entrada.nextDouble();
		System.out.print("Digite o segundo número: ");
		numero2 = entrada.nextDouble();

		if (numero2 < numero1) {
			
			System.out.println("Número não são na ordem crescente.");
		
		} else {
			
			System.out.print("Digite o terceiro número: ");
			numero3 = entrada.nextDouble();
			
			if (numero3 < numero2) {
				
				System.out.println("Número inválido.");
				
			} else {
				
				System.out.print("Digite o quarto número: ");
				numero4 = entrada.nextDouble();
				
				if (numero4 < numero3) {
					
					System.out.println("Número inváildo.");
					
				} else {
					
					System.out.println("Os números em ordem decrescente: " +numero4+ " > " +numero3+ " > " +numero2+ " > " +numero1);
					
				}
			}
		}
	}

}
