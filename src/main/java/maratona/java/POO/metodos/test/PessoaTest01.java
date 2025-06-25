package maratona.java.POO.metodos.test;

import maratona.java.POO.metodos.model.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome ("Guilherme");
        pessoa.setIdade (29);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade() );
    }

}
