import java.util.Scanner;

/* 44) Escreva um algoritmo que receba como entrada três números inteiros e verifique
se a soma dos mesmos é maior ou igual a 100. O algoritmo deve emitir uma mensagem
em caso positivo. */

public class Exercicio44 {
	
	public static void main(String[] args){
		
		int numero1;
		int numero2;
		int numero3;
		int soma;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = entrada.nextInt();
		System.out.print("Digite o terceiro número: ");
		numero3 = entrada.nextInt();
		
		soma = numero1 + numero2 + numero3;
		
		if(soma < 100) {
			
			System.out.print("A soma é menor que 100.");
			
			
		} else if (soma > 100) {
			
			System.out.print("A soma é maior que 100.");
			
		} else {
			
			System.out.print("A som é igual a 100.");
			
		}
		
	}

}
