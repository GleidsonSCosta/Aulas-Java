package com.uninove.poo_03;

import java.util.Scanner;

public class POO_03 {

	public static void main(String[] args) {
		
		int n = 3;
		
		Pessoa listaPessoas[] = new Pessoa[n];
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < n; i++) {
			System.out.printf("\n... Cliente %d ...\n", (i + 1));
			listaPessoas[i] = new Pessoa();
			
			System.out.print("Digite o nome: ");
			listaPessoas[i].nome = ler.next();
			
			System.out.print("Digite o cpf: ");
			listaPessoas[i].cpf = ler.next();
			
			System.out.print("Digite a idade: ");
			listaPessoas[i].idade = ler.nextInt();
		}
		
		System.out.println("\n=== Lista de Clientes === \n");
		
		for(int i = 0; i < listaPessoas.length; i++) {
			System.out.printf("\n... Cliente %d ... \n", (i + 1));
			
			System.out.println("Nome: " + listaPessoas[i].nome);
			System.out.println("CPF: " + listaPessoas[i].cpf);
			System.out.println("Idade: " + listaPessoas[i].idade);
		}
		
	}

}
