package warmup2;

import java.util.Scanner;

public class Toast {
    static int nPeople;
    static int armLength;
    static int klinks;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        nPeople = scan.nextInt();
        armLength = scan.nextInt();
        klinks = scan.nextInt();

        System.out.println(peopleWhoKlinked());
    }

    public static int peopleWhoKlinked() {
        int test = 0;
        for (int i = 0; i < nPeople; i++) {
            for (int j = i+1; j < nPeople; j++) {
                test++;
                if (test == klinks) {
                    return test;
                }
            }
        }
        return 0;
    }

    public static double tableDiameter() {
        return circumference()/Math.PI;
    }

    public static double circumference() {
        return distanceBetweenPeople()*nPeople;
    }

    public static double distanceBetweenPeople() {

        double distance = 2*(tableDiameter()/2 * Math.sin(angleBetweenPeople()/2));
        return distance;
    }

    public static double angleBetweenPeople() {
        return 360/nPeople;
    }

    public static int fac(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n*fac(n-1);
        }
    }
}
