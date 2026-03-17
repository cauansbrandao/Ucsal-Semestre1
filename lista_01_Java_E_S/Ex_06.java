package lista_01_Java_E_S;
import java.util.Scanner;
public class Ex_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float nota1, nota2, nota3, peso1, peso2, peso3, media;
		
		// Título
		System.out.println("===================================");
		System.out.println("          Media ponderada");
		System.out.println("===================================\n");
		
		// Entrada de Dados
		System.out.println("Digite sua 3 notas: ");
		System.out.println("Nota 1: ");
		nota1 = sc.nextFloat();		
		System.out.println("Nota 2: ");
		nota2 = sc.nextFloat();	
		System.out.println("Nota 3: ");
		nota3 = sc.nextFloat();	
		System.out.println("");
		System.out.println("Digite os 3 pesos: ");
		System.out.println("Peso 1: ");
		peso1 = sc.nextFloat();	
		System.out.println("Peso 2: ");
		peso2 = sc.nextFloat();
		System.out.println("Peso 3: ");
		peso3 = sc.nextFloat();
		System.out.println("");
		
		// Cálculo
		media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
		
		// Mostra o resultado
		System.out.println("============================");
		System.out.println("Sua média foi " + media);
		System.out.println("============================");
		
		sc.close();
	}
}