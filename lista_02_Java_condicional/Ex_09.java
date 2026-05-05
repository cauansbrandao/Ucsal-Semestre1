package lista_02_Java_condicional;
import java.util.Scanner;
public class Ex_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int homem, mulher, homemvelho, mulhernova, a;
		
		// Título
		System.out.println("=========================================");
		System.out.println("          Comparativo de Idades");
		System.out.println("=========================================\n");
		
		// Entrada de dados (Homens)
		System.out.println("Digite a idade dos 2 homens: ");
		System.out.print("Homem 1: ");
		homem = sc.nextInt();
		homemvelho = homem;
		System.out.print("Homem 2: ");
		homem = sc.nextInt();
		
		// Verificacao de idades
		if(homem > homemvelho) {
			a = homemvelho;
			homemvelho = homem;
			homem = a;
		}
		
		// Entrada de dados (Mulheres)
		System.out.println("\nDigite a idade das 2 mulheres: ");
		System.out.print("Mulher 1: ");
		mulher = sc.nextInt();
		mulhernova = mulher;
		System.out.print("Homem 2: ");
		mulher = sc.nextInt();
		
		// Verificacao de idades
		if(mulher < mulhernova) {
			a = mulhernova;
			mulhernova = mulher;
			mulher = a;
		}
		
		// Mostra o resultado
		System.out.println("\nA soma das idades do homem mais velho com a mulher mais nova é " + (mulhernova + homemvelho));
		System.out.println("O produto das idades do homem mais novo com a mulher mais velha é " + mulher * homem);
		
		sc.close();
	}
}
