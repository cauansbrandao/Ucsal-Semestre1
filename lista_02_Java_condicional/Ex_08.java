package lista_02_Java_condicional;
import java.util.Scanner;
public class Ex_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val1, val2, operacao;
		
		// Título
		System.out.println("====================================");
		System.out.println("          Mini Calculadora");
		System.out.println("====================================\n");
		
		// Entrada de resultados
		System.out.println("Digite 2 valores inteiros: ");
		System.out.print("Valor 1: ");
		val1 = sc.nextInt();
		System.out.print("Valor 2: ");
		val2 = sc.nextInt();
		
		// Quebra de linhas + título
		System.out.println("\n\n\n\n\n");
		System.out.println("====================================");
		System.out.println("          Mini Calculadora");
		System.out.println("====================================\n");
		
		// Escolha da operaçao desejada
		System.out.println("os valores digitado foram " + val1 + " e " + val2 + " qual operaçao deseja fazer?");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtraçao");
		System.out.println("3 - Divisao");
		System.out.println("4 - Multiplicacao");
		System.out.println("R: ");
		operacao = sc.nextInt();
		
		// Seleciona a operação conforme a escolha do usuário
		switch(operacao) {
		
			case 1:
				System.out.println("A soma de " + val1 + " + " + val2 + " = " + (val1 + val2));
				break;
				
			case 2:
				System.out.println("A subtraçao de " + val1 + " - " + val2 + " = " + (val1 - val2));
				break;
				
			case 3:
				if(val1 == 0) {
					System.out.println("Operação invalida!");
				} else if(val2 == 0) {
					System.out.println("Operação invalida!");
				} else {
					System.out.println("A divisao de " + val1 + " / " + val2 + " = " + (val1 / val2));
				}
				break;
			
			case 4:
				System.out.println("A multiplicacao de " + val1 + " * " + val2 + " = " + (val1 * val2));
				break;
		}
		
		sc.close();
	}
}