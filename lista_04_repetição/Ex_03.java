package lista_04_repetição;
import java.util.Scanner;
public class Ex_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade = 0, sexo, genero, homem = 0, mulher = 0, quant = 0, terror = 0, comedia = 0, acao = 0, quantfilme = 0, homem_acao = 0, mulher_comedia = 0;
		double media_idade_terror = 0, media_idade = 0;
		
		System.out.println("======================================");
		System.out.println("                Cinema");
		System.out.println("======================================\n");
		System.out.println("⚠️ Digite a idade -1 para finalizar ⚠️");
		System.out.print("Digite a idade: ");
		idade = sc.nextInt();
		
		for(; idade != -1;) {
			media_idade+=idade;
			System.out.println("\nQual seu sexo? ");
			System.out.println("1 - Mulher");
			System.out.println("2 - Homem");
			System.out.print("R: ");
			sexo = sc.nextInt();
			
			if(sexo == 1) {
				mulher++;
			} else if(sexo == 2) {
				homem++;
			}
			quant++;
			
			System.out.println("\nQual seu genero favorito? ");
			System.out.println("1 - Comedia");
			System.out.println("2 - Terror");
			System.out.println("3 - Açao");
			System.out.print("R: ");
			genero = sc.nextInt();
			
			if(genero == 1) {
				comedia++;
				if(sexo == 1) {
					mulher_comedia++;
				}
			} else if(genero == 2) {
				terror++;
				media_idade_terror+=idade;
			} else if(genero == 3) {
				acao++;
				if(sexo == 2) {
					homem_acao++;
				}
			}
			
			System.out.print("\nDigite a idade: ");
			idade = sc.nextInt();
		}
		
		System.out.println("\n\n\n\n\n");
		System.out.println("======================================");
		System.out.println("                Cinema");
		System.out.println("======================================\n");
		if(terror > 0) {
			System.out.println("Media idade pessoas filme terror: " + (media_idade_terror / terror) + " anos.");
		} 
		if(homem > 0) {
			System.out.println("Percentual homens filme acao: " + (((double)homem_acao / homem) * 100) + "%");
		}
		if(comedia > 0) {
			if(mulher_comedia > (comedia-mulher_comedia)) {
				System.out.println("Mais MULHERES preferem filmes de comedia.");
			} else if(mulher_comedia < (comedia-mulher_comedia)) {
				System.out.println("Mais HOMENS preferem filmes de comedia.");
			} else {
				System.out.println("Ambos preferem igualmente filme de comedia.");
			}
		}
		System.out.println("A media da idade dos frequentadores são "+ media_idade / quant);
		
		sc.close();
	}
}