package lista_10_matrizes;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		int[][] A = new int[4][4];

		System.out.println("========================================");
		System.out.println("          Matriz e permutacao?");
		System.out.println("========================================\n");

		preencherMatriz(A);

		System.out.println("\n\n\n========================================");
		System.out.println("          Matriz e permutacao?");
		System.out.println("========================================\n");
		if (verificarPermutacao(A)) {
			System.out.println("A matriz informada e uma permutacao!");
		} else {
			System.out.println("A matriz informada NAO e uma permutacao!");
		}
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

	public static boolean verificarPermutacao(int[][] matriz) {
		int aux;
		for (int i = 0; i < matriz.length; i++) {
			aux = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] != 0 && matriz[i][j] != 1) {
					return false;
				}

				if (matriz[i][j] == 1) {
					aux++;
				}

				if (aux > 1) {
					return false;
				}
			}
		}
		return true;
	}
}
