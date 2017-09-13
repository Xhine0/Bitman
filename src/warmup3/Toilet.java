package warmup3;

import java.util.Scanner;

public class Toilet {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String str = reader.next();
		reader.close();
		
		for(int p = 0; p < 3; p++) {
			int count = 0;
			char init = str.charAt(0);
			for(int i = 1; i < str.length(); i++) {
				char c = str.charAt(i);
				
				if(c != init) {
					count++;
					init = c;
				}
				if(p != 2)
					if(p == 0 && c != 'U') {
						count++;
						init = 'U';
					} else if(p ==1 && c != 'D') {
						count++;
						init = 'D';
					}
			}
			System.out.println(count);
		}
	}

}
