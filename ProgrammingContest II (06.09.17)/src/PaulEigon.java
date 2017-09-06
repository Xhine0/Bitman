import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WorkStations {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int p = reader.nextInt();
		int q = reader.nextInt();
		
		boolean state = ((p+q) % (n*2)) <= n;
		System.out.println(state ? "paul" : "opponent");
	}

}
