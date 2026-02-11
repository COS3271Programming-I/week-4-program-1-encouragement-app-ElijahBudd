package Programs;

import java.util.Scanner;

public class Encouragement_APP {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("How old are you? ");
		Integer age = userinput.nextInt();
		userinput.nextLine();
		System.out.print("How are you doing today? ");
		String mood = userinput.nextLine().toLowerCase();
		
		if (age < 13 && mood.contains("good")) {
			System.out.println("Great! You are young, have fun and make memories.");
		}
		else if (age < 13 && mood.contains("bad")) {
			System.out.println("Sorry to hear that, maybe tomorrow will be better.");
		}
		else if (age >= 13 && age <= 18 && mood.contains("good")) {
			System.out.println("Great! This is the start of your future, chase your dreams.");
		}
		else if (age >= 13 && age <= 18 && mood.contains("bad")) {
			System.out.println("I'm sorry, I hope you have a good rest of your day.");
		}
		else if (age > 18 && mood.contains("good")) {
			System.out.println("Awesome! Make sure to keep a good balance in life.");
		}
		else if (age > 18 && mood.contains("bad")) {
			System.out.println("Sorry about that, maybe try something that you used to like to cheer yourself up.");
		}
		else {
			System.out.println("Always remember to never take the things in life for granted.");
		}
	}
}
