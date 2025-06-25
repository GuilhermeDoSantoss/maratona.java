package maratona.java.POO.associacao.test;

import maratona.java.POO.associacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Igor Jesus");
        Jogador jogador2 = new Jogador("Magic Freitas");
        Jogador jogador3 = new Jogador("Gregore");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
