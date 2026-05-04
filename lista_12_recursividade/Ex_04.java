package lista_12_recursividade;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int divisor, dividendo;

		System.out.println("===================================");
		System.out.println("          Divisao Inteira");
		System.out.println("===================================\n");
		System.out.println("Digite o valor do dividendo: ");
		System.out.print("R: ");
		dividendo = sc.nextInt();

		System.out.println("\nDigite o valor do divisor: ");
		System.out.print("R: ");
		divisor = sc.nextInt();

		System.out.println("\n\n\n===================================");
		System.out.println("          Divisao Inteira");
		System.out.println("===================================\n");
		System.out.println("O valor da divisao inteira de " + dividendo + " ÷ " + divisor + " = "
				+ calcularDivisao(dividendo, divisor));

		sc.close();
	}

	public static int calcularDivisao(int dividendo, int divisor) {
		if (divisor == 0) {
			System.out.println("Erro: divisao por zero");
			return 0;
		}

		if (dividendo < divisor) {
			return 0;
		}

		return 1 + calcularDivisao(dividendo - divisor, divisor);
	}

}
