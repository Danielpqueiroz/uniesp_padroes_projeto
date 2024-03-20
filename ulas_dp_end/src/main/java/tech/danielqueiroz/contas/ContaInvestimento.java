package tech.danielqueiroz.contas;

public class ContaInvestimento extends Conta{
    double taxa;
    int prazo;

    boolean saque(double valor){
        if (this.saldo > valor) {
            this.saldo = this.saldo - (valor * 0.99);
            return true;
        }else {
            return false;
        }

    }
    boolean deposito(double valor){
        return false;
    }
    double aplicaRendimento(double taxa){
        return taxa;
    }

    public ContaInvestimento(int numeros, double saldo, double taxa, int prazo) {
        super(numeros, saldo);
        this.taxa = taxa;
        this.prazo = prazo;
    }
}
