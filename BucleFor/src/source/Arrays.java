package source;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame una palabra");
		String palabra = scanner.next();
		
		char[] p = palabra.toCharArray();
		
		for(int count = 0; count < p.length; count++) {
			System.out.println(p[count]);
		}
		
		int x = 0;
		scanner.close(); // Cerramos el scanner para liberar recursos
	}
}
