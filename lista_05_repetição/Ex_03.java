package lista_05_repetição;
import java.util.Scanner;
public class Ex_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, div, cont = 0, atual = 2;
		
		System.out.println("==========================================");
		System.out.println("          Mostrar numeros primos");
		System.out.println("==========================================\n");
		System.out.println("Quantos numero primos quer ver? ");
		System.out.print("R: ");
		num = sc.nextInt();
		
		System.out.println("\n\n\n\n\n");
		System.out.println("==========================================");
		System.out.println("          Mostrar numeros primos");
		System.out.println("==========================================\n");
		System.out.println("Mostrando os " + num + " primeiros numeros primos.\n");
		while (cont < num) {
            div = 0;
            
            for (int aux = 1; aux <= atual; aux++) {
                if (atual % aux == 0) {
                    div++;
                }
            }

            if (div == 2) {
                System.out.print(atual);
                cont++;
                if (cont < num) {
                    System.out.print(" -> ");
                }
            }
            atual++;
        }
		
		sc.close();
	}
}
