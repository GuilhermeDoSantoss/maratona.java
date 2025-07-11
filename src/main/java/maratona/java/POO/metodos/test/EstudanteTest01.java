package maratona.java.POO.metodos.test;

import maratona.java.POO.metodos.model.Estudante;
import maratona.java.POO.metodos.model.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Guilherme";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Mari";
        estudante02.idade = 17;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);

        System.out.println(estudante01.nome);
        System.out.println(estudante01.sexo);
        System.out.println(estudante01.idade);


        System.out.println("-------------------------");
        System.out.println(estudante02.nome);
        System.out.println(estudante02.sexo);
        System.out.println(estudante02.idade);
    }
}
