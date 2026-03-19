package lista_06_modularização;
import java.util.Scanner;
public class Ex_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  opc;
		int num;
		
		// Título
		System.out.println("==================================");
		System.out.println("          Tabuada ate 10");
		System.out.println("==================================\n");
		System.out.println("Deseja ver a tabuada de um numero? ");
		System.out.println("(S para SIM)");
		System.out.print("R: ");
		opc = sc.nextLine();
		
		// Verificar se o usuario digitou S
		if(opc.charAt(0) == 'S' || opc.charAt(0) == 's') {
			System.out.println();
			System.out.println("\n\n--------------------------------------\n\n");
			System.out.print("Digite qual numero deseja saber a tabuada?"
					+ "\n(Apenas numeros de 1 a 10)"
					+ "\nR: ");
			num = sc.nextInt();
			
			if(num >= 1 && num <= 10) {
				tabuada(num);
			}
			
		// Se não, finaliza o programa
		} else {
			if(opc.charAt(0) != 'N' || opc.charAt(0) != 'n') {
				System.out.println("Opcao invalida! Tente novamente");
			}
			System.out.println("Programa Finalizado!");
		}
		
		sc.close();
	}
	public static void tabuada(int num) {
		System.out.println("\n\n\n\n\n");
		// Título
		System.out.println("==================================");
		System.out.println("          Tabuada do " + num);
		System.out.println("==================================\n");
		
		// Mostra a tabuada na tela
		for(int i = 1; i <=10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
}