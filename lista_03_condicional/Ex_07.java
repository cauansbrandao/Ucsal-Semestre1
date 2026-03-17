package lista_03_condicional;
import java.util.Scanner;
public class Ex_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia1, dia2, mes1, mes2, ano1, ano2;
		
		System.out.println("=====================================");
		System.out.println("          Data mais recente");
		System.out.println("=====================================\n");
		System.out.println("Data 1:");
		System.out.print("Dia: ");
		dia1 = sc.nextInt();
		System.out.print("Mes: ");
		mes1 = sc.nextInt();
		System.out.print("Ano: ");
		ano1 = sc.nextInt();
		
		mes1+=ano1*12;
		dia1+=mes1*30;
		
		System.out.println("\nData 2:");
		System.out.print("Dia: ");
		dia2 = sc.nextInt();
		System.out.print("Mes: ");
		mes2 = sc.nextInt();
		System.out.print("Ano: ");
		ano2 = sc.nextInt();
		
		mes2+=ano2*12;
		dia2+=mes2*30;
		
		System.out.println("\n\n\n\n\n");
		System.out.println("=====================================");
		System.out.println("          Data mais recente");
		System.out.println("=====================================\n");
		
		if(dia1 < dia2) {
			System.out.println("A data 1 é a mais recente!");
		} else if(dia1 > dia2) {
			System.out.println("A data 2 é a mais recente!");
		} else {
			System.out.println("As datas são iguais!");
		}
		
		sc.close();
	}
}