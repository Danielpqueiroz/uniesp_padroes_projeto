package tech.danieldpq.Conta;

public class Conta {
	int numero;
	String nome;
	double saldo;
	double limite;
	
	
	
	void saca (double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	public Conta() {
		System.out.println("Conta vazia criada");
	}
	
	public Conta (int numero, String nome, double saldo, double limite) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}
	public Conta( String nome) {
		
		this.numero = 200;
		this.nome = "pontes";
		this.saldo = 1010;
		this.limite = 200000;
	}

}
