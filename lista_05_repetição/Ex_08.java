package lista_05_repetição;
import java.util.Scanner;
public class Ex_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("===============================================");
		System.out.println("          Tabuada de multiplicar de X");
		System.out.println("===============================================\n");
		System.out.println("Digite o numero q deseja saber o divisor: ");
		System.out.print("R: ");
		num = sc.nextInt();
		
		System.out.println("\n\n\n\n\n");
		System.out.println("===============================================");
		System.out.println("          Tabuada de multiplicar de " + num);
		System.out.println("===============================================\n");
		if(num >= 0) {
			for(int cont = 1; cont <= 10; cont++) {
				System.out.println(num + " * " + cont + " = " + num * cont);
			}
		} else {
			System.out.println("O número deve ser maior ou igual a 0!");
		}
		
		sc.close();
	}
}
