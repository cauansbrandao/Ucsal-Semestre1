package lista_11_matrizes;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		String nomes[] = new String[2];
		double notas[][] = new double[nomes.length][4];

		System.out.println("===============================");
		System.out.println("          Mini Escola");
		System.out.println("===============================");

		preencherAlunos(nomes, notas);

		System.out.println("===============================");
		System.out.println("          Mini Escola");
		System.out.println("===============================");
		mostrarDados(nomes, notas);

	}

	public static void preencherAlunos(String[] nomes, double[][] notas) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("\nDigite o nome do " + (i + 1) + "º aluno: ");
			System.out.print("R: ");
			nomes[i] = sc.nextLine();

			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("\nDigite a nota " + (j + 1) + " do aluno: ");
				System.out.print("R: ");
				notas[i][j] = sc.nextDouble();
				sc.nextLine();
			}
			System.out.println("----------------------------");
		}

		sc.close();
	}

	public static void mostrarDados(String[] nomes, double[][] notas) {
		double media;
		for (int i = 0; i < nomes.length; i++) {
			media = 0;
			System.out.println("Nome: " + nomes[i]);
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Nota " + (j + 1) + ": " + notas[i][j]);
				media += notas[i][j];
			}
			media /= notas[i].length;
			System.out.println("Media: " + media);
			System.out.println();
		}

		//
	}
}
