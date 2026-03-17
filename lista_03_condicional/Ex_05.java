package lista_03_condicional;
import java.util.Scanner;
public class Ex_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float saldomed;
		
		System.out.println("====================================");
		System.out.println("          Credito Especial");
		System.out.println("====================================\n");	
		System.out.println("Verificaçao de credito especial: ");
		System.out.print("Saldo médio: ");
		saldomed = sc.nextFloat();
		
		System.out.println("\n\n\n\n\n");
		System.out.println("====================================");
		System.out.println("          Credito Especial");
		System.out.println("====================================\n");	
		System.out.println("Saldo médio: " + saldomed);
		System.out.print("Percentual: ");
		
		if(saldomed <= 200) {
			System.out.println("Nenhum Credito!");
		} else if(saldomed > 200 && saldomed <= 400) {
			System.out.println("20% do valor do saldo medio!");
			System.out.println("Valor Credito: " + (saldomed + saldomed * 0.2));
		} else if(saldomed > 400 && saldomed <=600) {
			System.out.println("30% do valor do saldo medio!");
			System.out.println("Valor Credito: " + (saldomed + saldomed * 0.3));
		} else {
			System.out.println("40% do valor do saldo medio!");
			System.out.println("Valor Credito: " + (saldomed + saldomed * 0.4));
		}
		
		sc.close();
	}
}
