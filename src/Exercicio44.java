import java.util.Scanner;

/* 44) Escreva um algoritmo que receba como entrada tr�s n�meros inteiros e verifique
se a soma dos mesmos � maior ou igual a 100. O algoritmo deve emitir uma mensagem
em caso positivo. */

public class Exercicio44 {
	
	public static void main(String[] args){
		
		int numero1;
		int numero2;
		int numero3;
		int soma;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		numero2 = entrada.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		numero3 = entrada.nextInt();
		
		soma = numero1 + numero2 + numero3;
		
		if(soma < 100) {
			
			System.out.print("A soma � menor que 100.");
			
			
		} else if (soma > 100) {
			
			System.out.print("A soma � maior que 100.");
			
		} else {
			
			System.out.print("A som � igual a 100.");
			
		}
		
	}

}
