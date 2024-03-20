package tech.danielqueiroz.contas;

public class Main {
    public static void main(String[] args) {
        ContaEspecial cEspecial = new ContaEspecial(1, 10000, 100000);
        cEspecial.saque(1000);
    }
}
