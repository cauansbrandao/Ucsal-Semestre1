package lista_09_vetores;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aux = 0, numero, primos[] = new int[10];

		System.out.println("========================================");
		System.out.println("          Vetor numeros primos");
		System.out.println("========================================");

		do {
			System.out.print("Digite um valor: ");
			numero = sc.nextInt();

			if (verificarPrimo(numero)) {
				primos[aux] = numero;
				aux++;
			}
		} while (aux < primos.length);

		System.out.println("\n\n\n========================================");
		System.out.println("          Vetor numeros primos");
		System.out.println("========================================");
		System.out.println("Segue o vetor com todos os numeros primos digitados: \n");

		for (int i = 0; i < primos.length; i++) {
			System.out.print(primos[i]);

			if ((i + 1) < primos.length) {
				System.out.print(" -> ");
			}
		}

		sc.close();
	}

	public static boolean verificarPrimo(int valor) {

		if (valor <= 1 || valor == 2) {
			return false;
		}

		for (int i = 2; i < valor; i++) {
			if (valor % i == 0) {
				return false;
			}
		}

		return true;
	}
}
