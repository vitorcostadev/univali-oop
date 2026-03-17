package br.univali.poo.exercises.domain.a03ex02;

public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao(String placa, int ano, int eixos){
        super(placa, ano);
        setEixos(eixos);
    }

    public Caminhao(Veiculo vec, int eixos){
        this(vec.getPlaca(), vec.getYear(), eixos);
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        if(eixos < 0) throw new IllegalArgumentException("O int eixos não pode ser negativo.");
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "eixos=" + eixos +
                '}';
    }
}
