package lista_03_condicional;
import java.util.Scanner;
public class Ex_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, metade1, metade2, somaMetades;
		boolean temCaracteristica = false;
		
		System.out.println("================================================");
		System.out.println("             Caracteristica do 3025");
		System.out.println("================================================");	
		System.out.println("Digite um numero de 4 casas para verificaçao: ");
		System.out.print("Numero: ");
		num = sc.nextInt();
		
		metade1 = num / 100;
		metade2 = num % 100;
		somaMetades = metade1 + metade2;
		
		if(somaMetades*somaMetades == num) {
			temCaracteristica = true;
		}
		
		System.out.println("\n\n\n==========================================");
		System.out.println("          Caracteristica do 3025");
		System.out.println("==========================================\n");	
		System.out.println("O numero digitado foi: " + num + "\n");
		
		System.out.println(metade1 + " + " + metade2 + " = " + somaMetades);
		System.out.println(somaMetades + " * " + somaMetades + " = " + somaMetades*somaMetades);
		
		if(!temCaracteristica) {
			System.out.println("Logo, ele NAO tem a caracteristica do numero 3025!");
		} else {
			System.out.println("Logo, ele tem a caracteristica do numero 3025!");
		}
		
		sc.close();
	}

}
