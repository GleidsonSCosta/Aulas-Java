package calculadora;

public class Matematica {
	// Atributos locais
	double a, b, peso, altura;
	
	//Método Construtor
	public Matematica(double num_a, double num_b) {
		a = num_a;
		b = num_b;
	}
	
	//Soma
	public double somar() {
		return a + b;
	}
	
	//Subtrair
	public double subtrair() {
		return a - b;
	}
	
	//Multiplicar
	public double multiplicar() {
		return a * b;
	}
	
	//Dividir
	public double dividir() {
		return a / b;
	}
	
	//IMC
	public double imc() {
		return altura / (altura * altura);
	}
}











