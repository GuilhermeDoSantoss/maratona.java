package maratona.java.Arrays;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        // formas de inicializar o array
        int[] numeros = new int[4];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{5, 4, 3, 2, 1};

        for (int i = 0; i < numeros3.length ; i++) {
            System.out.println(numeros3[i]);
        }

        for(int num : numeros3){
            System.out.println(num);
        }
    }
}
