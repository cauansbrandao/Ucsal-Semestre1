package lista_10_matrizes;

import java.util.Random;
import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc, matriz[][] = new int[10][10];

		System.out.println("===========================================");
		System.out.println("          Maior valor na diagonal");
		System.out.println("===========================================\n");
		System.out.println("1 - Preencher Matriz Manualmente");
		System.out.println("2 - Preencher Matriz Automaticamente");
		do {
			System.out.print("R: ");
			opc = sc.nextInt();

			if (opc != 1 && opc != 2) {
				System.out.println("Opcao invalida! Tente Novamente!");
			}
		} while (opc < 1 && opc > 2);

		if (opc == 1) {
			preencherMatriz(matriz);
		} else {
			preencherMatrizAleatorio(matriz);
		}

		System.out.println("\n\n\n===========================================");
		System.out.println("          Maior valor na diagonal");
		System.out.println("===========================================\n");
		System.out.println("Matriz Original: ");

		mostrarMatriz(matriz);

		verificarMaior(matriz);

		System.out.println("\nMatriz Modificada: ");

		mostrarMatriz(matriz);

		sc.close();
	}

	public static void preencherMatrizAleatorio(int[][] matriz) {
		Random rand = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(1, 10);
			}
		}
	}

	public static void preencherMatriz(int[][] matriz) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("\nDigite o valor da posicao [" + i + "][" + j + "]: ");
				System.out.print("R: ");
				matriz[i][j] = sc.nextInt();
			}
		}

		sc.close();
	}

	public static void verificarMaior(int[][] matriz) {
		int pos, aux, aux2;
		for (int i = 0; i < matriz.length; i++) {
			pos = 0;
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[j][i] > matriz[pos][i]) {
					pos = j;
				}
			}
			aux = matriz[pos][i];
			aux2 = matriz[i][i];

			matriz[pos][i] = aux2;
			matriz[i][i] = aux;
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
