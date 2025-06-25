package maratona.java.POO.classes.test;

import maratona.java.POO.classes.model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Civic";
        carro1.modelo = "Honda";
        carro1.ano = 2005;

        carro2.nome = "HRV";
        carro2.modelo = "Hyundai";
        carro2.ano = 2010;

        // carro1 = carro2;

        System.out.println("Nome: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);

        System.out.println("\nNome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);
    }
}
