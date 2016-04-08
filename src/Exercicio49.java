import java.text.DecimalFormat;
import java.util.Scanner;

/* 49) Escreva um algoritmo que receba o valor do salário mínimo, o número de horas
trabalhadas, o número de dependentes do funcionário e a quantidade de horas extras
trabalhadas. Calcule e mostre o salário do funcionário de acordo com as regras a seguir:
- o valor da hora trabalhada é igual a 1/5 do salário mínimo;
- o salário do mês é igual ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;
- para cada dependente acrescentar R$ 32,00;
- para cada hora extra trabalhada, calcular o valor da hora trabalhada acrescida de 50%;
- o salário bruto é igual ao salário do mês mais o valor dos dependentes mais o valor das horas extras;
- calcular o valor do imposto de renda retido na fonte de acordo com a tabela a seguir:

				IRRF Salário bruto
			Isento Inferior a R$ 200,00
			10% De R$ 200,00 até R$ 500,00
			20% Superior a R$ 500,00

- o salário líquido é igual ao salário bruto menos IRRF;
- a gratificação segue a tabela a seguir:

				Salário Líquido Gratificação
			Até R$ 350,00 R$ 100,00
			Superior a R$ 350,00 R$ 50,00

- o salário do funcionário é igual ao salário líquido mais gratificação. */

public class Exercicio49 {
	
	public static void main(String[] args){
		
		float salarioMinimo, horaTrabalhada, dependente, valorHoraTrabalhada, salarioMes, valorDependete, horaExtraTrabalhada, salarioBruto, irrf, salarioLiquido, gratificacao;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do salário mínimo: ");
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
		System.out.println("Salário mês: " +salarioMes);
		System.out.println("Valor do dependente: " +valorDependete);
		System.out.println("Total hora extra: " +horaExtraTrabalhada);
		System.out.println("Salário bruto: " +salarioBruto);
		System.out.println("Desconto IRRF: " +irrf);
		System.out.println("Salário Líquido: " +salarioLiquido);
		System.out.println("Salário Líquido com gratificação: " +gratificacao);
		
	}

}
