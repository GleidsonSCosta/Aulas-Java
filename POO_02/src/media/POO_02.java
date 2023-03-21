package media;
import java.util.Scanner;

public class POO_02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		float av1, av2, av3, media;
		boolean aprovacao;		
		
		do {
			System.out.println("Informe a nota AV1: ");
			av1 = ler.nextFloat();
			if(av1 < 0 || av1 > 10) {
				System.out.println("Informe uma nota válida");
			}
		}while(av1 < 0 || av1 > 10);
		
		do {
			System.out.println("Informe a nota AV2: ");
			av2 = ler.nextFloat();
			if(av2 < 0 || av2 > 10) {
				System.out.println("Informe uma nota válida");
			}
		}while(av2 < 0 || av2 > 10);
		
		do {
			System.out.println("Informe a nota AV3: ");
			av3 = ler.nextFloat();
			if(av3 < 0 || av3 > 10) {
				System.out.println("Informe uma nota válida");
			}
		}while(av3 < 0 || av3 > 10);
		
		
		media = valorMedia(av1, av2, av3);
		
		System.out.println("A media é: " + media);
		
		aprovacao(media);
		
		int notaFinal = (int) media;
		
		switch (notaFinal) {
		case 10:
			System.out.println("Parabéns, você tirou nota máxima.");
			break;
		case 9: 
			System.out.println("Muito Bom, mais um pouco seria nota máxima.");
			break;
		case 8:
			System.out.println("Continue assim, na próxima será melhor.");
			break;
		case 7:
			System.out.println("Essa foi por pouco hein. Estude um pouco mais.");
			break;
		default:
			System.out.println("Precisa melhorar a nota! ");
			break;
		}
			
		
	}
	
	public static float valorMedia(float nota1, float nota2, float nota3) {
		
		float valorMedio = 0;
		
		if(nota1 < nota2 && nota1 < nota3) {
			valorMedio = (nota2 + nota3) / 2;
		}else if(nota2 < nota1 && nota2 < nota3) {
			valorMedio = (nota1 + nota3) / 2;
		}else {
			valorMedio = (nota2 + nota1) / 2;
		}
		
		return valorMedio;
		
	}
	
	public static boolean aprovacao(float media) {
		
		if(media >= 7) {
			System.out.println("Aluno aprovado!");
			return true;
		}else if (media >= 5 && media < 6) {
			System.out.println("Aluno de recuperação!");
			return false;
		}else {
			System.out.println("Aluno Reprovado!");
			return false;
		}
	}

}

















