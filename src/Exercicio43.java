import java.util.Scanner;

// 43) Faça um algoritmo que receba dois números e mostre o maior.

public class Exercicio43 {
	
	public static void main(String[] args){
		
		int numero1, numero2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = entrada.nextInt();
		
		if(numero1 > numero2){
			
			System.out.print("O maior número digitado foi: " +numero1);
			
		} else if (numero2 > numero1){
			
			System.out.print("O maior número digitado foi: " +numero2);
			
		} else {
			
			System.out.print("Os números digitados são iguais.");
			
		}
		
	}

}
