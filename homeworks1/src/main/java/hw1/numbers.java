package hw1;

import java.util.Random;
import java.util.Scanner;

public class numbers {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(100);

        String userName;
        int enteredNum;

        System.out.println("Let the game begin!");

        System.out.print("What is your name: ");
        userName = scanner.nextLine();

        System.out.print("Enter your guess: ");
        enteredNum = scanner.nextInt();

        System.out.println("Your name is: " + userName);
        System.out.println("Your guess is: " + enteredNum);

        boolean isTrue = true;

        if (enteredNum != randomNumber) {

            isTrue = true;

        }

        else if (isTrue) {

            isTrue = false;
            System.out.println("Congratulations: " + userName);

        }


        while (isTrue) {

            if (enteredNum < randomNumber) {

                System.out.println("Your number is too small. Please, try again.");

                System.out.print("Enter your guess: ");
                enteredNum = scanner.nextInt();

            }

            else if (enteredNum > randomNumber) {

                System.out.println("Your number is too big. Please, try again.");

                System.out.print("Enter your guess: ");
                enteredNum = scanner.nextInt();

            }

            else {

                System.out.println("Congratulations, " + userName);

                isTrue = false;

            }

        }


    }
}
