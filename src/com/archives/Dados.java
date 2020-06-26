package com.archives;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.dados.Conexao;

public class Dados {
	
		private String nome;
		private int quantidade;
		private double price;
		
		
		public Dados() {}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getQuantidade() {
			return quantidade;
		}


		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}


		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}


		public Dados(String nome, int quantidade, double price) {
		
			this.nome = nome;
			this.quantidade = quantidade;
			this.price = price;
		}
		
		public static void insere(String nome, int quantidade, double price) {
			String sql = "INSERT INTO lista (nome,quantidade,price ) "
					+ "VALUES ('" + nome + "','" + quantidade + "','"+ price + "');";
			Conexao conn = new Conexao();
			int res = conn.executeUpdate(sql);
			if (res >= 1) {
				System.out.println("adcionado com sucesso!");
			} else {
				System.err.println("Erro , nao foi possivel");
			}
		}
	public	static void mostrar() {
			String sql = "SELECT * FROM lista";
			Conexao conn = new Conexao();
			
			
			System.out.println("nome    -     quantidade    -     Preço" );
			try {
				ResultSet consulta = conn.executeQuery(sql);
				while(consulta.next()) {
					String nome = consulta.getString("nome");
					int  quantidade = consulta.getInt("quantidade");
					double  price = consulta.getDouble("price");

					System.out.println(nome+"    -     "+quantidade+"    -     "+price);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	public	static void Excluir(String nome) {
		String sql = "DELETE FROM lista"; 
				
	
	
		Conexao conn = new Conexao();
		int res = conn.executeUpdate(sql);
		if (res >= 1) {
			System.out.println("Removido  com sucesso!");
		} else {
			System.err.println("Erro , nao foi possivel");
		}
	}
		


}
