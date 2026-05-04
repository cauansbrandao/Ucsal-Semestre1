package lista_12_recursividade;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base, expoente;

		System.out.println("=====================================");
		System.out.println("          Calcular a Potencia");
		System.out.println("=====================================\n");
		System.out.println("Digite o numero da base: ");
		System.out.print("R: ");
		base = sc.nextInt();

		System.out.println("\nDigite o numero do expoente: ");
		System.out.print("R: ");
		expoente = sc.nextInt();

		System.out.println("\n\n\n=====================================");
		System.out.println("          Calcular a Potencia");
		System.out.println("=====================================\n");
		System.out.println("A potencia de " + base + "^" + expoente + " = " + calcularPotencia(base, expoente));

		sc.close();
	}

	public static int calcularPotencia(int base, int expoente) {
		if (expoente <= 0) {
			return 1;
		}
		return base * calcularPotencia(base, expoente - 1);
	}
}
