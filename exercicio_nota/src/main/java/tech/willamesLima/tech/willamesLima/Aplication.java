package tech.willamesLima.tech.willamesLima;

import tech.willamesLima.clientes.Cliente;
import tech.willamesLima.clientes.Profissao;
import tech.willamesLima.funcionarios.Cargo;
import tech.willamesLima.funcionarios.Funcionario;
import tech.willamesLima.pessoas.Endereco;
import tech.willamesLima.pessoas.Pessoa;
import tech.willamesLima.pessoas.Telefone;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Aplication {

    public static void main(String[] args) {


        Endereco endereco1 = new Endereco("Sobe e desce", "mamanguape", "Paraíba", "58001001");
        Endereco endereco2 = new Endereco("Senador Nilo Peçanha", "Maraial", "Pernambuco", "51310250");

        Telefone telefone1 = new Telefone("(83) 9 99432290", "celular");
        Telefone telefone2 = new Telefone("(83) 32220018", "comercial");

        Cargo cargo1 =  Cargo.DIRETOR;
        Cargo cargo2 =  Cargo.GERENTE;

        Profissao profissao1 =  Profissao.GERENTE;
        Profissao profissao2 =  Profissao.ATENDENTE;

        Pessoa pessoa1 = new Pessoa("José", LocalDate.of(2000, 11, 6), endereco1, List.of(telefone1));
        Pessoa pessoa2 = new Pessoa("Maria de Lurdes", LocalDate.of(2000, 05, 6), endereco2, List.of(telefone2));

        //Funcionario funcionario1 = new Funcionario("João", new Date(), endereco1, List.of(telefone1), cargo1, 5000.0, new Date());
        Cliente cliente1 = new Cliente("Ademir", LocalDate.of(2000, 11, 6), endereco2, List.of(telefone2), "CL213", profissao1);
        int idade = cliente1.obterIdade();
        System.out.println("Idade: " + idade);

        //System.out.println(funcionario1);
        System.out.println(cliente1);

    }
}
