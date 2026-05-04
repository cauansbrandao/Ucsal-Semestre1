package lista_11_matrizes;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[4][4];

		System.out.println("=============================================");
		System.out.println("          0 para impar e 1 para par");
		System.out.println("=============================================\n");

		preencherMatriz0e1(matriz);

		System.out.println("Resultado: ");
		mostrarMatriz(matriz);

		sc.close();
	}

	public static void preencherMatriz0e1(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i % 2 == 0) {
					matriz[j][i] = 0;
				} else {
					matriz[j][i] = 1;
				}
			}
		}
	}

	public static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}
