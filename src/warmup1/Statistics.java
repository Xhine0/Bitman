package warmup1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		for(int a = 0; a < 10; a++) {
			if(!reader.hasNextInt())
				return;
			
			int n = reader.nextInt();
			int[] l = new int[n];
			for(int i = 0; i < n; i++) {
				l[i] = reader.nextInt();
			}
			Arrays.sort(l);
			
			int min = l[0];
			int max = l[l.length-1];
		
			System.out.println("Case " + (a+1) + ": " + min + " " + max + " " + (max - min));
			//System.out.println();
		}
		
		/*
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		*/
	}

}
