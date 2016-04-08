import java.util.Scanner;

/* 38) Faça um algoritmo que receba o ano do nascimento de uma pessoa e o ano atual.
Calcule e imprima: a) a idade dessa pessoa; b) essa idade convertida em semanas. */

public class Exercicio38 {

	public static void main(String args[]) {

		int anoNascimento, anoAtual, idade, idadeSemana;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o ano de nascimento: ");
		anoNascimento = entrada.nextInt();
		System.out.print("Digite o ano atual: ");
		anoAtual = entrada.nextInt();

		idade = anoAtual - anoNascimento;
		idadeSemana = idade * 52;

		System.out.print("Sua idade: " +idade+ "\nSua idade em semanas: " +idadeSemana);

	}
}
