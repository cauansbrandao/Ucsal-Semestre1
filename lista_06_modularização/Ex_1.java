package lista_06_modularização;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		// Título
		System.out.println("===============================================");
		System.out.println("          Minimo Multiplo Comum (MMC)");
		System.out.println("===============================================\n");
		
		// Entrada de dados
		System.out.println("Digite os 2 numeros que deseja saber o MMC: ");
		System.out.print("Num. 1: ");
		num1 = sc.nextInt();
		System.out.print("Num. 2: ");
		num2 = sc.nextInt();
		
		System.out.println("\n\n------------------------------------------\n\n");
		
		// Cálcular o MMC (VOID)
		MMC(num1, num2);
		
		sc.close();
	}
	
	public static void MMC(int mmc_num1, int mmc_num2) {
		int mmc = 1;
		System.out.println("===============================================");
		System.out.println("          Minimo Multiplo Comum (MMC)");
		System.out.println("===============================================\n");
		
		// Calculando o MMC
		for(int cont = 2; mmc_num1 != 1 || mmc_num2 != 1; cont++) {
			int aux = 0;
			
			while(mmc_num1 % cont == 0 || mmc_num2 % cont == 0) {
				System.out.println(mmc_num1 + " " + mmc_num2 + " | " + cont);
				if(mmc_num1 % cont == 0) {
					mmc_num1 /= cont;
					aux++;
				}
				if(mmc_num2 % cont == 0) {
					mmc_num2 /= cont;
					aux++;
				}
				if(aux > 0) {
					mmc *= cont;
					aux = 0;
				}
			}
		}
		
		// Mostrar resultados
		System.out.println("------------------");
		System.out.println("Total: " + mmc);
	}
}
