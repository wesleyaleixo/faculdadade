import java.util.Scanner;

/* 57) Escreva um algoritmo que receba a medida de um �ngulo em graus (n�mero inteiro).
Calcule e mostre o quadrante em que se localiza esse �ngulo. Considere os quadrantes
da trigonometria e para �ngulos maiores que 360� ou menores que -360�, reduzi-los,
mostrando tamb�m o n�mero de voltas e o sentido da volta (hor�rio ou antihor�rio). */

public class Exercicio57 {

	public static void main(String[] args) {

		int angulo, voltas, anguloOriginal;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor de um �ngulo(Inteiro): ");
		anguloOriginal = entrada.nextInt();

		angulo = anguloOriginal % 360;
		voltas = anguloOriginal / 360;

		System.out.println("O �ngulo encontrado foi: " +angulo);
		if (anguloOriginal > 0) {

			System.out.println("O n�mero de voltas foi: " +voltas+ " no sentido hor�rio.");

		} else {

			System.out.println("O n�mero de voltas foi: " +voltas+ " no sentido antihor�rio.");

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
