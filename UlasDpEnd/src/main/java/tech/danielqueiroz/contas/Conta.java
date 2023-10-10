package tech.danielqueiroz.contas;

public class Conta {

    private int numeros;
    private double saldo;

    boolean saque(double valor){
        if (this.saldo > valor) {
            this.saldo = this.saldo - valor;
            return true;
        }else {
            return false;
        }

    }
    boolean deposito(double valor){
        return false;
    }


    public Conta(int numeros, double saldo) {
        this.numeros = numeros;
        this.saldo = saldo;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
