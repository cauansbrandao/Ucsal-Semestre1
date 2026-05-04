package lista_08_vetores;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nomes[] = new String[6];
		int opc, nulo = 0, ganhador = 1, quantVotos[] = new int[nomes.length];

		System.out.println("===================================");
		System.out.println("          Urna Eletronica");
		System.out.println("===================================");

		nomes[0] = "BRANCO";
		for (int i = 1; i < nomes.length; i++) {
			System.out.println("Digite o nome do " + i + " candidato: ");
			System.out.print("R: ");
			nomes[i] = sc.nextLine();
		}

		do {
			System.out.println("\n\n\n\n\n\n\n\n\n\n" + "===================================");
			System.out.println("          Urna Eletronica");
			System.out.println("===================================");
			System.out.println("!! Para finalizar, digite um numero < 0 !!\n");

			for (int i = 0; i < nomes.length; i++) {
				System.out.println("(" + i + ") " + nomes[i]);
			}

			System.out.print("Digite o numero do seu voto: ");
			opc = sc.nextInt();

			if (opc > nomes.length) {
				nulo++;
			} else if (opc >= 0 && opc <= nomes.length) {
				quantVotos[opc]++;
			}

		} while (opc >= 0);

		System.out.println("\n\n\n===================================");
		System.out.println("          Urna Eletronica");
		System.out.println("===================================");
		System.out.println("Resultados: \n");
		System.out.println("NULOS -> " + nulo + " votos anulados.");
		System.out.println("BRANCOS -> " + quantVotos[0] + " votos em branco.");
		for (int i = 1; i < nomes.length; i++) {
			System.out.println(nomes[i] + " -> " + quantVotos[i] + " votos.");

			if (quantVotos[i] > quantVotos[ganhador]) {
				ganhador = i;
			}
		}

		System.out.println("\nO ganhador e: " + nomes[ganhador] + " com " + quantVotos[ganhador] + " votos!");

		sc.close();
	}

}
