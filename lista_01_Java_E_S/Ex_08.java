package lista_01_Java_E_S;
import java.util.Scanner;
public class Ex_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val, nota50 = 0, nota10 = 0, nota5 = 0, nota1 = 0;
		
		// Título
		System.out.println("===============================================");
		System.out.println("               Caixa Eletronico");
		System.out.println("===============================================\n");
		
		// Entrada de valor a sacar
		System.out.print("Digite o valor que desenja retirar: ");
		val = sc.nextInt();
		
		  // Calcula quantidade de cada nota
		while(val >= 50) { val -= 50; nota50++; }
		while(val >= 10) { val -= 10; nota10++; }
		while(val >= 5)  { val -= 5 ; nota5++;  }
		while(val >= 1)  { val -= 1 ; nota1++;  }
		
		// Mostrar o resultado
		System.out.println("\n===============================================");
		System.out.println("A melhor forma de te entregar o valor seria:");
		System.out.println("Nota de R$50: " + nota50);
		System.out.println("Nota de R$10: " + nota10);
		System.out.println("Nota de R$5: " + nota5);
		System.out.println("Moeda de R$1: " + nota1);
		System.out.println("Ficando um total de " + (nota50 + nota10 + nota5 + nota1) + " notas.");
		System.out.println("===============================================");
		
		sc.close();
	}
}