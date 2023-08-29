package tech.danieldpq.Conta;

public class Programa {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c = new Conta();
		
		c.numero = 5640;
		c.nome = "Daniel";
		c.saldo = 100.000;
		c.limite = 100.000;
		
		Conta c2 = new Conta(2, "dpq", 12, 100);
		
		Conta c3 = new Conta("nome!");
	}

}
