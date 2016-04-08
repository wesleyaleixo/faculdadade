import java.util.Scanner;

/* 56) Escreva um algoritmo que receba a altura e o sexo de uma pessoa, calcule e imprima
o seu peso ideal, usando as seguintes fórmulas:
para homens: (72.7 * h) – 58;
para mulheres: (62.1 * h) – 44.7. */

public class Exercicio56 {

	public static void main(String[] args) {

		double altura, pesoIdeal;
		int sexo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu sexo. 1 - Masculino || 2 - Feminino: ");
		sexo = entrada.nextInt();
		System.out.print("Digite sua altura: ");
		altura = entrada.nextDouble();
		
		if (sexo == 1) {
			
			pesoIdeal = (72.7 * altura) - 58;
			
		} else {
			
			pesoIdeal = (62.1 * altura) - 44.7;
			
		}
		
		System.out.println("Seu peso ideal: " +pesoIdeal);
	}

}
