package lista_06_modularização;
import java.util.Scanner;
public class Ex_6 {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num1, num2, opc = 0;
		
		// Titulo
		System.out.println("====================================");
		System.out.println("          Mini Calculadora");
		System.out.println("====================================\n");
		
		// Entrada de dados
		System.out.print("Digite o primeiro numero: "
				+ "\nR: ");
		num1 = sc.nextInt();
		System.out.print("Digite o segundo numero: "
				+ "\nR: ");
		num2 = sc.nextInt();	
		
		do {
			titulo();
			// Escolher oq fara com os numeros
			System.out.println("Seu numeros sao " + num1 + " e " + num2);
			System.out.println("Oq deseja fazer com eles?\n");
			System.out.println("1 - Soma"
					+ "\n2 - Subtracao"
					+ "\n3 - Multiplicacao"
					+ "\n4 - Divisao"
					+ "\n5 - Trocar valores"
					+ "\n6 - Sair");
			System.out.print("R: ");
			opc = sc.nextInt();
			
			switch(opc) {
			
				case 1:
					soma(num1, num2);
					break;
					
				case 2: 
					subtracao(num1, num2);
					break;
				
				case 3:
					multiplicacao(num1, num2);
					break;
				
				case 4:
					divisao(num1, num2);
					break;
					
				case 5:
					titulo();
					// Alterar os valores dos numeros
					System.out.print("Digite o valor o novo valor: " + num1 + " -> ");
					num1 = sc.nextInt();
					System.out.print("Digite o valor o novo valor: " + num2 + " -> ");
					num2 = sc.nextInt();
					break;
				
				default:
					titulo();
					System.out.println("Opcao invalida!! Tente novamente!");
					System.out.println("\nDigite qualquer coisa para sair.");
					sc.nextLine();
					sc.nextLine();
			}
			
		}while(opc != 6);
		
		sc.close();
	}
	
	public static void titulo() {
			System.out.println("\n\n--------------------------------------\n\n");
			System.out.println("====================================");
			System.out.println("          Mini Calculadora");
			System.out.println("====================================\n");
	}
	
	public static void soma(int soma_num1, int soma_num2) {
		titulo();
		System.out.println(soma_num1 + " + " + soma_num2 + " = " + (soma_num1 + soma_num2));
		System.out.println("\nDigite qualquer coisa para sair.");
		sc.nextLine();
		sc.nextLine();
	}
	public static void subtracao(int subtracao_num1, int subtracao_num2) {
		titulo();
		System.out.println(subtracao_num1 + " - " + subtracao_num2 + " = " + (subtracao_num1 - subtracao_num2));
		System.out.println("\nDigite qualquer coisa para sair.");
		sc.nextLine();
		sc.nextLine();
	}
	public static void multiplicacao(int multiplicacao_num1, int multiplicacao_num2) {
		titulo();
		System.out.println(multiplicacao_num1 + " * " + multiplicacao_num2 + " = " + (multiplicacao_num1 * multiplicacao_num2));
		System.out.println("\nDigite qualquer coisa para sair.");
		sc.nextLine();
		sc.nextLine();
	}
	public static void divisao(int divisao_num1, int divisao_num2) {
		titulo();
		System.out.println(divisao_num1 + " / " + divisao_num2 + " = " + (divisao_num1 / divisao_num2));
		System.out.println("\nDigite qualquer coisa para sair.");
		sc.nextLine();
		sc.nextLine();
	}
}
