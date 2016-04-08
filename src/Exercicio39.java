import java.util.Scanner;

/* 39) Escreva um algoritmo que calcule e imprima a área de um retângulo. O algoritmo
deve solicitar ao usuário as informações necessárias para esse cálculo. */

public class Exercicio39 {

	public static void main(String args[]) {

		double altura, largura, area;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a altura do retângulo: ");
		altura = entrada.nextDouble();
        System.out.print("qDigite a largura do retângulo: ");
		largura = entrada.nextDouble();

		area = largura * altura;

		System.out.print("A area do retângulo é: " +area);
	}
}
