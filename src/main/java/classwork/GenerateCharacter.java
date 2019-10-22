package classwork;

import java.util.Random;

public class GenerateCharacter {

    public static String generateRandom() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        char code = alphabet.charAt(random.nextInt(alphabet.length()));
        for (int i = 0; i <=10 ; i++) {
            code = alphabet.charAt(random.nextInt(alphabet.length()));
            System.out.print(code);
        }
        return Character.toString(code);
    }

    public static void main(String[] args) {
        generateRandom();
    }


}