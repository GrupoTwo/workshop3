package labcodeinspection;

import java.util.Locale;

/**
* @author Group 2
*/
public class Email {

	private String m_firstName;//NOPMD This field will be manipulated later
	/**
	* @author Group 2
	*/
	private transient final String m_lastName;
	/**
	* @author Group 2
	*/
	private transient  String password;
	/**
	* @author Group 2
	*/
	private transient  String department;
	/**
	* @author Group 2
	*/
	private transient final int defaultpasswordLength;
	/**
	* @author Group 2
	*/
	private transient  String email;
	/**
	* @author Group 2
	*/
	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
		defaultpasswordLength = 8;
	}
	/**
	*
	*
	* @author Group 2
	*/
	public void showInfo() {

		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}
		
	/**
	*
	*
	* @author Group 2
	*/		
	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			System.out.println("choose an valid option");
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	/**
	*
	*
	* @author Group 2
	*/
	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.email = this.m_firstName.toLowerCase(Locale.US) + this.m_lastName.toLowerCase(Locale.US) + "@" + this.department
				+ ".espol.edu.ec";
	}
}
