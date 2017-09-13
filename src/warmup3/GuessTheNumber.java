package warmup3;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int min = 1;
		int max = 1000;
		int guess = (int)Math.round(Math.random() * (max-min) + min);
		if(guess < min) { guess = min; }
		if(guess > max) { guess = max; }
		
		for(int i = 0; i < 10; i++) {
			System.out.println(guess);
			String str = reader.next();
			
			if(str.equals("correct")) {
				return;
			} else if(str.equals("lower")) {
				if(guess > 2)
					max = guess;
				else {
					guess = 1;
				}
			} else if(str.equals("higher")) {
				min = guess;
			}
			
			if(guess > 1 && guess < 1000)
				guess = (int)Math.round((max + min)/2.0);
		}
	}

}
