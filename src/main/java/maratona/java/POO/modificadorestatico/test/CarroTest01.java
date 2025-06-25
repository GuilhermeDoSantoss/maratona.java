package maratona.java.POO.modificadorestatico.test;

import maratona.java.POO.modificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro c1 = new Carro(" BMW", 230);
        Carro c2 = new Carro("X6", 200);
        Carro c3 = new Carro("Fusca", 110);

       Carro.setVelocidadeLimite(300);


        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
