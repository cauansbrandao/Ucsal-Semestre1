package lista_02_Java_condicional;
import java.util.Scanner;
public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano, ano_atual;
		
		// Título
		System.out.println("===================================");
		System.out.println("          Já posso votar?");
		System.out.println("===================================\n");
		
		// Entrada de dados
		System.out.println("Digite o ano do seu nascimento: ");
		System.out.print("R: ");
		ano = sc.nextInt();
		System.out.println("\nDigite o ano atual: ");
		System.out.print("R: ");
		ano_atual = sc.nextInt();
		
		// Mostra o resultado
		if(ano_atual - ano >= 18) {
			System.out.println("\nVoce ja tem 18+ anos, entao ja pode votar.");
		} else {
			System.out.println("\nVoce tem -18 anos, entao nao pode votar ainda.");
		}
		
		sc.close();
		}
}