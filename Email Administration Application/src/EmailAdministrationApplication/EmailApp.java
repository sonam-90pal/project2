package EmailAdministrationApplication;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome To HirePro");
		System.out.println("Enter your First Name");
		String firstname = scan.nextLine();
		System.out.println("Enter your Last Name");
		String lastname = scan.nextLine();
		
		
		Email e = new Email(firstname, lastname);

	}

}
