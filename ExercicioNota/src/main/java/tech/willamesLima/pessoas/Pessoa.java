package tech.willamesLima.pessoas;


import java.time.LocalDate;
import java.time.Period;
import java.util.Collection;


public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private Collection<Telefone> telsContato;

    public Pessoa(String nome, LocalDate dataNascimento, Endereco endereco, Collection<Telefone> telsContato) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telsContato = telsContato;
    }

    public void cadastrarEndereco(String rua, String cidade, String estado, String cep){
        this.endereco.setRua(rua);
        this.endereco.setCep(cep);
        this.endereco.setCidade(cidade);
        this.endereco.setEstado(estado);
    }

    public void cadastrar(String nome, LocalDate dataNascimento,Endereco endereco, Collection<Telefone> telsContato){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telsContato = telsContato;
    }
    // Método para calcular a idade
    public int obterIdade() {
        int idade = 0;
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        return  idade = periodo.getYears();

    }



    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public LocalDate getDataNascimento() {

        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {

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
