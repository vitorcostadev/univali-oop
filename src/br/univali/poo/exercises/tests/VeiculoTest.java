package br.univali.poo.exercises.tests;

import br.univali.poo.exercises.domain.a03ex02.Caminhao;
import br.univali.poo.exercises.domain.a03ex02.Onibus;
import br.univali.poo.exercises.domain.a03ex02.Veiculo;

public class VeiculoTest {
    static void main() {
        Veiculo vec = new Veiculo("9SF2343", 2011);
        Onibus bus = new Onibus(vec, 22);
        Caminhao caminhao= new Caminhao(vec, 23);

        System.out.println(vec);
        System.out.println(bus);
        System.out.println(caminhao);
    }
}
