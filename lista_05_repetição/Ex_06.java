package lista_05_repetição;
import java.util.Scanner;
public class Ex_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 0, B, aux;
		long  val = 1;
		
		System.out.println("==============================================");
		System.out.println("          Fatoriais impares de A a B");
		System.out.println("==============================================\n");
		System.out.println("Digite o primeiro numero: ");
		System.out.print("R: ");
		aux = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		System.out.print("R: ");
		B = sc.nextInt();
		
		System.out.println("\n\n\n\n\n");
		System.out.println("==============================================");
		System.out.println("          Fatoriais impares de A a B");
		System.out.println("==============================================\n");
		System.out.println("Os fatorias de " + aux + " a " + B + " são:\n");
		
		if(aux == B) {
			if(aux % 2 == 0) {
				aux = 1;
				for(int cont = B; cont > 0; cont--) {
					aux*=cont;
				}
				System.out.println("O fatorial de " + B + " é:");
				System.out.println(B + "! = " + aux);
			} else {
				System.out.println("Invalido!!!");
			}
		} else if(aux > B) {
			A = aux;
		} else {
			A = B;
			B = aux;
		}
		
		for(int cont = A; cont >= B; cont--) {
			if(cont % 2 == 0) {
				for(aux = cont; aux > 0; aux--) {
					val*=aux;
				}
				System.out.print(cont + "! = " + val);
				if(cont -1 > B) {
					System.out.print("  ->  ");
				}
			}
			val = 1;
		}
		
		sc.close();
	}
}

//Faça um programa que receba 2 valores inteiros A e B e calcule o fatorial de todos os números
//pares de A até B.