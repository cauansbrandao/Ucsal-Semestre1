package lista_07_strings;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String valor;
		int quant = 0;
		
		System.out.println("===================================");
		System.out.println("          Contador de 1's");
		System.out.println("===================================");
		System.out.println("Digite a palavra ou frase: ");
		System.out.print("R: ");
		valor = sc.nextLine();
		
		for(int i = 0; i < valor.length(); i++) {
			if(valor.charAt(i) == '1') {
				quant++;
			}
		}
		
		System.out.println("\n\n===================================");
		System.out.println("          Contador de 1's");
		System.out.println("===================================");
		System.out.println("Foram encontrados " + quant + " numeros 1");
		
		sc.close();
	}

}
