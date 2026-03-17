package lista_01_Java_E_S;

import java.util.Scanner;

public class Ex_01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double celsius, fahrenheit;

		// Lê a temperatura em Celsius
		System.out.print("Digite a temperatura atual em Centigrados: ");
		celsius = sc.nextDouble();

		// Processamento (Fórmula: F = ((celsius * 9) + 160) / 5
		fahrenheit = ((celsius * 9) + 160) / 5; // OU F = ((celsius * 9 / 5) + 32) 

		// Mostra o resultado
		System.out.println("\n========================================================");
		System.out.println("Convertendo o valor de centigrados para fahrenheits.");
		System.out.println("O valor convertido fica " + fahrenheit + " fahrenheits.");
		System.out.println("========================================================");

		sc.close();
	}

}
