package warmup2;

import java.util.Scanner;
public class Tarifa {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int x = reader.nextInt();
		int n = reader.nextInt();
		
		int r = 0;
		
		for(int i = 0; i < n; i++) {
			int pi = reader.nextInt();
			r += (x - pi);
		}
		System.out.println(r + x);
	}

}
