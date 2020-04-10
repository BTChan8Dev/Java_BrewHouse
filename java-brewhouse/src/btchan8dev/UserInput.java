package btchan8dev;

import java.util.Scanner;	//import Scanner class

public class UserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	//create Scanner object
		
		System.out.println("Enter your username: ");
		String username = input.nextLine();	//read user input
		System.out.println("Enter your password: ");
		String password = input.nextLine();
		System.out.println("Enter your favorite number: ");
		int num = input.nextInt();
		System.out.println("Enter the price you're willing to pay for a real Java course: ");
		double price = input.nextDouble();
		
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		System.out.println(username + "'s favorite number: " + num);
		System.out.println(username + "'s price: $" + price);
	}

}
