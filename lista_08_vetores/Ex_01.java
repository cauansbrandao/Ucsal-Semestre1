package lista_08_vetores;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nomes[] = new String[2];
		int aux = 0, idades[] = new int[2];
		double media = 0;

		System.out.println("=========================================");
		System.out.println("          Idade acima da media?");
		System.out.println("=========================================");
		for (int i = 0; i < idades.length; i++) {
			System.out.println("\nDigite o nome da " + (i + 1) + " pessoa: ");
			System.out.print("R: ");
			nomes[i] = sc.nextLine();
			System.out.println("Digite a idade da " + (i + 1) + " pessoa: ");
			System.out.print("R: ");
			aux += idades[i] = sc.nextInt();
			sc.nextLine();
		}

		media = (double) aux / idades.length;

		System.out.println("=========================================");
		System.out.println("          Idade acima da media?");
		System.out.println("=========================================");
		System.out.println("A media das idades é: " + media);
		System.out.println("\nO nome da(as) pessoa(as) acima da media e(sao): ");
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] > media) {
				System.out.println(nomes[i] + " -> " + idades[i] + " anos.");
			}
		}

		sc.close();
	}

}
