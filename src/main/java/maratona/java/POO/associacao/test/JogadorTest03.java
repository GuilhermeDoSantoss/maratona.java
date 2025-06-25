package maratona.java.POO.associacao.test;

import maratona.java.POO.associacao.dominio.Jogador;
import maratona.java.POO.associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Barboza");
        Jogador jogador2 = new Jogador("Arthur");
        Time time = new Time("Botafogo");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("------JOGADOR-----");

        jogador.imprime();

        System.out.println("------TIME------");

        time.imprime();

    }
}
