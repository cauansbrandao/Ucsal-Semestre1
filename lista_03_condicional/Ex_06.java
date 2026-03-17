package lista_03_condicional;
import java.util.Scanner;
public class Ex_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float peso, altura;
		
		System.out.println("======================================");
		System.out.println("            Qual seu tipo?");
		System.out.println("======================================\n");	
		System.out.println("Informe seu peso e altura (em metros): ");
		System.out.print("Peso: ");
		peso = sc.nextFloat();
		System.out.print("Altura: ");
		altura = sc.nextFloat();
		
		System.out.println("\n\n\n\n\n\n");
		System.out.println("======================================");
		System.out.println("            Qual seu tipo?");
		System.out.println("======================================\n");	
		System.out.println("De acordo com as informaçoes fornecidas");
		System.out.println("Voce se enquadra:");
		System.out.print("Tipo:");
		
		if(peso <= 60) {
			if(altura < 1.3) {
				System.out.println("A");
			} else if(altura >= 1.3 && altura <= 1.7) {
				System.out.println("B");
			} else {
				System.out.println("C");
			}
		} else if(peso > 60 && peso <= 85) {
			if(altura < 1.3) {
				System.out.println("D");
			} else if(altura >= 1.3 && altura <= 1.7) {
				System.out.println("E");
			} else {
				System.out.println("F");
			}
		} else {
			if(altura < 1.3) {
				System.out.println("G");
			} else if(altura >= 1.3 && altura <= 1.7) {
				System.out.println("H");
			} else {
				System.out.println("I");
			}
		}
		sc.close();
	}
}
