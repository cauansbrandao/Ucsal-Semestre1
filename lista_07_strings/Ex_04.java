package lista_07_strings;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String valor;
		
		System.out.println("==========================================");
		System.out.println("          Substituir '0' por '1' ");
		System.out.println("==========================================");
		System.out.println("Digite a frase ou palavra: ");
		System.out.print("R: ");
		valor = sc.nextLine();
		
		System.out.println("\n\n==========================================");
		System.out.println("          Substituir '0' por '1' ");
		System.out.println("==========================================");
		System.out.println("Palavra Original: " + valor);
		System.out.println("Palavra Substituida: " + valor.replace('0',  '1'));
		
		sc.close();
	}

}
