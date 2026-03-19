package lista_05_repetição;
import java.util.Scanner;
public class Ex_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, opcao = 0;
		
		System.out.println("=====================================");
		System.out.println("          Mini calculadora?");
		System.out.println("=====================================");
		System.out.println("Para começarmos, digite 2 numeros: ");
		System.out.print("Numero 1: ");
		num1 = sc.nextInt();
		System.out.print("Numero 2: ");
		num2 = sc.nextInt();
		
		System.out.println("\n\n\n\n\n");
		System.out.println("=====================================");
		System.out.println("          Mini calculadora?");
		System.out.println("=====================================");
		System.out.println("Seus numero sao: " + num1 + " e " + num2 + "\n");
		
		while(opcao != 6) {
			System.out.print("1 - Soma\n"
					+ "2 - Subtraçao\n"
					+ "3 - Multiplicaçao\n"
					+ "4 - Divisao\n"
					+ "5 - Trocar de Valores\n"
					+ "6 - Sair\n"
					+ "R: ");
			opcao = sc.nextInt();
			
			switch(opcao) {
			
				case 1:
					System.out.println("=====================================");
					System.out.println("          Mini calculadora?");
					System.out.println("=====================================");
					System.out.println("Seus numero sao: " + num1 + " e " + num2 + "\n");
					System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) + "\n");
					break;
					
				case 2:
					System.out.println("=====================================");
					System.out.println("          Mini calculadora?");
					System.out.println("=====================================");
					System.out.println("Seus numero sao: " + num1 + " e " + num2 + "\n");
					System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) + "\n");
					break;
				
				case 3:
						System.out.println("=====================================");
						System.out.println("          Mini calculadora?");
						System.out.println("=====================================");
						System.out.println("Seus numero sao: " + num1 + " e " + num2 + "\n");
						System.out.println(num1 + " * " + num2 + " = " + (num1 * num2) + "\n");
						break;
				case 4:
					if(num2 <= 0) {
						System.out.println("Essa operação é invalida para seus numeros!");
					} else {
						System.out.println("=====================================");
						System.out.println("          Mini calculadora?");
						System.out.println("=====================================");
						System.out.println("Seus numero sao: " + num1 + " e " + num2 + "\n");
						System.out.println(num1 + " / " + num2 + " = " + (double)(num1 / num2) + "\n");
						break;
					}
				case 5:
					System.out.println("=====================================");
					System.out.println("          Mini calculadora?");
					System.out.println("=====================================");
					System.out.println("Digite os novos valores: ");
					System.out.print("Numero 1: ");
					num1 = sc.nextInt();
					System.out.print("Numero 2: ");
					num2 = sc.nextInt();
					System.out.println();
					
					System.out.println("\n\n\n\n\n");
					System.out.println("=====================================");
					System.out.println("          Mini calculadora?");
					System.out.println("=====================================");
					System.out.println("Seus numero sao: " + num1 + " e " + num2 + "\n");
					break;
					
				case 6:
					System.out.println("\n\n\n\n\n");
					System.out.println("=====================================");
					System.out.println("          Mini calculadora?");
					System.out.println("=====================================");
					System.out.println("Saindo...");
					break;
				
				default:
					System.out.println("=====================================");
					System.out.println("          Mini calculadora?");
					System.out.println("=====================================");
					System.out.println("Opçao invalida!!! \n");
			}
		}
		
		sc.close();
	}
}