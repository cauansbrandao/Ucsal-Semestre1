package lista_09_vetores;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maiorValor, posMaior, vet[] = new int[10];

		System.out.println("==========================================");
		System.out.println("          Qual posicao do maior?");
		System.out.println("==========================================");

		System.out.print("Digite um valor: ");
		vet[0] = maiorValor = sc.nextInt();
		posMaior = 0;

		for (int i = 1; i < vet.length; i++) {
			System.out.print("Digite outro valor: ");
			vet[i] = sc.nextInt();

			if (vet[i] > maiorValor) {
				posMaior = i;
				maiorValor = vet[i];
			}
		}

		System.out.println("\n\n\n==========================================");
		System.out.println("          Qual posicao do maior?");
		System.out.println("==========================================");
		System.out.println("O maior valor e " + maiorValor + "!");
		System.out.println("Esse valor esta na posicao " + posMaior + " do vetor!");

		sc.close();
	}

}
