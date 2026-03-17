package lista_02_Java_condicional;
import java.util.Scanner;
public class Ex_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ideal = 0, altura;
		int sexo;
		
		// Título
		System.out.println("==============================");
		System.out.println("          Peso ideal");
		System.out.println("==============================\n");
		
		// Entrada de Dados
		System.out.println("Digite o seu sexo?");
		System.out.println("1 - Feminino");
		System.out.println("2 - Masculino");
		System.out.print("R: ");
		sexo = sc.nextInt();
		System.out.println("\nDigite sua altura: ");
		System.out.print("R: ");
		altura = sc.nextFloat();
		
		// Cálculo
		if (sexo == 1) {
		    ideal = (62.1 * altura) - 44.7;
		} else if (sexo == 2) {
		    ideal = (72.7 * altura) - 58;
		} else {
		    System.out.println("Opção inválida!");
		}
		
		// Mostrar resultados
		System.out.println("\nSeu peso ideal seria " + ideal);
		
		sc.close();
	}
}