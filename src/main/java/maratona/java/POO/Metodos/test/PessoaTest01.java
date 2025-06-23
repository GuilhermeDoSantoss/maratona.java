package maratona.java.POO.Metodos.test;

import maratona.java.POO.Metodos.model.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome ("Guilherme");
        pessoa.setIdade (29);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade() );
    }

}
