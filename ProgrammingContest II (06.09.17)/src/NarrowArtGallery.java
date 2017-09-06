import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class NarrowArtGallery {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		
		boolean doRun = true;
		while(doRun) {
			int sum = 0;
			int n = reader.nextInt();
			int k = reader.nextInt();
			
			if(n == 0 && k == 0) {
				doRun = false;
				break;
			}
			
			List<int[]> a = new ArrayList<>();
			for(int i = 0; i < n; i++) {
				int a1 = reader.nextInt();
				int a2 = reader.nextInt();
				a.add(new int[] {a1, a2});
				
				sum += a1 + a2;
			}
			
			while(k > 0) {
				int smallest = a.get(0)[0];
				int x = 0;
				int y = 0;
				
				loopA:
				for(int i = 0; i < a.size(); i++) {
					loopB:
					for(int j = 0; j < 2; j++) {
						int e = a.get(i)[j];
						
						if(i == 0) { j = 1; }
						if(e < 0) {
							continue loopB;
						}
						
						if(checkVal(a, j, i) < checkVal (a, x, y)) {
							smallest = checkVal(a, j, i);
							x = j; y = x;
						}
					}
				}
				
				int newX = x == 0 ? 1 : 0;
				if(y > 0) {
					a.get(y-1)[newX] = -1;
				}
				if(y < a.size()-1) {
					a.get(y+1)[newX] = -1;
				}
				
				sum -= a.get(y)[x];
				a.remove(y);
				k--;
			}
			
			System.out.println(sum);
		}
	}

	
	public static int checkVal(List<int[]> a, int x, int y) {
		int val = 0;
		int newX = x == 0 ? 1 : 0;
		
		if(y > 0) {
			val += a.get(y-1)[newX];
		}
		if(y < a.size()-1) {
			val += a.get(y+1)[newX];
		}
		
		val += a.get(y)[x];
		
		return val;
	}
}
