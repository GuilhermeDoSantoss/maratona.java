package maratona.java.POO.metodos.model;

public class Estudante {

    // Quando você passa um parâmetro por referência para um metodo, você está dizendo:
    //"Ei metodo, aqui está o endereço dessa variável/objeto.
    // Se você mudar alguma coisa, muda direto na variável original!"


    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
