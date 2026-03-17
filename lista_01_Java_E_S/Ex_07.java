package lista_01_Java_E_S;
import java.util.Scanner;
public class Ex_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, n, quant, cont = 0;
		
		 // Título
		System.out.println("========================================================");
		System.out.println("                Progressao Aritimetica");
		System.out.println("========================================================\n");

		 // Entrada de dados
		System.out.println("Digite os 2 primerios termos da progressão aritimetica: ");
		System.out.print("Termo 1: ");
		a = sc.nextInt();
		System.out.print("Termo 2: ");
		n = sc.nextInt();
		System.out.println("");
		System.out.println("Quantos termos deseja? ");
		System.out.print("Quant: ");
		quant = sc.nextInt();
		
		// Mostra a sequência
		System.out.println("\n========================================================");
		System.out.print(a);
		while(cont < quant) {
			a = a + n; // Cálcula o próximo termo
			System.out.print(", " + a);
			cont++;
		}
		System.out.print("\n========================================================");
		
		sc.close();
	}
}