package maratona.java.POO.associacao.test;

import maratona.java.POO.associacao.dominio.Escola;
import maratona.java.POO.associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Marcelo");
        Professor[] professores = {professor};
        Escola escola = new Escola("Havard");

        escola.imprime();
    }
}
