package maratona.java.POO.sobrecargametodos.test;

import maratona.java.POO.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("Guilherme", "TV", 12);
        anime.init("Guilherme", "TV", 12, "Ação");
        anime.imprime();

    }
}
