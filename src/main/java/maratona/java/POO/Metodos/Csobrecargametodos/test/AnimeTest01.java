package maratona.java.POO.Metodos.Csobrecargametodos.test;

import maratona.java.POO.Metodos.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("Guilherme", "TV", 12);
        anime.init("Guilherme", "TV", 12, "Ação");
        anime.imprime();

    }
}
