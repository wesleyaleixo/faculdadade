import java.util.Scanner;

/* 48) Escreva um algoritmo verifique a validade de uma senha fornecida pelo usuário. A
senha válida é um conjunto de caracteres “ASDFG”. O algoritmo deve imprimir uma
mensagem de permissão ou de negação de acesso. */

public class Exercicio48 {
	
	public static void main(String[] args){
		
		String senha;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a senha de acesso: ");
		senha = entrada.next();

		
		if(senha == "ASDFG"){
			
			System.out.print("Acesso permitido.");
			
		} else {
			
			System.out.print("Acesso negado.");
			
		}
		
		
	}

}
