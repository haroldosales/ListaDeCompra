package com.application;

import java.util.Scanner;

import com.archives.Dados;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite Nome Do produto");
		String nome = sc.nextLine();
		System.out.println("Digite quantidade");
		int quantidade = sc.nextInt();
		System.out.println("Digite o preço");
		double price = sc.nextDouble();
		
		Dados p1 = new Dados(nome, quantidade, price);
		
		p1.insere(nome, quantidade,price);
		
		System.out.println("Digite nome para excluir");
		String name = sc.next();
		p1.Excluir(name);
		
		p1.mostrar();
		sc.close();

	}

}
