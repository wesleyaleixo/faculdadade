import java.util.Scanner;

/* 59) Escreva um algoritmo que receba a idade de um nadador e imprima a sua categoria
seguindo as regras: 

		Categoria 			   Idade
		Infantil A 			5 – 7 anos
		Infantil B          8 – 10 anos
		Juvenil A 			11 – 13 anos
		Juvenil B 			14 – 17 anos
		Sênior 				maiores de 18 anos

*/

public class Exercicio59 {

	public static void main(String[] args) {

		int idade;
		String categoria = null;
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a idade do nadador: ");
		idade = entrada.nextInt();

		if ((idade >= 5) && (idade <= 7)) {

			categoria = "Infantil A";
			
		}

		else if ((idade >= 8) && (idade <= 10)) {

			categoria = "Infantil B";

		}

		else if ((idade >= 11) && (idade <= 13)) {

			categoria = "Juvenil A";

		}

		else if ((idade >= 14) && (idade <= 17)) {

			categoria = "Juvenil B";

		}

		else if (idade >= 18) {

			categoria = "Sênior";

		}

		System.out.println("A categoria do nadador é: " +categoria);

	}
}
