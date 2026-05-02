package lista_07_strings;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String valor;
		
		System.out.println("=======================================");
		System.out.println("          De tras para frente");
		System.out.println("=======================================");
		System.out.println("Digite sua frase ou palavra: ");
		System.out.print("R: ");
		valor = sc.nextLine();
		
		System.out.println("\n\n\n=======================================");
		System.out.println("          De tras para frente");
		System.out.println("=======================================");
		System.out.println("Palavra/Frase Original: ");
		System.out.println(valor);
		System.out.println("\nPalavra/Frase Modificada: ");
		for(int i = valor.length() - 1; i >= 0; i--) {
			System.out.print(valor.charAt(i));
		}
		
		sc.close();
	}

}
