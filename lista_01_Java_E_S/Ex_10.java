package lista_01_Java_E_S;
import java.util.Scanner;
public class Ex_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horas, minutos, segundos, inicio, fim, result;
		
		// Título
		System.out.println("=================================================");
		System.out.println("                Horario Atividade");
		System.out.println("=================================================\n");
		
		 // Entrada do horário de início
		System.out.println("Digite o horário de INICIO da atividade, \nexpresso em horas, minutos e segundos: \n");
		System.out.print("Horas   : ");
		horas = sc.nextInt();
		System.out.print("Minutos : ");
		minutos = sc.nextInt();
		System.out.print("Segundos: ");
		segundos = sc.nextInt();
		
		// Converte tudo para segundos para facilitar o cálculo da diferença
		inicio = horas * 3600 + minutos * 60 + segundos;
		
		// Entrada do horário de fim
		System.out.println("\nAgora, digite o horário de FIM da atividade, \nexpresso em horas, minutos e segundos: \n");
		System.out.print("Horas   : ");
		horas = sc.nextInt();
		System.out.print("Minutos : ");
		minutos = sc.nextInt();
		System.out.print("Segundos: ");
		segundos = sc.nextInt();
		
		// Converte o horário final para segundos
		fim = horas * 3600 + minutos * 60 + segundos;
		
		// Calcula a duração em segundos
		result = fim - inicio;
		
		 // Mostra o resultado
		System.out.println("\n\n----- Para melhor experiencia, não ultrapasse a linha -----\n\n\n\n\n\n");
		System.out.println("=================================================");
		System.out.println("                Horario Atividade");
		System.out.println("=================================================\n");
		System.out.println("O tempo de duração da atividade é:\n");
		horas = result / 3600;
		result-= horas * 3600;
		minutos = result / 60;
		result-= minutos * 60;
		
		System.out.println(horas + "h " + minutos + "m " + result + "s");
		
		sc.close();
	}

}
