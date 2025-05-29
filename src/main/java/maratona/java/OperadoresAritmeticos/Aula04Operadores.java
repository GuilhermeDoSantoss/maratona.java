package maratona.java.OperadoresAritmeticos;

public class Aula04Operadores {
    public static void main(String[] args) {
       // + - / *
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 * numero02;
        System.out.println(resultado);

        // % resto da divisão
        int resto = 21 % 7;
        System.out.println(resto);

        // <    >  <=   >=   ==   !=
        boolean isDezMaiorQueVinte = 10 >= 20;
        boolean isDezMenorQueVinte = 10 <= 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualQueDez = 10 == 10;
        boolean isDezDiferenteQueDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte: " +isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " +isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte: " +isDezIgualQueVinte);
        System.out.println("isDezIgualQueDez: " +isDezIgualQueDez);
        System.out.println("isDezDiferenteQueDez: " +isDezDiferenteQueDez);

        // && (AND)

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: " +isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " +isDentroDaLeiMenorQueTrinta);

        // || (OR)
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel: " + isPlaystationCincoCompravel);

        //   =    +=     -=     *=    /=     %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        // incrementação ++    --
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--;
        ++ contador;
        -- contador;
        System.out.println(contador);
        
    }
}
