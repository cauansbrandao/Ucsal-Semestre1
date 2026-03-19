package lista_05_repetição;
import java.util.Scanner;
public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, mostrar = 1, aux1 = 1, aux2 = 2;
		
		System.out.println("==========================================");
		System.out.println("          Sequencia de Fibonnaci");
		System.out.println("==========================================\n");
		System.out.println("Quantos numeros deseja seguir na sequencia?");
		System.out.print("R: ");
		num = sc.nextInt();
		
		System.out.println("\n\n\n\n\n");
		System.out.println("==========================================");
		System.out.println("          Sequencia de Fibonnaci");
		System.out.println("==========================================\n");
		if(num > 0) {
			System.out.println("Seguindo a sequencia por " + num + " numeros:");
			System.out.print("1 -> 1 -> ");
			for(int cont = num - 2; cont > 0; cont--) {
				mostrar = aux2;
				aux2+=aux1;
				aux1 = mostrar;
				System.out.print(mostrar + " -> ");
			}
			System.out.println("FIM!");
		} else {
			System.out.println("O numero digitado e invalido!");
		}
		
		sc.close();
	}
}