import java.util.Arrays;
import java.util.Scanner;

public class StickySituation {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		long[] list = new long[n];
		for(int i = 0; i < n; i++) {
			list[i] = reader.nextLong();
		}
		
		Arrays.sort(list);
		
		for(int i = 0; i < n; i++) {
			if(list[n-3] + list[n-2] >= list[n-1]) {
				System.out.println("possible");
				return;
			}
		}
		System.out.println("impossible");
	}

}
