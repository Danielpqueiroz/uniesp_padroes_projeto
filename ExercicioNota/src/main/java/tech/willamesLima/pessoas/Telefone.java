package tech.willamesLima.pessoas;

public class Telefone {

    private String numero;
    private TipoTelefone tipo;

    public Telefone(String numero, String tipo) {
        this.numero = numero;
        this.tipo = convertStringToTipoTelefone(tipo);
    }

    private TipoTelefone convertStringToTipoTelefone(String tipo) {

        switch (tipo) {
            case "celular":
                return TipoTelefone.CELULAR;
            case "residencial":
                return TipoTelefone.RESIDENIAL;
            case "comercial":
                return TipoTelefone.COMERCIAL;
            default:
                throw new IllegalArgumentException("Tipo de telefone inválido: " + tipo);
        }
    }

    public String getNumero() {
        return numero;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "numero='" + numero + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
