package hw2;

import java.util.Random;
import java.util.Scanner;

public class shooting {

    public static int[] isMoreThanThen(int[] ourArray) {


        throw new IllegalArgumentException("not implemented yet");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomLine = random.nextInt(4) + 1;
        int randomBar = random.nextInt(4) + 1;

        System.out.println("All set. Get ready to rumble!");

        String[][] shootingBar =
                {
                        { "| 0 |", "| 1 |", "| 2 |", "| 3 |", "| 4 |", "| 5 |" },
                        { "| 1 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                        { "| 2 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                        { "| 3 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                        { "| 4 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                        { "| 5 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                };

        for (   int i = 0; i < shootingBar.length; i++  )
        {
            System.out.println(" ");

            for (   int j = 0; j < shootingBar.length; j++  )

            {
                System.out.print(shootingBar[i][j] + " ");
            }
        }

        System.out.println("Enter a line number between 1 - 5: ");
        int userLine = scanner.nextInt();

        while ( userLine > 5 || userLine < 1    )
        {

            System.out.println("Enter a line number between 1 - 5: ");
            userLine = scanner.nextInt();

        }

        System.out.println("Enter a bar number between 1 - 5: ");
        int userBar = scanner.nextInt();

        while (  userBar > 5 || userBar < 1   )
        {

            System.out.println("Enter a bar number between 1 - 5: ");
            userBar = scanner.nextInt();

        }

        while (     userLine != randomLine || userBar != randomBar     )
        {

            shootingBar[userLine][userBar] = "| * |";

            for (   int i = 0; i < shootingBar.length; i++  )
            {

                System.out.println(" ");

                for (   int j = 0; j < shootingBar.length; j++  )
                {
                    System.out.print(shootingBar[i][j] + " ");
                }
            }

            System.out.println("Enter a line number between 1 - 5: ");
            userLine = scanner.nextInt();

            while (     userLine > 5 || userLine < 1    )
            {

                System.out.println("Enter a line number between 1 - 5: ");
                userLine = scanner.nextInt();

            }

            System.out.println("Enter a bar number between 1 - 5: ");
            userBar = scanner.nextInt();

            while (     userBar > 5 || userBar < 1  )
            {

                System.out.println("Enter a bar number between 1 - 5: ");
                userBar = scanner.nextInt();

            }
        }

        shootingBar[userLine][userBar] = "| X |";
        System.out.print("You have won!");

        for (   int i = 0; i < shootingBar.length; i++  )
        {

            System.out.println(" ");

            for (   int j = 0; j < shootingBar.length; j++  )
            {
                System.out.print(shootingBar[i][j] + " ");
            }
        }


    }
}