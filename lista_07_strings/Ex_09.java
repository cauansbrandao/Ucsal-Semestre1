package lista_07_strings;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		
		System.out.println("=================================================");
		System.out.println("          Palavra na vertical em escada");
		System.out.println("=================================================");	
		System.out.println("Digite sua palavra: ");
		System.out.print("R: ");
		nome = sc.nextLine();
		
		System.out.println("\n\n\n=================================================");
		System.out.println("          Palavra na vertical em escada");
		System.out.println("=================================================");	
		System.out.println("Palavra Original: ");
		System.out.println(nome);
		System.out.print("\nPalavra na Vertical em Escada: ");
		
		for(int i = 0; i <= nome.length(); i++) {
			System.out.println(nome.substring(0, i));
		}
		
		sc.close();
	}

}
