package maratona.java.POO.Classes.test;

import maratona.java.POO.Classes.model.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
       Estudante estudante = new Estudante();
       Estudante estudante2 = new Estudante();

       estudante.nome = "Maicon";
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);


        System.out.println(estudante2.sexo);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.nome);


    }
}
