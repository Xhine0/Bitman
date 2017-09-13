package warmup2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WorkStations {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int m = reader.nextInt();
		
		int[] a = new int[n];
		int[] s = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = reader.nextInt();
			s[i] = reader.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(s);
		
		for(int i = 0; i < n; i++) {
			
		}
	}

}
