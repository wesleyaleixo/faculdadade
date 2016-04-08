import java.util.Scanner;

/* 35) Faça um algoritmo que receba a idade de uma pessoa em anos, calcule e imprima
essa idade em: a) meses, b) dias, c) horas e d) minutos. */

public class Exercicio35 {

	public static void main(String args[]) {

		int idade, idadeMeses, idadeSemana, idadeDias, idadeHoras, idadeMinutos;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite sua idade: ");
		idade = entrada.nextInt();

		idadeMeses 	= idade * 12;
		idadeSemana = idade * 52;
		idadeDias 	= idade * 365;
		idadeHoras  = idadeDias * 24;
		idadeMinutos = idadeHoras * 60;

		System.out.println("Sua idade em meses: " +idadeMeses+ "\nSua idade em semanas: " +idadeSemana+ "\nSua idade em dias: "
												  +idadeDias + "\nSua Idade em horas: " +idadeHoras+ "\nSua idade em minutos: " + idadeMinutos);

	}
}
