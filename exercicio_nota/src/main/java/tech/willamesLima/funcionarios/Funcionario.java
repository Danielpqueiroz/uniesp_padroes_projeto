package tech.willamesLima.funcionarios;

import tech.willamesLima.clientes.Profissao;
import tech.willamesLima.pessoas.Endereco;
import tech.willamesLima.pessoas.Pessoa;
import tech.willamesLima.pessoas.Telefone;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

public class Funcionario extends Pessoa {

    private Integer matrícula;
    private Cargo cargo;
    private Double salario;
    private Date dataAdmissao;

    public Funcionario(String nome, LocalDate dataNascimento, Endereco endereco, Collection<Telefone> telsContato) {
        super(nome, dataNascimento, endereco, telsContato);
    }


    public void cadastrar(String nome, LocalDate dataNascimento, Endereco endereco, Collection<Telefone> telsContato, String codigo, Profissao profissao){
        setNome(nome);
        setDataNascimento(dataNascimento);
        setEndereco(endereco);
        setTelsContato(telsContato);
        this.matrícula = matrícula;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }


    public Integer getMatrícula() {
        return matrícula;
    }
    public void promover(Cargo novoCargo) {
        this.cargo = novoCargo;
    }
    // Método para reajustar o salário com base em um percentual

    public void reajustarSalario(double percentual) {
        this.salario += this.salario * (percentual / 100);
    }

    public void setMatrícula(Integer matrícula) {
        this.matrícula = matrícula;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matrícula=" + matrícula +
                ", cargo=" + cargo +
                ", salario=" + salario +
                ", dataAdmissao=" + dataAdmissao +
                '}';
    }
}
