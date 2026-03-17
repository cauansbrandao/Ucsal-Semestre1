package lista_01_Java_E_S;
import java.util.Scanner;
public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora, min, seg;
		
		// Entrada de dados
		System.out.println("====================================================");
		System.out.println("          Quantos segundos ja se passaram?");
		System.out.println("====================================================\n");
		System.out.print("Digite a hora atual: ");
		hora = sc.nextInt();
		System.out.print("Digite os minutos atuais: ");
		min = sc.nextInt();
		System.out.print("Digite os segundos atuais: ");
		seg = sc.nextInt();
		System.out.println("");
		
		// Calcula o total de segundos
		seg = hora * 3600 + min * 60 + seg;
		
		// Mostra o resultado
		System.out.println("====================================================");
		System.out.println("Ja se passaram " + seg + " segundos do seu dia!");
		System.out.println("====================================================");
		
		sc.close();
	}
}