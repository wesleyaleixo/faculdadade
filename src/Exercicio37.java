import java.util.Scanner;

/* 37) Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. Escreva
um algoritmo que receba o valor do salário mínimo e a quantidade de quilowatts gasta por
uma residência. Calcule e imprima:
a) o valor, em reais, de cada quilowatt;
b) o valor, em reais, a ser pago por essa residência;
c) novo valor a ser pago por essa residência, a partir de um desconto de 15%. */

public class Exercicio37 {

	public static void main(String args[]) {

		double salarioMinimo, totalQuilowatt, valorQuilowatt, valorConta, desconto, valorDesconto;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor do salário mínimo: ");
		salarioMinimo = entrada.nextDouble();
		System.out.print("Digite a quantidade de Quilowatt gasto: ");
		totalQuilowatt = entrada.nextDouble();

		valorQuilowatt = salarioMinimo * 1 / 5;
		valorConta     = totalQuilowatt * valorQuilowatt;
		desconto       = valorConta * 15 / 100;
		valorDesconto  = valorConta - desconto;


		System.out.print("Valor do Quilowatt: " +valorQuilowatt+ "\nO valor da conta: " +valorConta
					   + "\nValor do desconto: " +desconto+ "\nO novo valor da conta com desconto: " +valorDesconto);

	}
}
