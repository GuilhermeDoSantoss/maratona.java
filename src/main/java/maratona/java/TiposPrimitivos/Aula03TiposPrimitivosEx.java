package maratona.java.TiposPrimitivos;

/*
Prática

Criando variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

-Eu <nome> morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosEx {
    public static void main(String[] args) {
    String nome = "Guilherme";
    String endereco = "Rua Caracaraí";
    double salario = 4687.78;
    String dataRecebimento = "20/12/2024";
    String relatorio = "Eu "+ nome+ " morando no endereço "+endereco+
            ", confirmo que recebi o salário de " +salario+ ", na data "+dataRecebimento;

        System.out.println(relatorio);

    }
}
