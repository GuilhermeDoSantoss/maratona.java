package maratona.java.EstruturasCondicionais;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        // euros     0        euros 34,712     9.78%
        // euros   34,713     euros 68,587     37.35%
        // euros   68,588     euros 49.58%

        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68587) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
