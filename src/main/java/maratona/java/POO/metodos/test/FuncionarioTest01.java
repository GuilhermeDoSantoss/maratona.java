package maratona.java.POO.metodos.test;

import maratona.java.POO.metodos.model.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Guilherme");
        funcionario.setIdade(29);
        funcionario.setSalarios(new double[]{1200, 975.23, 2000});
        funcionario.imprime();
        System.out.println("Média " + funcionario.getMedia());
    }
}
