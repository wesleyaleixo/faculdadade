import java.util.Scanner;

/* 46) Escreva um algoritmo que receba uma medida em p�s, fa�a as convers�es a seguir
e mostre os resultados.
a) polegadas
b) jardas
c) milhas
Sabe-se que:
1 p� = 12 polegadas
1 jarda = 3 p�s
1 milha = 1760 jardas */

public class Exercicio46 {
	
	public static void main(String[] args){
		
		int pes, polegadas, jardas, milhas;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a medida em P�s para convers�o: ");
		pes = entrada.nextInt();

		
		polegadas = pes * 12;
		jardas = pes / 3;
		milhas = jardas / 1760;
		
		System.out.print("Polegadas: " +polegadas+ "\nJardas: " +jardas+ "\nMilhas: " +milhas);
		
	}

}
