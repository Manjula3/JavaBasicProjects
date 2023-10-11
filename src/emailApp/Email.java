package emailApp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordlength=10;
	private String alternateEmail;
	private String companySuffix="acc.com";
	
	//constructor to receive first and lastname
	public Email(String firstName, String lastName)
	{
		this.firstName= firstName;
		this.lastName= lastName;
		System.out.println("EMAIL CREATED: "+this.firstName +this.lastName);
		
		//call method to ask dept and return it
		this.department=setDepartment();
		//System.out.println("Department selected :" +this.department);
	    //method for random password
		this.password=randomPassword(defaultPasswordlength);
		//System.out.println("Your Password is : " +this.password);
		
		//generate email
		this.email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+"."+companySuffix;
	    //System.out.println("email generated for you :"+email);
	}
	//Ask for department
	private String setDepartment() {
		System.out.println("Enter the Department: \n 1)sales \n 2)Accounting  \n 3)Auditing");
		Scanner in = new Scanner(System.in);
		int depChoice =in.nextInt();
		if(depChoice ==1)return "sales";
		else if (depChoice ==2)return "Accounting";
		else if (depChoice ==3)return "Auditing";
		else return "" ;
	}
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQURSTVWXYZ0123456789!@#$%&";
		char[] password=new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int)(Math.random() *passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set the mailbox capacity
	public void setMailboxCapacity(int Capacity) {
		this.mailboxCapacity=Capacity;
	}
	//Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	//change the password
	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	public String setAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	public String showInfo() {
		return "DISPLAY NAME: " +firstName +" "+lastName+ "\n"+
				"COMPANY EMAIL: "+email +"\n"+
				"MAILBOX CAPACITY: "+ mailboxCapacity +"mb";
		
		
	}
}
