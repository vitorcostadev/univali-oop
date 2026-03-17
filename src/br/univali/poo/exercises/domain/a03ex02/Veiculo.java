package br.univali.poo.exercises.domain.a03ex02;

/**
 * Representa o objeto mais genérico de um Veiculo.
 */
public class Veiculo {
    private String placa;
    private int year;

    public Veiculo() { this.placa = ""; }

    /**
     * Inicializa solicitando todos os atributos do objeto como parametros
     * de entrada.
     * @param placa A placa do veiculo
     * @param ano O ano do veiculo.
     * @throws IllegalArgumentException caso a placa seja vazia ou o ano seja negativo.
     */
    public Veiculo(String placa, int ano) { setPlaca(placa); setYear(ano); }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if(placa.isEmpty()) throw new IllegalArgumentException("A string placa não pode ser vazia.");
        this.placa = placa;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 0) throw new IllegalArgumentException("O int year não pode ser negativo.");
        this.year = year;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", year=" + year +
                '}';
    }
}
