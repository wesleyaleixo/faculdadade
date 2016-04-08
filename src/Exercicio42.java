import java.util.Scanner;

/* 42) A nota final de um estudante � calculada a partir de tr�s notas atribu�das respectivamente
a um trabalho de laborat�rio, a uma avalia��o semestral e a um exame final. A
m�dia das tr�s notas mencionadas anteriormente obedece aos pesos a seguir:
Nota Peso
Trabalho de laborat�rio 2
Avalia��o semestral 3
Exame final 5
Fa�a um algoritmo que receba as tr�s notas, calcule e mostre a m�dia ponderada e o
conceito segundo mostrado abaixo:
M�dia Ponderada Conceito
8,0 - 10,0 A
7,0 - 8,0 B
6,0 - 7,0 C
5,0 - 6,0 D
0,0 - 5,0 E */

public class Exercicio42 {

	public static void main(String[] args) {

		double notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal, mediaPonderada;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a nota Laborat�rio: ");
		notaLaboratorio = entrada.nextDouble();
		System.out.print("Digite a nota Avalia��o Semestral: ");
		notaAvaliacaoSemestral = entrada.nextDouble();
		System.out.print("Digite a nota Exame Final: ");
		notaExameFinal = entrada.nextDouble();

		mediaPonderada = (notaLaboratorio * 2 + notaAvaliacaoSemestral * 3 + notaExameFinal * 5) / 10;

		if (mediaPonderada >= 8.0) {

			System.out.print("Conceito A.");

		} else if ((mediaPonderada >= 7) && (mediaPonderada < 8)) {

			System.out.print("Conceito B.");

		} else if ((mediaPonderada >= 6) && (mediaPonderada < 7)) {

			System.out.print("Conceito C.");

		} else if ((mediaPonderada >= 5) && (mediaPonderada < 6)) {

			System.out.print("Conceito D.");

		} else if (mediaPonderada < 5.0) {

			System.out.print("Conceito E.");

		}

	}

}