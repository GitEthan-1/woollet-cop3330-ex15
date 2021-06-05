package ex15.base;

import java.util.Scanner;

/**
 * Exercise 15 - Password Validation
 * Passwords are validated by comparing a user-provided value with a known value that’s stored. Either it’s correct or it’s not.
 *
 * Create a simple program that validates user login credentials. The program must prompt the user for a username and password.
 * The program should compare the password given by the user to a known password.
 * If the password matches, the program should display “Welcome!” If it doesn’t match, the program should display “I don’t know you.”
 *
 * Example Output
 *
 * What is the password? 12345
 * I don't know you.
 *
 * Or
 *
 * What is the password? abc$123
 * Welcome!
 *
 * Constraints
 *
 * Use an if/else statement for this problem.
 * Make sure the program is case sensitive.
 *
 * Challenges
 *
 * Investigate how you can prevent the password from being displayed on the screen in clear text when typed.
 * Create a map of usernames and passwords and ensure the username and password combinations match.
 * Encode the passwords using Bcrypt and store the hashes in the map instead of the clear-text passwords.
 * Then, when you prompt for the password, encrypt the password using Bcrypt and compare it with the value in your map.
 */

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final String PASSWORD = "abc$123";
		
		System.out.print("What is the password? ");
		String inputPassword = in.nextLine();
		
		if(inputPassword.contentEquals(PASSWORD))
		{
			System.out.println("Welcome!");
		}
		else
		{
			System.out.println("I don't know you.");
		}
	}
}
