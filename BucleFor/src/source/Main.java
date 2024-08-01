package source;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i, j = 0; // Inicializamos 'j'
		for(i = 1; i < 10; i++) {
			System.out.println("i: " + i + " - j: " + j);
			// Opcional: incrementar j para mostrar cambios en cada iteración
			j++;
		}
		scanner.close(); // Cerramos el scanner
	}
}
