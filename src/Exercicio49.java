import java.text.DecimalFormat;
import java.util.Scanner;

/* 49) Escreva um algoritmo que receba o valor do sal�rio m�nimo, o n�mero de horas
trabalhadas, o n�mero de dependentes do funcion�rio e a quantidade de horas extras
trabalhadas. Calcule e mostre o sal�rio do funcion�rio de acordo com as regras a seguir:
- o valor da hora trabalhada � igual a 1/5 do sal�rio m�nimo;
- o sal�rio do m�s � igual ao n�mero de horas trabalhadas multiplicado pelo valor da hora trabalhada;
- para cada dependente acrescentar R$ 32,00;
- para cada hora extra trabalhada, calcular o valor da hora trabalhada acrescida de 50%;
- o sal�rio bruto � igual ao sal�rio do m�s mais o valor dos dependentes mais o valor das horas extras;
- calcular o valor do imposto de renda retido na fonte de acordo com a tabela a seguir:

				IRRF Sal�rio bruto
			Isento Inferior a R$ 200,00
			10% De R$ 200,00 at� R$ 500,00
			20% Superior a R$ 500,00

- o sal�rio l�quido � igual ao sal�rio bruto menos IRRF;
- a gratifica��o segue a tabela a seguir:

				Sal�rio L�quido Gratifica��o
			At� R$ 350,00 R$ 100,00
			Superior a R$ 350,00 R$ 50,00

- o sal�rio do funcion�rio � igual ao sal�rio l�quido mais gratifica��o. */

public class Exercicio49 {
	
	public static void main(String[] args){
		
		float salarioMinimo, horaTrabalhada, dependente, valorHoraTrabalhada, salarioMes, valorDependete, horaExtraTrabalhada, salarioBruto, irrf, salarioLiquido, gratificacao;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do sal�rio m�nimo: ");
		salarioMinimo = entrada.nextFloat();
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		horaTrabalhada = entrada.nextFloat();
		System.out.print("Digite a quantidade de dependentes: ");
		dependente = entrada.nextFloat();
		System.out.print("Digite a quantidade de hora extra: ");
		horaExtraTrabalhada = entrada.nextFloat();
		
		valorHoraTrabalhada =  salarioMinimo / 5;
		salarioMes = horaTrabalhada * valorHoraTrabalhada;
		valorDependete = dependente * 32;
		horaExtraTrabalhada = (valorHoraTrabalhada * 50) / 100;
		salarioBruto = salarioMes + valorDependete + horaExtraTrabalhada;
		
		if(salarioBruto <= 200){
			
			irrf = 0;			
			
		} else if((salarioBruto > 200) && (salarioBruto <= 500)){
			
			irrf = (salarioBruto * 10) / 100;
			
		} else {
			
			irrf = (salarioBruto * 20) / 100;
			
		}
		
		salarioLiquido = salarioBruto - irrf;
		
		if(salarioLiquido <= 350){
			
			gratificacao = salarioLiquido + 100;
			
		} else {
			
			gratificacao = salarioLiquido + 50;
			
		}
		
		System.out.println("Valor da hora trabalhada: " +valorHoraTrabalhada);
		System.out.println("Sal�rio m�s: " +salarioMes);
		System.out.println("Valor do dependente: " +valorDependete);
		System.out.println("Total hora extra: " +horaExtraTrabalhada);
		System.out.println("Sal�rio bruto: " +salarioBruto);
		System.out.println("Desconto IRRF: " +irrf);
		System.out.println("Sal�rio L�quido: " +salarioLiquido);
		System.out.println("Sal�rio L�quido com gratifica��o: " +gratificacao);
		
	}

}
