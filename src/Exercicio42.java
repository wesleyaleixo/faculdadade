import java.util.Scanner;

/* 42) A nota final de um estudante é calculada a partir de três notas atribuídas respectivamente
a um trabalho de laboratório, a uma avaliação semestral e a um exame final. A
média das três notas mencionadas anteriormente obedece aos pesos a seguir:
Nota Peso
Trabalho de laboratório 2
Avaliação semestral 3
Exame final 5
Faça um algoritmo que receba as três notas, calcule e mostre a média ponderada e o
conceito segundo mostrado abaixo:
Média Ponderada Conceito
8,0 - 10,0 A
7,0 - 8,0 B
6,0 - 7,0 C
5,0 - 6,0 D
0,0 - 5,0 E */

public class Exercicio42 {

	public static void main(String[] args) {

		double notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal, mediaPonderada;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a nota Laboratório: ");
		notaLaboratorio = entrada.nextDouble();
		System.out.print("Digite a nota Avaliação Semestral: ");
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