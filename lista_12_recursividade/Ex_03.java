package lista_12_recursividade;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;

		System.out.println("===========================");
		System.out.println("          0 ate X");
		System.out.println("===========================\n");
		System.out.println("Digite um valor: ");
		System.out.print("R: ");
		valor = sc.nextInt();

		System.out.println("\n\n\n===========================");
		System.out.println("          0 ate " + valor);
		System.out.println("===========================\n");
		System.out.println("O valor da soma de 0 ate " + valor + " = " + calcularSoma(valor));

		sc.close();
	}

	public static int calcularSoma(int valor) {
		if (valor <= 1) {
			return 1;
		}
		return valor + calcularSoma(valor - 1);
	}

}
