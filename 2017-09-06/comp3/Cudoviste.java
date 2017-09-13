package comp3;

import java.util.Scanner;

public class Cudoviste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Declare size of map.
        int rows = scan.nextInt();
        int columns = scan.nextInt();

        // Declare map.
        char[][] map = new char[columns][rows];

        // Read input and put it in 2D array.
        for (int row = 0; row < rows; row++) {
            String str = scan.next();
            for (int column = 0; column < columns; column++) {
                map[column][row] = str.charAt(column);
            }
        }

        // Print thee possible spaces on the map when destroying i cars.
        for (int i = 0; i < 5; i++) {
            System.out.println(possibleSpaces(map, i));
        }
    }

    /**
     * Calculate the number of possible parking
     * spaces based on the map and how many
     * cars are supposed to be crushed.
     * @param map the map (2D-array)
     * @param cars the number of cars to be squashed.
     * @return the number of possible spaces.
     */
    public static int possibleSpaces(char[][] map, int cars) {

        int possibleSpaces = 0;
        for (int y = 0; y < map.length-1; y++) {
            for (int x = 0; x < map[0].length-1; x++) {
                char[][] space = new char[2][2];
                space[0][0] = map[y][x];
                space[0][1] = map[y][x+1];
                space[1][0] = map[y+1][x];
                space[1][1] = map[y+1][x+1];
                if (possibleSpace(space) == cars) {
                    possibleSpaces++;
                }
            }
        }

        return possibleSpaces;
    }

    public static int possibleSpace(char[][] map) {
        int carsSquashed = 0;
        for (int y = 0; y < 2; y++) {
            for (int x = 0; x < 2; x++) {


                if (map[y][x] == '#') {
                    return -1;
                } else if (map[y][x] == 'X') {
                    carsSquashed++;
                }
            }
        }

        return carsSquashed;
    }
}
