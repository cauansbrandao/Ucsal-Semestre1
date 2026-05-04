package lista_11_matrizes;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		System.out.println("===========================================");
		System.out.println("          Preencher Matriz Coluna");
		System.out.println("===========================================\n");

		preencherMatriz(matriz);

		System.out.println("\n\n\n===========================================");
		System.out.println("          Preencher Matriz Coluna");
		System.out.println("===========================================\n");
		System.out.println("Resultado: ");

		mostrarMatriz(matriz);

		sc.close();
	}

	public static void preencherMatriz(int[][] matriz) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Digite o valor da posicao [" + j + "][" + i + "]: ");
				System.out.print("R: ");
				matriz[j][i] = sc.nextInt();
			}
		}
		sc.close();
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
