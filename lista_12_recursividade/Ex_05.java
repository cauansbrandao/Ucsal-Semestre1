package lista_12_recursividade;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vet[] = new int[4];
		int inicio = 0, fim = vet.length - 1;
		
		System.out.println("====================================");
		System.out.println("          Invertendo Vetor");
		System.out.println("====================================\n");

		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite o valor da posicao " + i + " do vetor: ");
			System.out.print("R: ");
			vet[i] = sc.nextInt();
		}

		System.out.println("====================================");
		System.out.println("          Invertendo Vetor");
		System.out.println("====================================\n");
		System.out.println("Vetor Original: ");

		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i]);

			if ((i + 1) < vet.length) {
				System.out.print(" | ");
			}
		}

		inverterVetor(vet, inicio, fim);
		System.out.println("\n\nVetor Modificado: ");

		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i]);

			if ((i + 1) < vet.length) {
				System.out.print(" | ");
			}
		}

		sc.close();
	}

	public static void inverterVetor(int[] vet, int inicio, int fim) {
		if (inicio >= fim) {
			return;
		}
		int temp = vet[inicio];
		vet[inicio] = vet[fim];
		vet[fim] = temp;

		inverterVetor(vet, inicio + 1, fim - 1);
	}
}
