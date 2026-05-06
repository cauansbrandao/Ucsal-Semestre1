package lista_04_repetição;
import java.util.Scanner;
public class Ex_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, soma = 0, quant = 0, maior, menor, pares = 0, quantpares = 0;
		
		System.out.println("========================================");
		System.out.println("          Estatistica de Dados");
		System.out.println("========================================");
		System.out.println("⚠️ Todos numeros devem ser >= 0 ⚠️\n");
		System.out.println("Digite um numero:");
		num = sc.nextInt();
		maior = menor = num;
		while(num >= 0) {
			soma+=num;
			quant++;
			if(num % 2 == 0) {
				pares+=num;
				quantpares++;
			}
			if(num > maior) {
				maior = num;
			} else if(num < menor) {
				menor = num;
			}
			num = sc.nextInt();
		}
		if(quant > 0) {
			System.out.println("========================================");
			System.out.println("          Estatistica de Dados");
			System.out.println("========================================\n");
			System.out.println("Soma: " + soma);
			System.out.println("Quantidade: " + quant);
			System.out.println("Média: " + (double)soma / quant);
			System.out.println("Maior: " + maior);
			System.out.println("Menor: " + menor);
			if(quantpares > 0) {
				System.out.println("Media pares: " + (double)pares / quantpares);
			}
		} else {
			System.out.println("Nehum número valido digitado!");
		}
		
		sc.close();
	}
}
