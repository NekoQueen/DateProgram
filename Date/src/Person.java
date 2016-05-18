import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.Scanner;

public class Profile{
	
	static Scanner input = new Scanner(System.in);
	ProfileWindow pw;
	
	public static void createUser(){
		
		Person male1 = new Person("Bob", "Tree", 43, 160, true);
		Person male2 = new Person("Blob", "Shrub", 43, 160, true);
		
		Person male3 = new Person("Boop", "Leaf", 43, 160, true);
		Person male4 = new Person("Boot", "Sprout", 43, 160, true);
		
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
		pw.addPerson(male1);
		pw.addPerson(male2);
		pw.addPerson(male3);
		pw.addPerson(male4);
		
		
		pw.setVisible(true);
		
	}
	
	public void keyPressed(KeyEvent e) {
	    if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
	  
	    }
	}
		
	}
