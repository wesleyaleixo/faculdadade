import java.util.Scanner;

public class AlgoritmoHoras {
	
	public static void main(String[] args){
		
		
		int horas, minuto = 0, hora = 0, restante = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite as horas: ");
		horas = entrada.nextInt();
		
		if((horas < 800) || (horas > 2359)){
			
			System.out.println("Hora inv�lida.");
			
		} else {
			
			hora = horas / 100;
			minuto = horas % 100;
			restante = horas - 800;
			
			System.out.println("S�o " +hora+ " horas e " +minuto+ " Minutos.\n" + "J� se passaram " +restante+ " minutos desde �s 8:00.");
			
		}
		
		System.out.print("Fim do programa.");
		
	}

}
