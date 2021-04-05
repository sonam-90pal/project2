package EmailAdministrationApplication;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String  lastName;
	private String email;
	private String password;
	private String department;
	private String alternateEmail;
	private int mailboxCapacity;
	private int defaultPasswordLength = 8;
	
	public Email(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println(this.firstName + " " + this.lastName);
		this.department = setDepartment();
		System.out.println("Department : "+ this.department);	
		email = firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department.toLowerCase() +".hirepro.com";
		System.out.println("Your Email : "+email);
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Account Password : "+ this.password);
		System.out.println("Your Alternate Email : " + firstName.toLowerCase()  + this.lastName.toLowerCase() + "@hirepro.com");
		System.out.println("Your Alternate Password : " + firstName.toLowerCase() + "@" + this.department.toLowerCase() );
		
		
		
	}
	
	private String setDepartment()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose the Department\n1 for Sales\n2 for Development\n3 for Marketing\n4 for Other ");
		int dept = scan.nextInt();
		if(dept == 1)
		{
			return "Sales";
		}
		else if(dept == 2)
		{
			return "Development";
		}
		else if(dept == 3)
		{
			return "Marketing";
		}
		else
		{
			return "None";
		}
		
	}
	
	private String randomPassword(int length)
	{
		String chr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@*!&$";
		char[] password = new char[length];
		for(int i=0; i<length; i++)
		{
			int random = (int)(Math.random()*chr.length());
			password[i] = chr.charAt(random);
		}
		
		return new String(password);
	}
	
	public void setMailboxCapacity(int capacity)
	{
		
		this.mailboxCapacity = capacity;
	}
	
	public void setAlternateEmail(String aemail)
	{
		this.alternateEmail = aemail;
	}
	
	public void changePassword(String cpassword)
	{
		this.password = cpassword;
	}
	
	public int getMailBoxCapacity()
	{
		return mailboxCapacity;
	}
	
	public String getAlternateEmail()
	{
		return alternateEmail;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	

}
