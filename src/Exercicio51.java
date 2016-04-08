import java.util.Scanner;

/* 51) Escreva um algoritmo para resolver equações do 2º grau.
ax2 + bx + c = 0.
A variável a deve ser diferente de zero.
A < 0 não existe raiz real
A = 0 existe uma raiz real x = -b/(2*a)
A > 0 existem duas raízes reais: x1 = (-b + VA)/(2*a) e x2 = (-b - VA)/(2*a) */

public class Exercicio51 {

	public static void main(String[] args) {

		double a, b, c, delta, x1, x2;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor de A: ");
		a = entrada.nextDouble();

		if (a == 0) {

			System.out.print("O valor de A não pode ser zero.");

		} else {

			System.out.print("Insira o valor de B: ");
			b = entrada.nextDouble();
			System.out.print("Insira o valor de C: ");
			c = entrada.nextDouble();

			delta = Math.pow(b, 2) - (4 * a * c);
			x1 = 0;
			x2 = 0;

			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.print("Delta vale: " +delta);
			System.out.print("\nX1 vale: " +x1+ "\nX2 vale: " + x2);

		}

	}

}
