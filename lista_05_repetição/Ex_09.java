package lista_05_repetição;
import java.util.Scanner;
public class Ex_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("===========================================");
		System.out.println("          Tabuada de devisao de X");
		System.out.println("===========================================\n");
		System.out.println("Digite o numero para ver seus divisores:");
		System.out.print("R: ");
		num = sc.nextInt();
		
		System.out.println("\n\n\n\n\n");
		System.out.println("===========================================");
		System.out.println("          Tabuada de devisao de " + num);
		System.out.println("===========================================\n");
		if(num > 0) {
			for(int div = 1; div < num; div++) {
				System.out.println("Tabuada de " + div);
				for(int cont = div; cont <= div * 10; cont+=div) {
					System.out.println(cont + " / " + div + " = " + cont / div);
				}
				System.out.println("-------------------------------------------");
			}
		} else {
			System.out.println("O numero deve ser maior que 0!!");
		}
		
		sc.close();
	}
}