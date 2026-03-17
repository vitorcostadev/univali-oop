package br.univali.poo.exercises.domain.a03ex01;

public class Gerente extends Funcionario {
    private String area;
    private double gratificacao;

    public Gerente(String cpf, String name, double salario,
            String area, double gratificacao){
        super(cpf, name ,salario);
        setArea(area);
        setGratificacao(gratificacao);
    }

    public Gerente(Funcionario func, String area, double gratificacao){
        this(func.getCpf(), func.getName(), func.getSalario(), area, gratificacao);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        if(area.isEmpty()) throw new IllegalArgumentException("A string area não pode ser vazia.");
        this.area = area;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        if(gratificacao < 0.0) throw new IllegalArgumentException("A gratificação não pode ser negativa.");
        this.gratificacao = gratificacao;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "area='" + area + '\'' +
                ", gratificacao=" + gratificacao +
                '}';
    }
}
