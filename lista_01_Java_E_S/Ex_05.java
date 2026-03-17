package lista_01_Java_E_S;
import java.util.Scanner;
public class Ex_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano, meses, dias;
		
		// Título
		System.out.println("===============================================");
		System.out.println("          Quantos dias voce ja viveu?");
		System.out.println("===============================================\n");
		
		// Entrada de Dados
		System.out.print("Digite a quantos anos esta vivo?: ");
		ano = sc.nextInt();
		System.out.print("Digite a quantos meses esta vivo?: ");
		meses = sc.nextInt();
		System.out.print("Digite a quantos dias esta vivo?: ");
		dias = sc.nextInt();
		System.out.println("");
		
		// Cálculo
		dias = ano * 360 + meses * 30 + dias;
		
		// Mostra o resultado
		System.out.println("===============================================");
		System.out.println("Supondo ques meses tenham 30 dias,");
		System.out.println("Voce ja viveu " + dias + " dias.");
		System.out.println("===============================================");
		
		sc.close();
	}

}
