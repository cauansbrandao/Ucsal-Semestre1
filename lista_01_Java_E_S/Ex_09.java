package lista_01_Java_E_S;
import java.util.Scanner;
public class Ex_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fitas;
		float valor;
		
		// Título
		System.out.println("========================================");
		System.out.println("           Locadora do Zeca");
		System.out.println("========================================\n");
		
		// Entrada de quantidade de fitas
		System.out.println("1 - Fitas");
		System.out.println("Quantas fitas você tem em estoque? ");
		System.out.print("R: ");
		fitas = sc.nextInt();
		
		// Entrada do valor cobrado por fita
		System.out.println("\n2 - Valor");
		System.out.println("Qual valor você cobra por fita?");
		System.out.print("R: ");
		valor = sc.nextInt();
		
		// Resultado dos cálculos
		System.out.println("========================================");
		System.out.println("           Locadora do Zeca");
		System.out.println("========================================\n");
		
		// Faturamento anual: 1/3 das fitas alugadas por mês
		System.out.println("Se 1/3 das fitas forem alugadas por mes seu faturamento anual seria de " + fitas * valor * 12 / 3 + " reais.");
		
		// Valor ganho com multas: 1/10 das fitas alugadas com atraso
		System.out.println("Se 1/10 das fitas alugadas no mes sao devolvidas com atraso, o valor ganho com multas por mes seria " + fitas/3 * valor / 10 + " reais.");
		
		// Fitas no final do ano: 2% estragam, 1/10 são repostas
		System.out.println("Se 2% das fitas estragarem no ano e 1/10 for comprada para reposição, a quantidade de fitas da locadora no final do ano seria " + fitas * 0.02 * 10 + fitas  );
		
		sc.close();
	}
}