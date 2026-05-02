package lista_07_strings;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String valor;
		int quantPalavras = 1;
		
		System.out.println("=========================================");
		System.out.println("          Quantas palavras tem?");
		System.out.println("=========================================");
		System.out.println("Digite sua frase: ");
		System.out.print("R: ");
		valor = sc.nextLine();
		
		for(int i = 0; i < valor.length(); i++) {
			if(valor.charAt(i) == ' ') {
				quantPalavras++;
			}
		}
		
		System.out.println("\n\n\n=========================================");
		System.out.println("          Quantas palavras tem?");
		System.out.println("=========================================");
		System.out.println("A sua frase '" + valor + "', tem " + quantPalavras++ + " palavras.");
		
		sc.close();
	}

}
