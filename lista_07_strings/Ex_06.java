package lista_07_strings;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String valor;
		char L1, L2;
		
		System.out.println("=======================================");
		System.out.println("          Substituindo Letras");
		System.out.println("=======================================");
		System.out.println("Digite a palavra ou frase: ");
		System.out.print("R: ");
		valor = sc.nextLine();
		
		System.out.println("\nQual letra deseja substituir? ");
		System.out.print("R: ");
		L1 = sc.next().charAt(0);
		
		System.out.println("Por qual letra deseja substituir? ");
		System.out.print("R: ");
		L2 = sc.next().charAt(0);
		
		System.out.println("\n\n\n=======================================");
		System.out.println("          Substituindo Letras");
		System.out.println("=======================================");
		System.out.println("Palavra/Frase Original: ");
		System.out.println(valor);
		System.out.println("\nPalavra/Frase Substituida: ");
		System.out.println(valor.replace(L1, L2));
		
		sc.close();
	}

}
