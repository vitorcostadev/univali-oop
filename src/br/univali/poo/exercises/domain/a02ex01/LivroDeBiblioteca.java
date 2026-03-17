package br.univali.poo.exercises.domain.a02ex01;

/**
 * Representa um LivroDeBiblioteca,
 * como o exercício impede o uso de herança, iremos implementar o objeto Livro
 * como atributo desta classe.
 * @author Vitor Costa
 */
public class LivroDeBiblioteca {
    private Livro livro;
    private Integer code;
    private boolean isEmprestado;

    /**
     *
     * @param livro O livro genérico.
     * @param code O codigo do livro para guardar na biblioteca.
     * @throws IllegalArgumentException se o titulo do livro for vazio.
     */
    public LivroDeBiblioteca(Livro livro, int code) throws IllegalArgumentException{
        this.livro = livro;
        this.code = code;
        if(code % 2 == 0) this.isEmprestado = true;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public boolean isEmprestado() {
        return isEmprestado;
    }

    public void setEmprestado(boolean emprestado) {
        if(emprestado != this.isEmprestado)
            this.isEmprestado = emprestado;
    }

    @Override
    public String toString() {
        return "LivroDeBiblioteca{" +
                "livro=" + livro +
                ", code=" + code +
                ", isEmprestado=" + isEmprestado +
                '}';
    }
}
