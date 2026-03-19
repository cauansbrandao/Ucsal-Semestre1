package lista_05_repetição;
import java.util.Scanner;
public class Ex_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===============================================");
		System.out.println("          Relogio de 0:0:0 a 23:59:59");
		System.out.println("===============================================\n");
		
		for(int horas = 0; horas <= 23; horas++) {
			for(int minutos = 0; minutos <= 59; minutos++) {
				for(int segundos = 0; segundos <= 59; segundos++) {
					System.out.println(horas + ":" + minutos + ":" + segundos);
				}
			}
		}
		
		sc.close();
	}
}