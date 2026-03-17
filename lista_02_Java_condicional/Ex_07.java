package lista_02_Java_condicional;
import java.util.Scanner;
public class Ex_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lados; 
		float lado1, lado2, lado3;
		
		// Título
		System.out.println("=================================");
		System.out.println("          Qual a forma?");
		System.out.println("=================================\n");
		
		// Entrada de dados
		System.out.println("Digite quantos lados seu poligono tem?");
		System.out.print("R: ");
		lados = sc.nextInt();
		
		// Cálculo e mostrar resultados
		if(lados == 3) {
			System.out.println("Digite a medida em cm de cada lado: ");
			System.out.print("Lado 1: ");
			lado1 = sc.nextFloat();
			System.out.print("Lado 2: ");
			lado2 = sc.nextFloat();
			System.out.print("Lado 3: ");
			lado3 = sc.nextFloat();
			
			System.out.println("\nEssa forma é um TRIANGULO e seu perimetro é "+ (lado1 + lado2 + lado3) + ".");
		} else if(lados == 4) {
			System.out.println("Digite a medida em cm dos lados: ");
			System.out.print("Lado 1: ");
			lado1 = sc.nextFloat();
			
			System.out.println("\nEssa forma é um QUADRADO e seu perimetro é "+ lado1 * lado1 + ".");
		} else if(lados == 5) {
			System.out.println("\nEssa forma é um PENTAGONO.");
		}
		
		sc.close();
	}
}