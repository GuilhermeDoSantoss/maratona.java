package maratona.java.EstruturasCondicionais;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 20;
        // !
        boolean isAutorizadoomprarBebida = idade >= 18;
        if(isAutorizadoomprarBebida){
            System.out.println("Autorizado a compar bebida alcólica");
        } else{
            System.out.println("Não autorizado");
        }
        if(!isAutorizadoomprarBebida){
            System.out.println("Não autorizado");
        }
        boolean c = false;
        if (c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }


    }

}
