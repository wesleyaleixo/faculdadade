import java.util.Scanner;

/* 57) Escreva um algoritmo que receba a medida de um ângulo em graus (número inteiro).
Calcule e mostre o quadrante em que se localiza esse ângulo. Considere os quadrantes
da trigonometria e para ângulos maiores que 360º ou menores que -360º, reduzi-los,
mostrando também o número de voltas e o sentido da volta (horário ou antihorário). */

public class Exercicio57 {

	public static void main(String[] args) {

		int angulo, voltas, anguloOriginal;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor de um ângulo(Inteiro): ");
		anguloOriginal = entrada.nextInt();

		angulo = anguloOriginal % 360;
		voltas = anguloOriginal / 360;

		System.out.println("O ângulo encontrado foi: " +angulo);
		if (anguloOriginal > 0) {

			System.out.println("O número de voltas foi: " +voltas+ " no sentido horário.");

		} else {

			System.out.println("O número de voltas foi: " +voltas+ " no sentido antihorário.");

		}

		if ((angulo >= 0) && (angulo <= 90)) {

			System.out.println("Quadrante: 1");

		}

		else if ((angulo > 90) && (angulo <= 180)) {

			System.out.println("Quadrante: 2");

		}

		else if ((angulo > 180) && (angulo <= 270)) {

			System.out.println("Quadrante: 3");

		} else if (angulo > 270) {

			System.out.println("Quadrante: 4");

		}

	}

}
