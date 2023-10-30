package tech.willamesLima.clientes;

import tech.willamesLima.pessoas.Endereco;
import tech.willamesLima.pessoas.Pessoa;
import tech.willamesLima.pessoas.Telefone;

import java.util.Collection;
import java.util.Date;

public class Cliente extends Pessoa {

    private String codigo;
    private Profissao profissao;

    public Cliente(String nome, Date dataNascimento, Endereco endereco, Collection<Telefone> telsContato, String codigo, Profissao profissao) {
        super(nome, dataNascimento, endereco, telsContato);
        this.codigo = codigo;
        this.profissao = profissao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo='" + codigo + '\'' +
                ", profissao=" + profissao.getDescricao() +
                ", nome='" + getNome() + '\'' +
                ", dataNascimento=" + getDataNascimento() +
                ", endereco=" + getEndereco() +
                ", telsContato=" + getTelsContato() +
                '}';
    }
}
