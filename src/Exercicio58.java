import java.util.Scanner;

/* 58) O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde
para dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC
= peso / (altura)2
. Elabore um algoritmo que leia o peso e a altura de um adulto e mostre
sua condição. 

			IMC em adultos		 	Condição
			abaixo de 18.5 		abaixo do peso
			entre 18.5 e 25 	peso normal
			entre 25 e 30 		acima do peso
			acima de 30 		obeso

*/

public class Exercicio58 {

	public static void main(String[] args) {

		double imc, peso, altura;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite sua altura: ");
		altura = entrada.nextDouble();
		System.out.print("Digite seu peso: ");
		peso = entrada.nextDouble();

		imc = peso / Math.pow(altura, 2);

		if (imc < 18.5) {

			System.out.println("Você está abaixo do peso.");

		}

		else if ((imc >= 18.5) && (imc < 25)) {

			System.out.println("Seu peso está normal.");
			
		}

		else if ((imc >= 25) && (imc < 30)) {

			System.out.println("Você está acima do peso.");

		}

		else if (imc > 30) {

			System.out.println("Você está obeso.");
			
		}
	}
}
