package lista_01_Java_E_S;
import java.util.Scanner;
public class Ex_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		float val, tot = 0;
		
		// Título
		System.out.println("============================================");
		System.out.println("          Somando conta do cliente");
		System.out.println("============================================\n");
		System.out.println("Digite os valores gastos: (Digite 0 para finalizar)");
		
		  // Lê valores até digitar 0
		while(cont < 1) {
			System.out.print("R$: ");
			val = sc.nextFloat();
			
			if(val != 0) {
				tot = tot + val; // Soma ao total
			} else {
				cont++; // Encerra o loop
			}
		}
		
		// Mostra o resultado
		System.out.println("\n============================================");
		System.out.println("O valor total dos itens fica: R$"+ tot);
		System.out.println("Com os 10% do garçom fica: R$" + (tot + (tot / 10)));
		System.out.println("============================================");

		sc.close();
	}
}