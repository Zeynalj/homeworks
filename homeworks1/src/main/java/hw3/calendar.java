package hw3;

import java.util.Scanner;

public class calendar {

    private static boolean checksIfOk (String initial, String [][] array) {

        for (String[] strings : array) {

            if (    strings[0].equals(convertingToTitle(initial))   )

            {

                return true;

            }

        }

        return false;

    }

    private static int findingIndexes (String initial, String [][] array) {

        for (   int b = 0; b < array.length; b++    ) {

            if (    array[b][0].equals(convertingToTitle(initial))     )

            {

                return b;

            }

        }

        return -1;

    }


    private static String convertingToTitle (String initial) {

        StringBuilder convert = new StringBuilder();

        boolean cases = true;

        for (   char ch: initial.toCharArray()  )

        {

            if (cases) {

                ch = Character.toTitleCase(ch);
                cases = false;
            }

            else {
                ch = Character.toLowerCase(ch);
            }

            convert.append(ch);

        }

        return convert.toString();

    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, input the day of week: ");
        String userInput = scanner.nextLine();

        String[][] schedule =

                {

                        {"Monday", "To watch Udemy lectures"},

                        {"Tuesday", "To recap the subjects"},

                        {"Wednesday", "To memorize the notes"},

                        {"Thursday", "To devote whole day to practice"},

                        {"Friday", "To watch Udemy lectures"},

                        {"Saturday", "To fulfill home assignments"},

                        {"Sunday", "To rest"}

                };


        while (     !(userInput.equals("exit"))     )

        {

            if (    checksIfOk(userInput, schedule)    ) {

                System.out.println(     "Your tasks for " + schedule[findingIndexes(    userInput, schedule     )] [0]
                                        + " : " + schedule[findingIndexes(  userInput, schedule   )] [1]);

                System.out.print(   "Please, input the day of week: "   );
                userInput = scanner.nextLine();

            }
            else {

                System.out.print(   "Sorry, I don't understand you, please try again: "     );
                userInput = scanner.nextLine();

            }

        }



    }

}
