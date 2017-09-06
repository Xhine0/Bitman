import java.util.Scanner;

public class QuickBrownFox {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		String[] msg = new String[n];
		
		reader.nextLine();
		for(int i = 0; i < n; i++) {
			boolean[] a = new boolean[26];
			
			String str = reader.nextLine().toLowerCase();
			for(int j = 0; j < str.length(); j++) {
				int index = (int)str.charAt(j) - 97;
				
				if(index >= 0 && index < a.length) {
					a[index] = true;
				}
			}
			
			String m = "";
			for(int k = 0; k < a.length; k++) {
				if(!a[k]) { m += (char)(k+97); }
			}
			
			msg[i] = m.equals("") ? "pangram" : "missing " + m;
		}
		
		for(String s : msg)
			System.out.println(s);
	}

}
