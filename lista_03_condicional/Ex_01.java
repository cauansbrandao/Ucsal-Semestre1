package lista_03_condicional;
import java.util.Scanner;
public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		// Título
		System.out.println("=========================================================");
		System.out.println("          Par ou impar? / Positivo ou negativo?");
		System.out.println("=========================================================\n");
		
		// Entrada de dados
		System.out.println("Digite um numero: ");
		System.out.println("R: ");
		num = sc.nextInt();
		
		// Mostra se o numero é positivo ou negativo e par ou impar
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("\nO numero digitado é um numero positivo e par!");
			} else {
				System.out.println("\nO numero digitado é um numero positivo e impar!");
			}
		} else {
			if(num < 0) {
				if(num % 2 == 0) {
					System.out.println("\nO numero digitado é um numero negativo e par!");
				} else {
					System.out.println("\nO numero digitado é um numero negativo e impar!");
				}
			}
		}
		
		sc.close();
	}
}