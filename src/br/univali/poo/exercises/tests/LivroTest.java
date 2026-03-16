package br.univali.poo.exercises.tests;

import br.univali.poo.exercises.domain.Livro;
import br.univali.poo.exercises.domain.LivroDeBiblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LivroTest {
    private static final List<LivroDeBiblioteca> livros = new ArrayList<>(List.of(
            new LivroDeBiblioteca(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien"), 101),
            new LivroDeBiblioteca(new Livro("1984", "George Orwell"), 102),
            new LivroDeBiblioteca(new Livro("Clean Code", "Robert C. Martin"), 103),
            new LivroDeBiblioteca(new Livro("Dom Casmurro", "Machado de Assis"), 104),
            new LivroDeBiblioteca(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry"), 105),
            new LivroDeBiblioteca(new Livro("O Processo", "Franz Kafka"), 106),
            new LivroDeBiblioteca(new Livro("Crimes e Castigo", "Fiódor Dostoiévski"), 107),
            new LivroDeBiblioteca(new Livro("A Metamorfose", "Franz Kafka"), 108),
            new LivroDeBiblioteca(new Livro("O Hobbit", "J.R.R. Tolkien"), 109),
            new LivroDeBiblioteca(new Livro("Fundação", "Isaac Asimov"), 110),
            new LivroDeBiblioteca(new Livro("Duna", "Frank Herbert"), 111),
            new LivroDeBiblioteca(new Livro("O Nome da Rosa", "Umberto Eco"), 112),
            new LivroDeBiblioteca(new Livro("A Revolução dos Bichos", "George Orwell"), 113),
            new LivroDeBiblioteca(new Livro("Ensaio sobre a Cegueira", "José Saramago"), 114),
            new LivroDeBiblioteca(new Livro("Grande Sertão: Veredas", "João Guimarães Rosa"), 115),
            new LivroDeBiblioteca(new Livro("O Alquimista", "Paulo Coelho"), 116),
            new LivroDeBiblioteca(new Livro("Admirável Mundo Novo", "Aldous Huxley"), 117),
            new LivroDeBiblioteca(new Livro("Moby Dick", "Herman Melville"), 118),
            new LivroDeBiblioteca(new Livro("O Cortiço", "Aluísio Azevedo"), 119),
            new LivroDeBiblioteca(new Livro("Fahrenheit 451", "Ray Bradbury"), 120)
    ));


    static void main() {
        List<String> livrosNotEmprestados = livros.stream()
                .filter(Predicate.not(LivroDeBiblioteca::isEmprestado))
                .map(l -> l.getLivro().getTitle())
                .sorted()
                .toList();

        System.out.println(livrosNotEmprestados);
    }
}
