package lista_02_Java_condicional;
import java.util.Scanner;
public class Ex_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quant;
		
		// Título
		System.out.println("====================================");
		System.out.println("          Quitanda do Zeca");
		System.out.println("====================================\n");
		System.out.println("Maças: SUPER PROMOCAO!!!!");
		System.out.println("Leve 12+ maças pelo preco\nDe: R̵$̵ ̵0̵,̵3̵0̵  Por: R$ 0,25");
		
		// Entrada de dados
		System.out.println("\nQuantas maças deseja? ");
		System.out.print("R: ");
		quant = sc.nextInt();
		
		// Cálculo e mostrar resultados
		if(quant >= 12) {
			System.out.println("\nVoce aproveitou a promoçao e levou " + quant + " maças, com o valor saindo por 0.25 cada, o valor total fica R$" + quant * 0.25 + ".");
		} else {
			System.out.println("\nVoce nao aproveitou a promocao e levou "+ quant + " maças, com o valor saindo por 0.30 cada, o valor total fica R$" + quant * 0.3 + ".");
		}
		
		sc.close();
	}
}