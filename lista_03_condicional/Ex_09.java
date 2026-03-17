package lista_03_condicional;
import java.util.Scanner;
public class Ex_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int seletor;
		double valor;
		
		System.out.println("====================================");
		System.out.println("          Bilheteria Metro");
		System.out.println("====================================\n");	
		System.out.println("Qual tipo de bilhete deseja? ");
		System.out.println("1 - Unitário    (R$1,30)");
		System.out.println("2 - Duplo       (R$2,60)");
		System.out.println("3 - 10 viagens  (R$12,00)");
		System.out.print("R: ");
		seletor = sc.nextInt();
		
		System.out.println("\nQual valor foi pago pelo cliente?");
		System.out.print("R: ");
		valor = sc.nextFloat();
		
		System.out.println("\n\n\n\n\n");
		System.out.println("====================================");
		System.out.println("          Bilheteria Metro");
		System.out.println("====================================\n");	
		System.out.print("O tipo de bilhete é ");
		
		switch(seletor) {
		
			case 1:
				System.out.println("UNITARIO: ");
				System.out.println("O valor do troco é respectivamente: " + (valor - 1.3));
				break;
				
			case 2:
				System.out.println("DUPLO");
				System.out.println("O valor do troco é respectivamente: " + (valor - 2.6));
				break;
				
			case 3:
				System.out.println("de 10 VIAGENS");
				System.out.println("O valor do troco é respectivamente: " + (valor - 12));
				break;
		}
		
		sc.close();
	}
}
