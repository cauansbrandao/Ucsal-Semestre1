package lista_08_vetores;

import java.util.Random;
import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nivel = 1;
		char[] sequencia = new char[0];
		boolean ganhou = true;

		System.out.println("===============================");
		System.out.println("          Jogo Genius");
		System.out.println("===============================\n");
		System.out.println("Pressione Enter para começar!");
		sc.nextLine();

		do {
			limparTela();

			System.out.println("===============================");
			System.out.println("          Jogo Genius");
			System.out.println("===============================");
			System.out.println("\nNível: " + nivel);

			sequencia = aumentarSequencia(sequencia);

			sequencia[sequencia.length - 1] = (char) ('0' + sortearNumero(nivel));

			System.out.print("Memorize: ");
			for (int i = 0; i < sequencia.length; i++) {
				System.out.print(sequencia[i] + " ");
			}

			System.out.println("\n\nPressione Enter quando estiver pronto!");
			sc.nextLine();

			limparTela();

			System.out.print("Digite a sequência: ");
			String tentativa = sc.next();
			sc.nextLine();

			ganhou = verificarAcerto(sequencia, tentativa);

			if (!ganhou) {
				System.out.println("\nVocê errou!");
				System.out.print("Sequência correta: ");
				for (int i = 0; i < sequencia.length; i++) {
					System.out.print(sequencia[i] + " ");
				}
				break;
			}

			if (sequencia.length == 10) {
				nivel++;
				sequencia = new char[0];
				System.out.println("\nParabéns! Avançando para o nível " + nivel);
				sc.nextLine();
			}

		} while (ganhou);

		System.out.println("\nFim de jogo!");
		sc.close();
	}

	public static char[] aumentarSequencia(char[] sequencia) {
		char[] nova = new char[sequencia.length + 1];

		for (int i = 0; i < sequencia.length; i++) {
			nova[i] = sequencia[i];
		}

		return nova;
	}

	public static boolean verificarAcerto(char[] sequencia, String tentativa) {
		if (tentativa.length() != sequencia.length) {
			return false;
		}

		for (int i = 0; i < sequencia.length; i++) {
			if (tentativa.charAt(i) != sequencia[i]) {
				return false;
			}
		}

		return true;
	}

	public static int sortearNumero(int nivel) {
		Random rand = new Random();
		return rand.nextInt(nivel * 3) + 1;
	}

	public static void limparTela() {
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}
	}
}