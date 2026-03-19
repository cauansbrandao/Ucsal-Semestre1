package lista_06_modularização;
import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		// Título
		System.out.println("=============================================");
		System.out.println("          Soma dos X números primos");
		System.out.println("=============================================\n");
		
		// Entrada de dados
		System.out.print("Digite quantos números primos deseja somar: ");
		num = sc.nextInt();
		
		System.out.println("\n---------------------------------------------\n");
		
		// Chamada do método
		somaPrimos(num);
		
		sc.close();
	}
	
	// Método que soma os X primeiros números primos
	public static void somaPrimos(int quantidade) {
		int contadorPrimos = 0;  // Quantos primos já foram encontrados
		int numeroAtual = 2;     // Primeiro número a testar
		int soma = 0;            // Soma total dos primos
		
		System.out.println("Os " + quantidade + " primeiros números primos são:");
		
		// Enquanto não encontrarmos todos os primos
		while (contadorPrimos < quantidade) {
			int divisores = 0;
			
			// Conta quantos divisores o número tem
			for (int i = 1; i <= numeroAtual; i++) {
				if (numeroAtual % i == 0) {
					divisores++;
				}
			}

			// Se tiver exatamente 2 divisores, é primo
			if (divisores == 2) {
				System.out.print(numeroAtual);
				contadorPrimos++;
				soma += numeroAtual;
				
				// Adiciona "+" se não for o último
				if (contadorPrimos < quantidade) {
					System.out.print(" + ");
				}
			}
			// Testa o próximo número
			numeroAtual++;
		}
		// Mostra o resultado final
		System.out.println(" = " + soma);
	}
}