package lista_09_vetores;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int termo1, termo2, razao, PA[] = new int[20];

		System.out.println("==========================================");
		System.out.println("          Progressao Aritimetica");
		System.out.println("==========================================\n");
		System.out.print("Digite o primeiro termo: ");
		termo1 = sc.nextInt();
		System.out.print("Digite o segundo termo: ");
		termo2 = sc.nextInt();

		razao = termo2 - termo1;

		PA[0] = termo1;
		for (int i = 1; i < PA.length; i++) {
			PA[i] = termo1 + (razao * i);
		}

		System.out.println("\n\n\n==========================================");
		System.out.println("          Progressao Aritimetica");
		System.out.println("==========================================");
		System.out.println("Esses sao os " + PA.length + " primeiros termos da PA: \n");

		for (int i = 0; i < PA.length; i++) {
			System.out.print(PA[i]);

			if ((i + 1) < PA.length) {
				System.out.print(" -> ");
			}
		}

		sc.close();
	}
}
