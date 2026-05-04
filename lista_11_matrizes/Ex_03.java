package lista_11_matrizes;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, matriz[][] = new int[4][4];

		System.out.println("===========================");
		System.out.println("          1 ou -1");
		System.out.println("===========================\n");
		System.out.println("Digite o tamanho da matriz: ");
		System.out.print("R: ");
		num = sc.nextInt();

		matriz = new int[num][num];
		preencherMatriz(matriz);

		System.out.println("\n\n\n===========================");
		System.out.println("          1 ou -1");
		System.out.println("===========================\n");

		mostrarMatriz(matriz);

		sc.close();
	}

	public static void preencherMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j > i) {
					matriz[i][j] = 1;
				} else if (j < i) {
					matriz[i][j] = -1;
				} else {
					matriz[i][j] = 0;
				}
			}
		}
	}

	public static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				if (matriz[i][j] >= 0) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
