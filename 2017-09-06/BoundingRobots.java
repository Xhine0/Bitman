import java.util.Scanner;

public class BoundingRobots {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {

            int realX = 0, realY = 0;
            int thinkX = 0, thinkY = 0;

            int width = read.nextInt();
            int height = read.nextInt();

            if (width == 0 && height == 0) {
                break;
            }

            int segments = read.nextInt();

            for (int i = 0; i < segments; i++) {
                char c = read.next().charAt(0);
                int steps = read.nextInt();

                switch (c) {
                    case 'u':
                        thinkY+=steps;
                        if (realY + steps <= height-1) {
                            realY+=steps;
                        } else {
                            realY = height-1;
                        }
                        break;
                    case 'd':
                        thinkY-=steps;
                        if (realY - steps >= 0) {
                            realY-=steps;
                        } else {
                            realY = 0;
                        }
                        break;
                    case 'l':
                        thinkX-=steps;
                        if (realX - steps >= 0) {
                            realX -= steps;
                        } else {
                            realX = 0;
                        }
                        break;
                    case 'r':
                        thinkX+=steps;
                        if (realX + steps <= width-1) {
                            realX+=steps;
                        } else {
                            realX = width-1;
                        }
                        break;
                }
            }

            System.out.println("Robot thinks " + thinkX + " " + thinkY);
            System.out.println("Actually at " + realX + " " + realY);
        }
    }

    public static int spaceCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}