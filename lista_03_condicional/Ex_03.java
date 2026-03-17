package lista_03_condicional;
import java.util.Scanner;
public class Ex_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		int nivel, horas;
		float valores = 0;

		System.out.println("===================================");
		System.out.println("          Escola APRENDER");
		System.out.println("===================================\n");
		System.out.println("Preencha as informaçoes abaixo: ");
		System.out.println("Nome do prof.:");
		nome = sc.next();
		System.out.println("Nível: ");
		nivel = sc.nextInt();
		System.out.println("Horas: ");
		horas = sc.nextInt();

		switch (nivel) {

		case 1:
			valores = horas * 12;
			break;

		case 2:
			valores = horas * 17;
			break;

		case 3:
			valores = horas * 25;
			break;

		default:
			System.out.println("Opçao invalida!!");
		}

		System.out.println("\n\n\n\n\n");
		System.out.println("===================================");
		System.out.println("          Escola APRENDER");
		System.out.println("===================================\n");
		System.out.println("Ficha do professor: ");
		System.out.println("Nome do prof. : " + nome);
		System.out.println("Nível: " + nivel);
		System.out.println("Valores a receber: " + valores);
		
		sc.close();
	}
}
