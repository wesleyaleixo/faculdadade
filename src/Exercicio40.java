import java.util.Scanner;

/* 40) Faça um algoritmo que calcule e imprima o valor do FGTS a ser descontado de um
empregado, sabendo que o desconto do FGTS é de 8% sobre o salário bruto (forneci-do
pelo usuário). O algoritmo deve, ainda, calcular e imprimir o valor do salário líquido. Nesse
exemplo, o valor do salário líquido é representado pelo salário bruto menos o valor do
FGTS. */

public class Exercicio40 {

	public static void main(String args[]) {

		double salarioBruto, fgts, salarioLiquido;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor do salário: ");
		salarioBruto = entrada.nextDouble();

		fgts = salarioBruto * 8 / 100;
		salarioLiquido = salarioBruto - fgts;

		System.out.println("Valor do FGTS descontado: R$" +fgts);
		System.out.println("O salário liquido a receber: R$" +salarioLiquido);
	}
}
