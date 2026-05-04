package lista_12_recursividade;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("=====================================");
		System.out.println("          Calcular Fatorial");
		System.out.println("=====================================\n");
		System.out.println("Qual numero deseja ver o fatorial: ");
		System.out.print("R: ");
		num = sc.nextInt();

		System.out.println("\n\n\n=====================================");
		System.out.println("          Calcular Fatorial");
		System.out.println("=====================================\n");
		System.out.println("O fatorial de " + num + " e: " + calcularFatorial(num));

		sc.close();
	}

	public static int calcularFatorial(int num) {
		if (num <= 1) {
			return 1;
		}
		return num * calcularFatorial(num - 1);
	}
}
