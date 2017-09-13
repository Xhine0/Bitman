package warmup3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class Brexit {
	static HashMap<Integer, List<Integer>> data = new HashMap<>();
	static boolean hasLeft = false;
	static int xCountry;
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int c = reader.nextInt();
		int p = reader.nextInt();
		xCountry = reader.nextInt();
		int l = reader.nextInt();
		
		if(l == xCountry) {
			System.out.println("leave");
			return;
		}
		
		for(int i = 0; i < c; i++) {
			data.put(i+1, new ArrayList<Integer>());
		}
		
		for(int i = 0; i < p; i++) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			
			addCountry(a, b);
			addCountry(b, a);
		}
		
		for(int i = 0; i < data.size(); i++) {
			List<Integer> list = data.get(i+1);
			int n = list.size();
			list.add(0, n);
		}
		
		leave(l);
		while(hasLeft) {
			hasLeft = false;
			for(int i = 0; i < data.size(); i++) {
				List<Integer> list = data.get(i+1);
				int n = list.size();
				if(n-1 < list.get(0)/2.0f) {
					leave(i+1);
					break;
				}
			}
		}
		System.out.println("stay");
	}
	
	public static void leave(int c) {
		for(int i = 0; i < data.size(); i++) {
			data.get(i+1).remove(c);
		}
		data.remove(c);
		
		if(c == xCountry) {
			System.out.println("leave");
			return;
		}
		hasLeft = true;
	}
	
	public static void addCountry(int c, int x) {
		List<Integer> list = data.get(c);
		list.add(x);
		data.put(c, list);
	}
}
