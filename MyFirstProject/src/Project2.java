import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "water";
		String y = "Koola-Aid";
		String temp;

		temp = x;
		x = y;
		y = temp;

		System.out.println("x");

		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.nextLine();

		System.out.println("Hello " + name);
		System.out.println("How old are you?");
		float age = scanner.nextFloat();
		System.out.println("Your age is " + age);
		scanner.nextLine();
		System.out.println("What is your favorite food?");
		String food = scanner.nextLine();
		System.out.println("Your favorite food is " + food);

		/*
		 * Left off in video at 44:55 Java Full Course Free author: Bro Code
		 * 
		 */
	}
}
