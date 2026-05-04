package lista_08_vetores;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int primeiroTermo, razao, PA[];
		System.out.println("==========================================");
		System.out.println("          Progressao Aritimetica");
		System.out.println("==========================================");
		System.out.println("Digite o primeiro termo: ");
		System.out.print("R: ");
		primeiroTermo = sc.nextInt();

		System.out.println("\nDigite a razao: ");
		System.out.print("R: ");
		razao = sc.nextInt();

		do {

			System.out.println("\nDigite quantos termos deseja ver: ");
			System.out.print("R: ");
			PA = new int[sc.nextInt()];

			if (PA.length <= 0) {
				System.out.println("A quantidade deve ser > 0");
			}

		} while (PA.length <= 0);

		System.out.println("\n\n\n==========================================");
		System.out.println("          Progressao Aritimetica");
		System.out.println("==========================================");
		System.out.println("Mostrando a PA de " + primeiroTermo + " na razao " + razao + ".\n");
		PA[0] = primeiroTermo;

		for (int i = 0; i < PA.length; i++) {

			System.out.print(primeiroTermo + (i * razao));

			if ((i + 1) < PA.length) {
				System.out.print(" -> ");
			}
		}

		sc.close();

	}

}
