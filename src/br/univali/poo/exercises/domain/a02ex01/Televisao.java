package br.univali.poo.exercises.domain.a02ex01;

/**
 * Representa uma televisão com os parametros
 * canal, volume e ligado.
 *
 * @author Vitor Costa
 */
public class Televisao {
    private int canal, volume;
    private boolean ligado;

    public Televisao()
    {
        setCanal(1);
    }

    /**
     *
     * @param canal o canal inicial da televisão (1-16)
     * @param volume o volume da televisao (0-10)
     * @param ligado alterne entre true (ligado) false (desligado)
     * @throws IllegalArgumentException se o volume ou canal forem inválidos.
     */
    public Televisao(int canal, int volume, boolean ligado) throws IllegalArgumentException{
        setCanal(canal);
        setVolume(volume);
        setLigado(ligado);
    }

    public void setCanal(int canal) throws IllegalArgumentException {
        if(canal < 1 || canal > 16)
            throw new IllegalArgumentException("O parametro canal é inválido.");
        this.canal = canal;
    }

    public void setVolume(int volume) throws IllegalArgumentException{
        if(volume < 0 || volume > 10)
            throw new IllegalArgumentException("O parametro volume é invalido.");
        this.volume = volume;
    }

    public void setLigado(boolean ligado) {
        if(this.ligado != ligado)
            this.ligado = ligado;
    }
}
