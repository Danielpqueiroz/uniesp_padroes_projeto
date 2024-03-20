package tech.danielqueiroz.contas;

public class ContaEspecial extends Conta {
    double limite;

    boolean saque(double valor){
        if (getSaldo() > valor) {
            setSaldo(getSaldo() - (valor * 0.90));
            return true;
        }else {
            return false;
        }
    }

    public ContaEspecial(int numeros, double saldo, double limite) {
        super(numeros, saldo);
        this.limite = limite;
    }
}
