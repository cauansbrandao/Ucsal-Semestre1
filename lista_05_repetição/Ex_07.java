package lista_05_repetição;
import java.util.Scanner;
public class Ex_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, mdc = 0, aux;
		
		System.out.println("==============================================");
		System.out.println("          MDC (Maximo divisor comum)");
		System.out.println("==============================================\n");
		System.out.println("Digite o primeiro numero: ");
		System.out.print("R: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		System.out.print("R: ");
		num2 = sc.nextInt();
		
		if(num2 > num1) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		for(int cont = 1; cont <= num1; cont++) {
			if(num1 % cont == 0 && num2 % cont == 0) {
				mdc = cont;
			}
		}
		
		System.out.println("\n\n\n\n\n");
		System.out.println("==============================================");
		System.out.println("          MDC (Maximo divisor comum)");
		System.out.println("==============================================\n");
		System.out.println("O maximo divisor comum de " + num2 + " e "+ num1 +" é: " );
		System.out.println("MDC: "+ mdc);
		
		sc.close();
	}

}
