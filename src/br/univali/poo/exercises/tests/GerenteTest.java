package br.univali.poo.exercises.tests;

import br.univali.poo.exercises.domain.a03ex01.Funcionario;
import br.univali.poo.exercises.domain.a03ex01.Gerente;

public class GerenteTest {
    static void main() {
        Funcionario func = new Funcionario("075.406.173-29", "Vitor Costa", 4900);
        Gerente gerente = new Gerente(func, "TI", 2500);

        System.out.println(gerente);
    }
}
