package lista_07_strings;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String valor;
		char letra;
		int quant = 0;
		
		System.out.println("=====================================");
		System.out.println("          Quantas letras X?");
		System.out.println("=====================================");
		System.out.println("Digite a frase ou palavra: ");
		System.out.print("R: ");
		valor = sc.nextLine();
		
		System.out.println("\nDigite qual letra quer contar: ");
		System.out.print("R: ");
		letra = sc.next().toUpperCase().charAt(0);
		
		for(int i = 0; i < valor.length(); i++) {
			if(valor.toUpperCase().charAt(i) == letra) {
				quant++;
			}
		}

		System.out.println("\n\n\n=====================================");
		System.out.println("          Quantas letras " + letra + "?");
		System.out.println("=====================================");
		System.out.println("Na palavra: " + valor);
		System.out.println("Foram encontradas " + quant + " letras " + letra);
		
		sc.close();
	}

}
