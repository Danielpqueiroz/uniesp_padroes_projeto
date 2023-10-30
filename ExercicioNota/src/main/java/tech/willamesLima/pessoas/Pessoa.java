package tech.willamesLima.pessoas;

import tech.willamesLima.funcionarios.Cargo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Pessoa {

    private String nome;
    private Date dataNascimento;
    private Endereco endereco;
    private Collection<Telefone> telsContato;

    public Pessoa(String nome, Date dataNascimento, Endereco endereco, Collection<Telefone> telsContato) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telsContato = telsContato;
    }
    // Método para calcular a idade
    public int calcularIdade() {
        Date dataAtual = new Date();
        Calendar dataNascimentoCal = Calendar.getInstance();
        dataNascimentoCal.setTime(dataNascimento);
        Calendar dataAtualCal = Calendar.getInstance();
        dataAtualCal.setTime(dataAtual);

        int idade = dataAtualCal.get(Calendar.YEAR) - dataNascimentoCal.get(Calendar.YEAR);

        // Verifica se o aniversário já ocorreu no ano atual
        if (dataAtualCal.get(Calendar.MONTH) < dataNascimentoCal.get(Calendar.MONTH)
                || (dataAtualCal.get(Calendar.MONTH) == dataNascimentoCal.get(Calendar.MONTH)
                && dataAtualCal.get(Calendar.DAY_OF_MONTH) < dataNascimentoCal.get(Calendar.DAY_OF_MONTH))) {
            idade--;
        }

        return idade;
    }



    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public Date getDataNascimento() {

        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {

        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {

        return endereco;
    }

    public void setEndereco(Endereco endereco) {

        this.endereco = endereco;
    }

    public Collection<Telefone> getTelsContato() {

        return telsContato;
    }

    public void setTelsContato(Collection<Telefone> telsContato) {

        this.telsContato = telsContato;
    }
}
