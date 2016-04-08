import java.util.Scanner;

/* 41) Escreva um algoritmo que leia 2 valores A e B e calcule o valor de C, sabendo que
C = (A + B) * B. O algoritmo deve imprimir os valores de A, B e C. */

public class Exercicio41 {

	public static void main(String args[]) {

		double a, b, c;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor A: ");
		a = entrada.nextDouble();
        System.out.print("Digite o valor B: ");
		b = entrada.nextDouble();

		c = (a + b) * b;

		System.out.print("Valor de A: " +a+ "\nValor de B: " +b+ "\nValor de C: " +c);

	}
}
