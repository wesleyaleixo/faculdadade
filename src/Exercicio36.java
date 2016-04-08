import java.util.Scanner;

/* 36) Escreva um algoritmo que receba dois números inteiros, calcule e escreva:
a) soma dos dois números
b) subtração do primeiro pelo segundo
c) subtração do segundo pelo primeiro
d) multiplicação dos dois números
e) divisão do primeiro pelo segundo
f) divisão do segundo pelo primeiro
g) o primeiro elevado ao quadrado */

public class Exercicio36 {

	public static void main(String args[]) {

		int numero1, numero2, resultado1, resultado2, resultado3, resultado4, resultado5, resultado6;
		double resultado7;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor do primeiro número: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite o valor do segundo número: ");
		numero2 = entrada.nextInt();

		resultado1 = numero1 + numero2;
		resultado2 = numero1 - numero2;
		resultado3 = numero2 - numero1;
		resultado4 = numero1 * numero2;
		resultado5 = numero1 / numero2;
		resultado6 = numero2 / numero1;
		resultado7 = Math.pow(numero1, 2);

		System.out.println("Soma dos dois números: " +resultado1);
		System.out.println("Subtração do primeiro pelo segundo: " +resultado2);
		System.out.println("Subtração do segundo pelo primeiro: " +resultado3);
		System.out.println("Multiplicação dos dois números: " +resultado4);
		System.out.println("Divisão do primeiro pelo segundo: " +resultado5);
		System.out.println("Divisão do segundo pelo primeiro: " +resultado6);
		System.out.println("O primeiro elevado ao quadrado: " +resultado7);

	}
}
