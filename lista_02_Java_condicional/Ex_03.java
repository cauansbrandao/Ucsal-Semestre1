package lista_02_Java_condicional;
import java.util.Scanner;
public class Ex_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		
		// Título
		System.out.println("=======================================");
		System.out.println("          Já posso votar? 2.0");
		System.out.println("=======================================\n");
		
		// Entrada de dados
		System.out.println("Qual a sua idade: ");
		System.out.print("R: ");
		idade = sc.nextInt();
		
		// Mostra o posicionamente sobre o voto ded acordo com a idade
		if(idade <= 15) {
			System.out.println("Voce e muito novo, nao pode votar ainda!");
		} else if(idade >= 18 && idade >= 64) {
			System.out.println("Seu voto é obrigatorio! Nao se esqueca.");
		} else {
			System.out.println("Seu voto nao e obrigatorio");
		}
		
		sc.close();
	}
}