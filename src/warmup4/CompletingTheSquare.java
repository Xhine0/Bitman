
import java.util.Scanner;

public class CompletingTheSquare {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Position first = new Position(scan.nextInt(), scan.nextInt());
        Position second = new Position(scan.nextInt(), scan.nextInt());
        Position third = new Position(scan.nextInt(), scan.nextInt());

        Position[] positions = new Position[2];
        Position mid = null;
        if (first.distanceTo(second) == first.distanceTo(third)) {
            mid = first;
            positions[0] = second;
            positions[1] = third;
        } else if (second.distanceTo(first) == second.distanceTo(third)) {
            mid = second;
            positions[0] = first;
            positions[1] = third;
        } else if (third.distanceTo(first) == third.distanceTo(second)) {
            mid = third;
            positions[0] = first;
            positions[1] = second;
        }

        double xDist = mid.xDist(positions[0]);
        int x = (int) xDist + positions[1].x;

        double yDist = mid.yDist(positions[0]);
        int y = (int) yDist + positions[1].y;

        System.out.println(x + " " + y);
    }

    public static class Position implements Comparable<Position> {

        int x, y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public double xDist(Position other) {
            return other.x - this.x;
        }

        public double yDist(Position other) {
            return other.y - this.y;
        }

        public double distanceTo(Position other) {
            int xDist = other.x - this.x;
            int yDist = other.y - this.y;
            return Math.sqrt(Math.pow(xDist, 2) + Math.pow(yDist, 2));
        }

        @Override
        public int compareTo(Position other) {
            if (this.x == other.x) {
                if (this.y == other.y) {
                    return 0;
                }
            }
            return -1;
        }
    }
}
