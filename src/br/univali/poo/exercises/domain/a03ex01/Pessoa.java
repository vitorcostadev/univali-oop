package br.univali.poo.exercises.domain.a03ex01;

import java.util.Objects;

/**
 * Aula 03 - Exercício 01
 */
public class Pessoa {
    private String cpf, name;

    public Pessoa(String cpf, String name) {
        setCpf(cpf);
        setName(name);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.isEmpty()) throw new IllegalArgumentException("O cpf não pode ser vazio.");
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()) throw new IllegalArgumentException("O nome não pode ser vazio.");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Pessoa p = (Pessoa) obj;
        return Objects.equals(p.getCpf(), getCpf());
    }
}
