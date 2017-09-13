import java.util.Scanner;
public class Election {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = reader.nextInt();
			int num = reader.nextInt();
			//System.out.println("num 0: " + num);
			int max = num;
			int jMax = 0;
			float sum = num;
			boolean isEqual = false;
			
			for(int j = 1; j < n; j++) {
				num = reader.nextInt();
				//System.out.println("num " + j + ": " + num);
				if(num == max) {
					isEqual = true;
				}
				
				if(num > max) {
					isEqual = false;
					max = num;
					jMax = j;
				}
				sum += num;
			}
			
			if(isEqual) {
				System.out.println("no winner");
			} else {
				boolean isMajor = false;
				if(max / sum > 0.5f)
					isMajor = true;
				
				System.out.println((isMajor ? "majority" : "minority") + " winner " + (jMax + 1));
			}
		}
	}

}
