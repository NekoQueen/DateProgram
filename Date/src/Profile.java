import java.awt.image.BufferedImage;
import java.util.Scanner;

public class Profile extends Main{
	
	static Scanner input = new Scanner(System.in);
	
	
	public static void createUser(){
		Person user = new Person("","", 0, 0, true);
		System.out.println("Enter First Name");
		String fName = input.next();
		user.setFirstName(fName);
		System.out.println("Enter Last Name");
		String lName = input.next();
		user.setLastName(lName);
		System.out.println("Enter Age");
		int age = input.nextInt();
		user.setAge(age);
		System.out.println("Enter Gender");
		String gender = input.next();
		if(!gender.equals("male")){
			user.setGender(false);
		}
		
		ProfileWindow pw = new ProfileWindow(user);
		pw.setVisible(true);
	}
}
