package btchan8dev;

public class Variables {

	public static void main(String[] args) {
		//declare and assign variables
		String name = "Anthony";
		int age = 27;
		String year = "2020";
		double income = 99999.99;
		final double PI = 3.14159;	//constants indicated with 'final' keyword
		double bonus;	//unassigned variable is null by default
		boolean usc = true;
		
		System.out.println("***PERSON OF THE YEAR***");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.print("US Citizen: " + usc + "\n");
		System.out.printf("Year: %s%n", year);	//new line indicated by \n or %n
		System.out.printf("Income: %f%n", income);
		System.out.printf("Pi: %.2f%n", PI);
		
		income = 100000; //re-assigning variables
		bonus = 5000.50;
		double total = income + bonus;
		
		//keeping print statements on same line
		System.out.printf("New Income: $%.2f, Bonus: $%.2f%n", income, bonus);
		System.out.printf("New Income (w/ Bonus): $%.2f", total);
	}

}
