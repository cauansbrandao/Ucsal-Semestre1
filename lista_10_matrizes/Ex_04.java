package lista_10_matrizes;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] triangulo;
		int quant;

		System.out.println("=========================================");
		System.out.println("          Coeficiente Binominal");
		System.out.println("=========================================\n");
		System.out.println("Quantas linhas do triangulo de Pascal deseja ver: ");
		System.out.print("R: ");
		quant = sc.nextInt();

		triangulo = new int[quant][quant];
		triangulo[0][0] = 1;

		calcularTrianguloPascalMatriz(triangulo);

		System.out.println("\n\n\n=========================================");
		System.out.println("          Coeficiente Binominal");
		System.out.println("=========================================\n");
		mostrarMatriz(triangulo);

		sc.close();
	}

	public static void calcularTrianguloPascalMatriz(int[][] triangulo) {
		for (int i = 1; i < triangulo.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					triangulo[i][j] = 1;
				} else {
					triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
				}
			}
		}
	}

	public static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] != 0) {
					System.out.print(matriz[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

}
