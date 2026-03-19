package lista_05_repetição;
import java.util.Scanner;
public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int num, divisores = 0;
			String mostrardivisores = "";
			
			System.out.println("========================================");
			System.out.println("          Esse numero é primo?");
			System.out.println("========================================\n");
			System.out.println("Digite o numero para verificaçao: ");
			System.out.print("R: ");
			num = sc.nextInt();
			
			for(int cont = num; cont > 0; cont--) {
				if(num % cont == 0) {
					divisores++;
					mostrardivisores+=cont;
					if((cont - 1) > 0 ) {
						mostrardivisores+=" -> ";
					}
				}
			}
			if(num == 1) {
				System.out.println("\nO numero 1 não é primo");
			} else if(divisores == 2) {
				System.out.println("\nO numero " + num + " é primo, pois tem apenas 2 divisores.");
				System.out.println("Divisores: 1 e " + num);
			} else {
				System.out.println("O numero nao e primo, pois tem mais de 2 divisores, sendo eles: ");
				System.out.println("Divisores: " + mostrardivisores);
			}
			
			sc.close();
	}
}