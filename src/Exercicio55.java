import java.util.Scanner;

/* 55) Escreva um algoritmo que receba e altura e o peso de uma pessoa. De acordo com
a tabela a seguir, verifique e mostre qual a classificação dessa pessoa. 

	Altura 									Peso
						Até 60 | Entre 60 e 90 (inclusive) | Acima de 90
							   |						   |
Menores que 1,20 			A  |			D			   |	 G
De 1,20 a 1,70 				B  |			E 			   |	 H
Maiores que 1,70 			C  |			F 			   |	 I

*/

public class Exercicio55 {

	public static void main(String[] args) {

		float peso, altura;
		String categoria = null;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu peso: ");
		peso = entrada.nextFloat();
		System.out.print("Digite sua altura: ");
		altura = entrada.nextFloat();

		if ((altura < 1.20) && (peso <= 60)) {

			categoria = "A";

		}

		else if ((altura >= 1.20) && (altura <= 1.70) && (peso <= 60)) {

			categoria = "B";
		}

		else if ((altura > 1.70) && (peso <= 60)) {

			categoria = "C";
		}

		else if ((altura < 1.20) && (peso >= 60) && (peso <= 90)) {

			categoria = "D";
		}

		else if ((altura >= 1.20) && (altura <= 1.70) && (peso >= 60) && (peso <= 90)) {

			categoria = "E";
		}

		else if ((altura > 1.70) && (peso >= 60) && (peso <= 90)) {

			categoria = "F";
		}

		else if ((altura < 1.20) && (peso > 90)) {

			categoria = "G";
		}

		else if ((altura >= 1.20) && (altura <= 1.70) && (peso > 90)) {

			categoria = "H";
		}

		else if ((altura > 1.70) && (peso > 90)) {

			categoria = "I";

		}

		System.out.println("Sua classificacão é: " + categoria);

	}

}
