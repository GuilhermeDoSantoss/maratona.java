package maratona.java.POO.metodos.test;

import maratona.java.POO.metodos.model.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "Guilherme";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Mari";
        estudante02.idade = 17;
        estudante02.sexo = 'F';
    }
}
