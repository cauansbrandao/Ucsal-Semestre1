package lista_06_modularização;
import java.util.Scanner;
public class Ex_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		// Titulo
		System.out.println("=============================================");
		System.out.println("          Estatistica de Dados (v2)");
		System.out.println("=============================================\n");
		
		// Entrada de dados
		System.out.print("Digite um numero: "
				+ "\nR: ");
		num = sc.nextInt();
		
		System.out.println("\n\n--------------------------------------\n\n");
		
		// Titulo
		System.out.println("=============================================");
		System.out.println("          Estatistica de Dados (v2)");
		System.out.println("=============================================\n");
		mod1(num);
		System.out.println();
		mod2(num);
		System.out.println();
		mod3(num);
		
		sc.close();
	}
	
	// S = 1/1 + 1/2 + 1/3 + ... + 1/n
	public static void mod1(int mod1_num) {
		int cont = 0;
		System.out.print("S = ");
		for(int i = 1; i <= mod1_num; i++) {
			System.out.print("1/"+i);
			if((i+1) <= mod1_num) {
				System.out.print(" + ");
			}
			cont+=i;
		}
		System.out.println("\nS = "+ mod1_num + "/" + cont + " = " + (double)mod1_num/cont);
	}
	
	// S = 1/n + 2/(n-1) + 3/(n-2) + ... + (n-1)/2 + n/1
	public static void mod2(int mod2_num) {
		int cont = 1, aux = 0;
		System.out.print("S = ");
		for(int i = mod2_num; i > 0; i--) {
			System.out.print(cont + "/" + i);
			if((i-1) > 0) {
				System.out.print(" + ");
			}
			cont++;
			aux+=i;
		}
		System.out.println("\nS = " + aux + "/" + aux + " = " + (double)aux/aux);
	}
	
	// S = 1/1 - 1/2 + 1/3 - ... + 1/n
	public static void mod3(int mod3_num) {
		int cont = 0;
		System.out.print("S = ");
		for(int i = 1; i <= mod3_num; i++) {
			System.out.print("1/"+i);
			if((i+1) <= mod3_num && i%2==0) {
				System.out.print(" + ");
				cont+=i;
			} else if((i+1) <= mod3_num) {
				System.out.print(" - ");
				cont-=i;
			}
		}
		System.out.print("\nS = "+ mod3_num + "/" + cont);
		if(cont != 0) {
			System.out.println(" = " + (double)mod3_num/cont);
		}
	}
}
