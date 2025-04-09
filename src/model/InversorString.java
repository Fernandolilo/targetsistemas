package model;

import java.util.Scanner;

public class InversorString {
	public static void executar() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite uma string para inverter: ");
		String texto = scanner.nextLine();

		String invertida = "";
		for (int i = texto.length() - 1; i >= 0; i--) {
			invertida += texto.charAt(i);
		}

		System.out.println("String invertida: " + invertida);
		scanner.close();
	}
}
