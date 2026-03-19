package lista_06_modularização;
import java.util.Scanner;
public class Ex_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		// Título
		System.out.println("==========================================");
		System.out.println("          Sequencia de Fibonacci");
		System.out.println("==========================================\n");
		
		// Entrada de dados
		System.out.print("Quantos termos da sequencia quer ver?"
				+ "\nR: ");
		num = sc.nextInt();
		
		// Se num for maior que 0, chama fibonnaci passando parametro num
		if(num > 0) {
			System.out.println("\n\n--------------------------------------\n\n");
			fibonacci(num);
		} else {
			System.out.println("\nO número " + num +  " nao é valido, tente novamente!");
		}
		
		sc.close();
	}
	
	public static void fibonacci(int fibonacci_num) {
		int a = 1, b = 1, c = a+b;
		
		// Título novamente
		System.out.println("==========================================");
		System.out.println("          Sequencia de Fibonacci");
		System.out.println("==========================================\n");
		
		// Mostra a sequencia de fibonnaci ate o termo
		for(int i = fibonacci_num; i > 0 ; i--) {
			System.out.print(a + " -> ");
			a = b;
			b = c;
			c = a + b;
		}
		System.out.println("FIM!");
		System.out.println("O " + fibonacci_num + "º numero da sequencia de fibonacci é: " + (b - a));
	}

}
