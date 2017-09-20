import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ProgrammingTutors {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        Point[] students = new Point[N];
        for (int i = 0; i < N; i++) {
            students[i] = new Point(scan.nextInt(), scan.nextInt());
        }

        ArrayList<Point> tutors = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            tutors.add(new Point(scan.nextInt(), scan.nextInt()));
        }

        // Sort for binary search.
        Arrays.sort(students);
        Collections.sort(tutors);

        int greatestDistance = 0;

        for (int i = 0; i < N; i++) {
            Point student = students[i];
            Point closest = findClosest(student, tutors);
            System.out.println(closest);
            int distance = student.distanceTo(closest);
            if (distance > greatestDistance) {
                greatestDistance = distance;
            }
        }

        System.out.println(greatestDistance);
    }

    private static Point findClosest(Point student, ArrayList<Point> tutors) {
        int min = 0;
        int max = tutors.size();

        Point closest = null;

        boolean done = false;
        while(!done) {
            int mid = (max-min)/2;

            Point tutor = tutors.get(mid);
            if (tutor.equals(student)) {
                tutors.remove(mid);
                return tutor;
            } else if (student.compareTo(tutor) < 0) {
                closest = tutor;
                min = mid+1;
            } else if (student.compareTo(tutor) > 0) {
                closest = tutor;
                max = mid-1;
            }

            if (max == min) {
                done = true;
            }
        }

        return closest;
    }

    public static class Point implements Comparable<Point> {

        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int distanceTo(Point other) {
            return Math.abs(other.x - x) + Math.abs(other.y - y);
        }

        @Override
        public int compareTo(Point other) {
            if (this.x == other.x) {
                if (this.y == other.y) {
                    return 0;
                } else if (this.y < other.y) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (this.x < other.x) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
