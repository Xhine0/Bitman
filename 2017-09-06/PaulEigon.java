import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PaulEigon {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int p = reader.nextInt();
		int q = reader.nextInt();
		
		int sum = p+q;
		int r = sum % (n*2);
		
		boolean state = r < n;
		System.out.println(state ? "paul" : "opponent");
	}
}
