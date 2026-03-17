package lista_04_repetição;
import java.util.Scanner;
public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("======================================");
		System.out.println("          Sem ideia pra nome");
		System.out.println("======================================\n");
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		
		System.out.println("\n\n\n\n\n");
		System.out.println("======================================");
		System.out.println("          Sem ideia pra nome");
		System.out.println("======================================\n");
		System.out.print("A) S = 1/1 + ");
		for(int cont = 2; cont <= n; cont++) {
			System.out.print("1/" + cont + " + ");
		}
		System.out.println("FIM");
		System.out.print("B) S = ");
		for(int cont = 1; cont <= n; cont++) {
			System.out.print(cont + "/" + ((n+1)-cont) + " + ");
		}
		System.out.println("FIM");
		System.out.print("C) S = 1/1 - ");
		for(int cont = 2; cont <= n; cont++) {
			System.out.print("1/" + cont);
			if((cont % 2) == 0) {
				System.out.print(" + ");
			} else {
				System.out.print(" - ");
			}
		}
		
		System.out.println("FIM");
		
		sc.close();
	}
}