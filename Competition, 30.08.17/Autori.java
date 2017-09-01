import java.util.Scanner;

public class Autori {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println(reader.next().replaceAll("[^A-Z]", ""));
	}

}
