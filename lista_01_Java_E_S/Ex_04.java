package lista_01_Java_E_S;
import java.util.Scanner;
public class Ex_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float salmin, salatual, quant;
		
		// Título
		System.out.println("===================================================");
		System.out.println("          Quantos salarios minimos ganho?");
		System.out.println("===================================================\n");
		
		// Entrada de dados
		System.out.print("Digite o valor do salario minimo: R$");
		salmin = sc.nextFloat();
		System.out.print("Digite o valor do seu salario: R$");
		salatual = sc.nextFloat();
		System.out.println("");
		
		// Cálculo
		quant = salatual / salmin;
		
		// Mostra o resultado
		System.out.println("==================================");
		System.out.println("Voce recebe " + quant + " salarios minimos.");
		System.out.println("==================================");
		
		sc.close();
	}
}