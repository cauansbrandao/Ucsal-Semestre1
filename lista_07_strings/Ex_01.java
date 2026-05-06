package lista_07_strings;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;

		System.out.println("===================================");
		System.out.println("          Filtro de Nomes");
		System.out.println("===================================");
		System.out.println("Digite um nome: ");
		nome = sc.next();

		if (nome.toUpperCase().charAt(0) == 'A') {
			System.out.println("\n" + nome);
		}

		sc.close();
	}

}
