package maratona.java.POO.blocosinicializacao.test;

import maratona.java.POO.blocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio: anime.getEpisodios()){
            System.out.print(episodio + " ");
        }
    }
}
