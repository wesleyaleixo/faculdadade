import java.util.Scanner;

// 43) Fa�a um algoritmo que receba dois n�meros e mostre o maior.

public class Exercicio43 {
	
	public static void main(String[] args){
		
		int numero1, numero2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		numero2 = entrada.nextInt();
		
		if(numero1 > numero2){
			
			System.out.print("O maior n�mero digitado foi: " +numero1);
			
		} else if (numero2 > numero1){
			
			System.out.print("O maior n�mero digitado foi: " +numero2);
			
		} else {
			
			System.out.print("Os n�meros digitados s�o iguais.");
			
		}
		
	}

}
