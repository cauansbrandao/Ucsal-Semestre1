package lista_02_Java_condicional;
import java.util.Scanner;
public class Ex_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float salario, prestacao;
		
		// Título
		System.out.println("====================================");
		System.out.println("          Linha de Crédito");
		System.out.println("====================================\n");
		System.out.println("⚠️ O valor do emprestimo nao pode ultrapassar 30% do salario bruto. ⚠️");
		
		// Entrada de resultados
		System.out.println("Qual valor do seu emprestimo desejado? ");
		System.out.print("R: ");
		prestacao = sc.nextFloat();
		System.out.println("\nQual valor do seu salario? ");
		System.out.print("R: ");
		salario = sc.nextFloat();
		
		// Cálculo e mostrar resultados
		if(salario * 0.3 < prestacao) {
			System.out.println("\nO emprestimo nao pode ser concedido pois o valor ultrapassa 30% do seu salario.");
			System.out.println("Val. maximo: R$" + salario * 0.3);
			System.out.println("Emprestimo pedido: R$" + prestacao);
		} else {
			System.out.println("\nO emprestimo pode ser concedido!");
			System.out.println("Val. maximo: R$" + salario * 0.3);
			System.out.println("Emprestimo pedido: R$" + prestacao);
		}
		
		sc.close();
	}
}