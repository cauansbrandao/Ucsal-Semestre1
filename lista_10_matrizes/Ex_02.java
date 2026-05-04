package lista_10_matrizes;

import java.util.Random;
import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] A = new int[100][100], B = new int[10000][2];
		System.out.println("=============================");
		System.out.println("          Matriz AxB");
		System.out.println("=============================\n");

		preencherMatrizAleatorio(A);

		contarValoresMatriz(A, B);

		System.out.println("\n\n\n=============================");
		System.out.println("          Matriz AxB");
		System.out.println("=============================\n");
		mostrarMatriz(B);

		sc.close();
	}

	public static void preencherMatrizAleatorio(int[][] matriz) {
		Random rand = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(1, 100);
			}
		}
	}

	public static void contarValoresMatriz(int[][] A, int[][] B) {
		int ocupados = 0;
		boolean encontrado;

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				int valor = A[i][j];
				encontrado = false;

				for (int k = 0; k < ocupados; k++) {
					if (B[k][0] == valor) {
						B[k][1]++;
						encontrado = true;
						break;
					}
				}

				if (!encontrado) {
					B[ocupados][0] = valor;
					B[ocupados][1] = 1;
					ocupados++;
				}
			}
		}
	}

	public static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][1] != 0) {
				System.out.println("Valor " + matriz[i][0] + " -> " + matriz[i][1] + " vezes");
			}
		}
	}
}
