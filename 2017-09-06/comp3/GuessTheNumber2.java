package comp3;

import java.util.Scanner;

public class GuessTheNumber2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 1;
        int max = 1000;

        int guess = (min+max)/2;

        for (int i = 0; i < 10; i++) {

            System.out.println(guess);
            System.out.flush();
            String input = scan.nextLine();

            switch (input) {
                case "lower":
                    max = guess-1;
                    guess = (int)Math.floor((min+max)/2);
                    break;
                case "higher":
                    min = guess+1;
                    guess = (int)Math.ceil((min+max)/2);
                    break;
                case "correct":
                    System.exit(0);
            }
        }
    }
}
