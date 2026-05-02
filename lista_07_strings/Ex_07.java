package lista_07_strings;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String valor;
		
		System.out.println("=======================================");
		System.out.println("          Palavra na vertical");
		System.out.println("=======================================");
		System.out.println("Digite a palavra ou frase: ");
		System.out.print("R: ");
		valor = sc.nextLine();
		
		System.out.println("\n\n\n=======================================");
		System.out.println("          Palavra na vertical");
		System.out.println("=======================================");
		System.out.println("Palavra Original: ");
		System.out.println(valor);
		System.out.println("\nPalavra na Vertical:");
		for(int i = 0; i < valor.length(); i++) {
			System.out.println(valor.charAt(i));
		}
		
		sc.close();
	}

}
