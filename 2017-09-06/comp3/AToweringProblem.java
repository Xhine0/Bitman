package comp3;

import java.util.Arrays;
import java.util.Scanner;

public class AToweringProblem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read box heights.
        int[] boxHeights = new int[6];
        for (int i = 0; i < boxHeights.length; i++) {
            boxHeights[i] = scan.nextInt();
        }

        // Read tower heights.
        int towerOneHeight = scan.nextInt();
        int towerTwoHeight = scan.nextInt();

        // Declare tower box heights.
        int[] towerOneBoxes = new int[3];
        int[] towerTwoBoxes = new int[3];

        // Calculate what boxes the towers consist of.
        for (int i = 0; i < boxHeights.length; i++) {
            for (int j = i+1; j < boxHeights.length; j++) {
                for (int k = j+1; k < boxHeights.length; k++) {

                    if (boxHeights[i] + boxHeights[j] + boxHeights[k] == towerOneHeight) {
                        towerOneBoxes[0] = boxHeights[i];
                        towerOneBoxes[1] = boxHeights[j];
                        towerOneBoxes[2] = boxHeights[k];
                    }

                    if (boxHeights[i] + boxHeights[j] + boxHeights[k] == towerTwoHeight) {
                        towerTwoBoxes[0] = boxHeights[i];
                        towerTwoBoxes[1] = boxHeights[j];
                        towerTwoBoxes[2] = boxHeights[k];
                    }
                }
            }
        }

        printInOrder(towerOneBoxes);
        printInOrder(towerTwoBoxes);
    }

    public static void printInOrder(int[] t1) {
        Arrays.sort(t1);
        t1 = reverse(t1);
        for (int i = 0; i < t1.length; i++) {
            System.out.print(t1[i] + " ");
        }
    }

    public static int[] reverse(int[] xs) {
        int[] newList = new int[xs.length];

        int count = 0;
        for (int i = xs.length-1; i >= 0; i--) {
            newList[count] = xs[i];
            count++;
        }
        return newList;
    }
}