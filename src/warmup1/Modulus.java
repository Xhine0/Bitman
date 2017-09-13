package warmup1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int count = 0;
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			int num = reader.nextInt();
			int m = num % 42;
			
			if(!list.contains(m))
				list.add(m);
		}
		
		System.out.println(list.size());
	}

}
