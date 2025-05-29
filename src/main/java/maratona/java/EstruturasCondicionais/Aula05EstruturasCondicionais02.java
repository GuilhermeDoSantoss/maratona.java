package maratona.java.EstruturasCondicionais;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
         // idade < 15 categoria infaltil
         // idade >= 15 && idade < 18 categoria juniores
         // idade >= 18 categoria profissional

        int idade = 17;
        String categoria;

        if (idade < 15){
           categoria = "Categoria infantil";
        } else if(idade >= 15 && idade < 18){
            categoria = "Categoria juniores";
        } else{
            categoria = "Categoria profissional";
        }
        System.out.println(categoria);

    }

}
