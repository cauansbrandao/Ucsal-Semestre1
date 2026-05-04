package lista_08_vetores;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vet[] = new int[5];
		int aux, menor;

		System.out.println("============================================");
		System.out.println("          Vetor em Ordem Crescente");
		System.out.println("============================================");

		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite o " + (i + 1) + " numero do vetor: ");
			System.out.print("R: ");
			vet[i] = sc.nextInt();
		}

		for (int i = 0; i < vet.length - 1; i++) {
			menor = i;

			for (int j = i + 1; j < vet.length; j++) {
				if (vet[j] < vet[menor]) {
					menor = j;
				}
			}

			aux = vet[i];
			vet[i] = vet[menor];
			vet[menor] = aux;
		}

		System.out.println("\n\n\n============================================");
		System.out.println("          Vetor em Ordem Crescente");
		System.out.println("============================================");
		System.out.println("Ordenando em ordem crescente: ");

		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}

		sc.close();
	}
}