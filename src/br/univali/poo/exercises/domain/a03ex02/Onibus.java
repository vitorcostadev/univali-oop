package br.univali.poo.exercises.domain.a03ex02;

/**
 * Representa uma subclasse de Veiculo, onde representamos
 * um onibus.
 */
public class Onibus extends Veiculo{
    private int assentos;

    /**
     * Inicializa o objeto Onibus com todos os parametros do objeto herdado
     * e os deste objeto.
     * @param placa A placa do veiculo.
     * @param ano O ano do veiculo.
     * @param assentos A quantidade de assentos do Onibus.
     * @throws IllegalArgumentException se a quantidade de assentos for negativa.
     */
    public Onibus(String placa, int ano, int assentos){
        super(placa, ano);
        setAssentos(assentos);
    }

    public Onibus(Veiculo vec, int assentos){
        this(vec.getPlaca(), vec.getYear(), assentos);
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        if(assentos < 0) throw new IllegalArgumentException("O int assentos não pode ser negativo.");
        this.assentos = assentos;
    }

    @Override
    public String toString() {
        return "Onibus{" +
                "assentos=" + assentos +
                '}';
    }
}
