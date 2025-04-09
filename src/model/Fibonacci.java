package model;

import java.util.Scanner;

public class Fibonacci {

	public static void executar() {
		Scanner scanner = new Scanner(System.in);

		int indice = 13, soma = 0;
		for (int k = 1; k < indice; k++) {
			soma += k;
		}
		System.out.println("Resultado da soma até " + indice + ": " + soma);

		System.out.print("Informe um número limite para a sequência de Fibonacci: ");
		int limite = scanner.nextInt();
		scanner.nextLine(); // limpar quebra de linha

		int a = 0, b = 1;
		System.out.println("Sequência de Fibonacci até " + limite + ":");
		while (a <= limite) {
			System.out.print(a + " ");
			int proximo = a + b;
			a = b;
			b = proximo;
		}
		System.out.println();
	}

}
