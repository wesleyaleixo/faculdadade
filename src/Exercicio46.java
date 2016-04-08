import java.util.Scanner;

/* 46) Escreva um algoritmo que receba uma medida em pés, faça as conversões a seguir
e mostre os resultados.
a) polegadas
b) jardas
c) milhas
Sabe-se que:
1 pé = 12 polegadas
1 jarda = 3 pés
1 milha = 1760 jardas */

public class Exercicio46 {
	
	public static void main(String[] args){
		
		int pes, polegadas, jardas, milhas;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a medida em Pés para conversão: ");
		pes = entrada.nextInt();

		
		polegadas = pes * 12;
		jardas = pes / 3;
		milhas = jardas / 1760;
		
		System.out.print("Polegadas: " +polegadas+ "\nJardas: " +jardas+ "\nMilhas: " +milhas);
		
	}

}
