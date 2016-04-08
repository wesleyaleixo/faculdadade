import java.util.Scanner;

/* 33) Escreva um algoritmo que receba o valor do salário de um funcionário e o valor do
salário mínimo. Calcule e escreva quantos salários mínimos ganha esse funcionário. */

public class Exercicio33 {

	public static void main(String args[]) {

		double salarioMinimo, salario, salarioBruto;

        Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor do salário mínimo: ");
		salarioMinimo = entrada.nextDouble();
		System.out.print("Digite o valor do salário: ");
		salario = entrada.nextDouble();

		salarioBruto = salario / salarioMinimo;

		System.out.print("O funcionário recebe, " +salarioBruto+ " salários mínimos.");

	}
}


