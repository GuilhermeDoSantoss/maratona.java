package Aprendendo.java;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a noite 1: ");
        float nota1 = sc.nextFloat();
        System.out.println("Digite o peso da nota 1: ");
        float peso1 = sc.nextFloat();

        System.out.println("Digite a noite 2: ");
        float nota2 = sc.nextFloat();
        System.out.println("Digite o peso da nota 2: ");
        float peso2 = sc.nextFloat();

        System.out.println("Digite a noite 3: ");
        float nota3 = sc.nextFloat();
        System.out.println("Digite o peso da nota 3: ");
        float peso3 = sc.nextFloat();

        float media = (nota1 * peso1 + nota2 * nota2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        System.out.println(" A média ponderada é: " + media);


    }
}
