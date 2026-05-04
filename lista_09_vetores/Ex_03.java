package lista_09_vetores;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantidade[] = new int[100], aux = 0;
		double valor[] = new double[quantidade.length], total = 0;

		System.out.println("===================================");
		System.out.println("          Mini Mercadinho");
		System.out.println("===================================");
		System.out.println("Para finalizar, coloque 0 ou menos na quantidade!");

		do {
			System.out.println("\nDigite o valor: ");
			System.out.print("R: ");
			valor[aux] = sc.nextDouble();
			System.out.print("Digite a quantidade: ");
			System.out.print("R: ");
			quantidade[aux] = sc.nextInt();

			aux++;
		} while (aux < quantidade.length && quantidade[aux - 1] > 0);

		System.out.println("===================================");
		System.out.println("          Mini Mercadinho");
		System.out.println("===================================");
		System.out.println("Nota sem valor fiscal!\n");

		for (int i = 0; i < aux; i++) {
			System.out.println(quantidade[i] + " x " + valor[i] + " = " + (valor[i] * quantidade[i]));
			total += valor[i] * quantidade[i];
		}

		System.out.println("\nTotal = " + total);

		System.out.println("\nObrigado por comprar conosco, volte sempre!!");

		sc.close();
	}

}
