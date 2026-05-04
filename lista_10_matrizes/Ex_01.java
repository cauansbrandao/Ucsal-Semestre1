package lista_10_matrizes;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] A, B, C;
		int tamanho;

		System.out.println("==============================");
		System.out.println("          Matriz AxB?");
		System.out.println("==============================\n");
		System.out.println("Digite o tamanho da matriz A e B: (MAX: 20)");

		do {
			System.out.print("R: ");
			tamanho = sc.nextInt();

			if (tamanho <= 0) {
				System.out.println("ERROR: O tamanho deve ser maior que 0!\n");
			} else if (tamanho > 20) {
				System.out.println("ERROR: O tamanho maximo permitido e 20!\n");
			}
		} while (tamanho <= 0 || tamanho > 20);

		A = new int[tamanho][tamanho];
		B = new int[tamanho][tamanho];
		C = new int[tamanho][tamanho];

		System.out.println("\nMatriz A: ");
		preencherMatriz(A);
		System.out.println("\nMatriz B: ");
		preencherMatriz(B);

		multiplicarMatrizes(A, B, C);

		System.out.println("==============================");
		System.out.println("          Matriz AxB?");
		System.out.println("==============================\n");
		mostrarMatriz(C);

		sc.close();
	}

	public static void preencherMatriz(int[][] matriz) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Digite o valor da posicao [" + i + "][" + j + "]");
				System.out.print("R: ");
				matriz[i][j] = sc.nextInt();
			}
		}

		sc.close();
	}

	public static void multiplicarMatrizes(int[][] A, int[][] B, int[][] C) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				C[i][j] = A[i][j] * B[i][j];
			}
		}
	}

	public static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);

				if ((j + 1) < matriz.length) {
					System.out.print("|");
				}
			}
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				if (i + 1 < matriz.length) {
					if (matriz[i][j] < 10) {
						System.out.print("--");
					} else if (matriz[i][j] < 100) {
						System.out.print("---");
					} else {
						System.out.print("----");
					}
				}
			}
			System.out.println();
		}
	}

}
