package maratona.java.POO.Metodos.model;

// Exercicio:
// Crie uma classe Funcionario com os seguintes atributos
//nome, idade, salario (tres salarios devem ser guardados)

// crie dois metodos
// 1 - para imprimir os dados
// 2 - para tirar a media dos salarios e imprimir o resultado

public class Funcionario{
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double salario: this.salarios){
            System.out.println(salario + " ");
        }
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial(){
        double media = 0;
        for (double salario: salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial "+ media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
