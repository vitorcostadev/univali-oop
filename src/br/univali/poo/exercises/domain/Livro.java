package br.univali.poo.exercises.domain;

/**
 * Representa o livro genérico, usado posteriormente para
 * definir a composição de LivroDeLivraria e LivroDeBiblioteca
 * (pois o exercício impede o uso de herança).
 *
 * @author Vitor Costa
 */
public class Livro {
    private String title;
    private String author;

    /**
     *
     * @param title o titulo do Livro.
     * @param author o autor do livro.
     * @throws IllegalArgumentException caso o titulo do livro seja vazio.
     */
    public Livro(String title, String author) throws IllegalArgumentException{
        setTitle(title);
        setAuthor(author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws IllegalArgumentException {
        if(title.isEmpty()) throw new IllegalArgumentException("O título não pode ser vazio;");

        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws IllegalArgumentException {
        if(author.isEmpty()) throw new IllegalArgumentException("O author não pode ser vazio;");
        this.author = author;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
