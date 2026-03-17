package br.univali.poo.exercises.domain.a03ex01;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String cpf, String name, double salario){
        super(cpf, name);
        setSalario(salario);
    }

    public Funcionario(Pessoa people, double salario){
        this(people.getCpf(), people.getName(), salario);
    }

    public double getSalario() {
        if(salario < 0) throw new IllegalArgumentException("O salário não pode ser negativo.");
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
