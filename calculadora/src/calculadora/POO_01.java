package calculadora;

import java.util.Scanner;

public class POO_01 {
	public static void main(String[] args ) {
		System.err.println("Calculadora");
		
		double a, b, peso, altura;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Primeiro valor: ");
		a = ler.nextDouble();
		
		System.out.println("Segundo valor: ");
		b = ler.nextDouble();
		
		System.out.println("Calcular IMC");
		
		System.out.println("Informe o peso: ");
		peso = ler.nextDouble();
		
		System.out.println("Informe a altura: ");
		altura = ler.nextDouble();		
		
	}
}