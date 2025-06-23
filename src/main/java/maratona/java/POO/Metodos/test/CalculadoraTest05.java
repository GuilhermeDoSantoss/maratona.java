package maratona.java.POO.Metodos.test;

import maratona.java.POO.Metodos.model.Calculadora;
// trabalhando com arrays

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        // trabalhando com VarArgs
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }
}
