package warmup3.Rudi;

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 1;
        int max = 1000;

        int guess = (min+max)/2;

        for (int i = 0; i < 10; i++) {
            System.out.println(guess);
            String input = scan.nextLine();

            switch (input) {
                case "lower":
                    max = guess-1;
                    break;
                case "higher":
                    min = guess+1;
                    break;
                case "correct":
                    System.exit(0);
            }
        }
    }
}
