import java.util.Scanner;

/* Escreva um algoritmo que leia um n�mero e, caso ele seja positivo, imprima seu
inverso. Caso contr�rio, imprima seu valor absoluto. */

public class Exercicio50 {
	
	public static void main(String[] args){
		
		float numero, inverso, absoluto;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		numero = entrada.nextFloat();
		
		if(numero > 0){
			
			inverso = numero / 1;
			
			System.out.print("Inverso: " +inverso);
			
		} else {
			
			absoluto = numero * (-1);
			
			System.out.print("Absoluto: " +absoluto);
			
		}
		
		
	}

}
