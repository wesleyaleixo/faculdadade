import java.util.Scanner;

/* 34) Faça um algoritmo que receba o nome e o salário de um funcionário, calcule e imprima
o nome do funcionário e o valor do imposto de renda a ser pago, sabendo que o
imposto equivale a 5% do salário. */

public class Exercicio34 {

	public static void main(String args[]) {

		String nome;
		double salarioFuncionario, imposto;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome do funcionário: ");
		nome = entrada.next();
		System.out.print("Digite o valor do salário do funcionário: ");
		salarioFuncionario = entrada.nextDouble();

		imposto = salarioFuncionario * 5 / 100;

		System.out.println("O funcionário " +nome+ ", vai pagar R$" +imposto+ " de imposto.");

	}
}
