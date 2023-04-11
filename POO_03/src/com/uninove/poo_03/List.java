package com.uninove.poo_03;

import java.util.ArrayList;
import java.util.Scanner;

public class List {

	public static void main(String[] args) {
		
		int n = 1, proximo;
		
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < n; i++) {
			
			
			Pessoa pessoa = new Pessoa();
			
			System.out.println("... Cliente ...\n");
			
			System.out.print("Digite o nome: ");
			pessoa.nome = ler.next();
			
			System.out.print("Digite o cpf: ");
			pessoa.cpf = ler.next();
			
			System.out.print("Digite a idade: ");
			pessoa.idade = ler.nextInt();
			
			listaPessoas.add(pessoa);
			
			System.out.println("\n Digite 0 para sair ou 1 para cadastrar nova pessoa: ");
			
			proximo = ler.nextInt();
			
			if(proximo == 1) {
				i--;
			}
			
		}
		
		System.out.println("\n Tamanho da Lista = " + listaPessoas.size());
		System.out.println("\n=== Lista de Clientes === \n");
		
		
		for(int i = 0; i < listaPessoas.size(); i++) {
			System.out.printf("\n... Cliente %d ... \n", (i + 1));
			
			System.out.println("Nome: " + listaPessoas.get(i).nome);
			System.out.println("CPF: " + listaPessoas.get(i).cpf);
			System.out.println("Idade: " + listaPessoas.get(i).idade);
		}
		
	}

}

