package lista_03_condicional;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lado1, lado2, lado3;

		System.out.println("========================================");
		System.out.println("          Qual esse triangulo?");
		System.out.println("========================================\n");
		System.out.println("Digite os 3 lados de cada triangulo: ");
		System.out.print("Lado 1: ");
		lado1 = sc.nextInt();
		System.out.print("Lado 2: ");
		lado2 = sc.nextInt();
		System.out.print("Lado 3: ");
		lado3 = sc.nextInt();
		System.out.println("\nEsse é um triangulo ");

		if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("EQUILATERO");
			} else if ((lado1 == lado2 && lado2 != lado3) || (lado1 == lado3 && lado1 != lado2)
					|| (lado2 == lado3 && lado2 != lado1)) {
				System.out.println("ISOSCELES");
			} else if (lado1 != lado2 && lado3 != lado1 && lado2 != lado3) {
				System.out.println("ESCALENO");
			}
		}
		sc.close();
	}
}