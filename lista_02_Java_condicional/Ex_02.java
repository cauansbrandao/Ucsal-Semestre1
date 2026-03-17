package lista_02_Java_condicional;
import java.util.Scanner;
public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		// Título
		System.out.println("========================================");
		System.out.println("          A é divisivel por B?");
		System.out.println("========================================\n");
		
		// Entada de dados
		System.out.println("Digite o valor de A e depois o de B: \n");
		System.out.print("A = ");
		a = sc.nextInt();
		System.out.print("B = ");
		b = sc.nextInt();
		
		// Mostra na tela se o resto de divisão de A % B == 0 e
		if(a != 0) {
			if(b != 0) {
				if(a % b == 0) {
					System.out.println("\nOs numeros sao divisiveis!");
				} else {
					System.out.println("\nOs numeros nao sao divisiveis!");
				}
			} else { 
				System.out.println("\nQualquer valor diferente de zero dividido por zero não tem um resultado definido (é indefinido)");
			}
		} else if(a== 0 && b == 0) {
			System.out.println("\nO valor 0 divido por 0 e indeterminado");
		} else {
			System.out.println("\n0 dividido por qualquer numero, o resultado sempre será 0");
		}
		
		sc.close();
	}
}