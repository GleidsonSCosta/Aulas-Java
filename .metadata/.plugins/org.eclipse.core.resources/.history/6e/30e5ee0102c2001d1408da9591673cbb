package calculadora;

import java.util.Scanner;

public class POO_01 {
	public static void main(String[] args ) {
		
		System.out.println("Calculadora");
		
		double a, b;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Primeiro valor: ");
		a = ler.nextDouble();
		
		System.out.println("Segundo valor: ");
		b = ler.nextDouble();	
		
		Matematica calcular  = new Matematica(a, b);
		
		System.out.println("\n---------------------\n");
		System.out.println("\nA soma dos valores é: " + calcular.somar());
		System.out.println("\nA subtração dos valores é: " + calcular.subtrair());
		System.out.println("\nA multiplicação dos valores é: " + calcular.multiplicar());
		System.out.println("\nA divisão dos valores é: " + calcular.dividir());
		System.out.println("\n---------------------\n");
		
		Matematica imc = new Matematica(a, b);
		
		System.out.println("Calcular IMC");
		
		System.out.println("Informe o peso: ");
		a = ler.nextDouble();
		
		System.out.println("Informe a altura: ");
		b = ler.nextDouble();	
		
		System.out.println("\nO valor do IMC é = " + imc.imc());
		
		
	}
}
