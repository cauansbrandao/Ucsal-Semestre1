package lista_02_Java_condicional;
import java.util.Scanner;
public class Ex_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		
		// Título
		System.out.println("======================================================");
		System.out.println("          Confederaçao Brasileria de Nataçao");
		System.out.println("======================================================\n");
		
		// Entrada de dados
		System.out.println("Informe o nome e idade do participante:");
		System.out.print("Nome: ");
		nome = sc.next();
		System.out.print("Idade: ");
		idade = sc.nextInt();
		
		// Quebra de linha + Título
		System.out.println("\n\n\n\n");
		System.out.println("======================================================");
		System.out.println("          Confederaçao Brasileria de Nataçao");
		System.out.println("======================================================\n");
		System.out.println("Tabela do participante: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		
		// Seleciona a categoria conforme a idade do participante
		if(idade <= 4) {
			System.out.println("Categoria: Nao se enquadra. (Muito novo)");
		} else if(idade >= 5 && idade <=7) {
			System.out.println("Categoria: Infantil A");
		} else if(idade >= 8 && idade <=10) {
			System.out.println("Categoria: Infantil B");
		} else if(idade >= 11 && idade <= 13) {
			System.out.println("Categoria: Juvenil A");
		} else if(idade >= 14 && idade <= 17) {
			System.out.println("Categoria: Juvenil B");
		} else if(idade > 18) {
			System.out.println("Categoria: Senior");
		}
		
		sc.close();
	}
}