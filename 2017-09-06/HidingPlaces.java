import java.util.Scanner;
public class HidingPlaces {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int[][] a = new int[n][n];
		for(int i = 0; i < n; i++) {
			String str = reader.next();
			int x = (int)(str.charAt(0)) - 96;
			int y = (int)(str.charAt(1)) - 48;
			
			a[i] = new int[] {x, y};
		}
		
		int[][] c = new int[8][8];
		
		int s = 64;
		while(s > 0) {
			//int a1 = 
		}
	}

}
