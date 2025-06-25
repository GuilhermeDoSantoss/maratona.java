package maratona.java.POO.associacao.test;

import maratona.java.POO.associacao.dominio.Jogador;
import maratona.java.POO.associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Savarino");
        Time time = new Time("Botafogo");

        jogador1.setTime(time);

        jogador1.imprime();


    }
}
