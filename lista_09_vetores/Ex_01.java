package lista_09_vetores;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vet[] = new int[20];
		int valor, primeira = 0, ultima = 0;

		System.out.println("===============================================");
		System.out.println("          Organizar Vetor Par e Impar");
		System.out.println("===============================================");

		do {
			System.out.println("Digite um valor inteiro: ");
			valor = sc.nextInt();

			if (valor % 2 == 0 && ultima < (vet.length / 2)) {
				vet[ultima] = valor;
				ultima++;
			} else if (primeira < (vet.length / 2)) {
				vet[primeira + (vet.length / 2)] = valor;
				primeira++;
			}

		} while ((ultima + primeira) < vet.length);

		System.out.println("\n\n\n===============================================");
		System.out.println("          Organizar Vetor Par e Impar");
		System.out.println("===============================================");
		System.out.println("O vetor foi organizado! (Pares -> Impares)\n");

		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i]);

			if ((i + 1) < vet.length) {
				System.out.print(" -> ");
			}
		}

		sc.close();
	}

}
