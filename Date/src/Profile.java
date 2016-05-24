import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.Scanner;

public class Profile{
	
	static Scanner input = new Scanner(System.in);
	ProfileWindow pw;
	
	public static void createUser(){
		
		Person male1 = new Person("Bob", "Tree", 43, 160, true, 0);
		Person male2 = new Person("Blob", "Shrub", 19, 160, true, 0);		
		Person male3 = new Person("Boop", "Leaf", 27, 160, true, 0);
		Person male4 = new Person("Boot", "Sprout", 39, 160, true, 0);
		
		Person female1 = new Person("A", "D", 34, 152, false,0);
		Person female2 = new Person("B", "C", 25, 145, false,0);		
		Person female3 = new Person("C", "B", 27, 157, false,0);
		Person female4 = new Person("D", "A", 36, 153, false,0);
		
		
		Person user = new Person("","", 0, 0, true, 0);
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
		
		UserQuestions.userAnswer();
		
		
		ProfileWindow pw = new ProfileWindow(user);
		pw.addPerson(male1);
		pw.addPerson(male2);
		pw.addPerson(male3);
		pw.addPerson(male4);
		pw.addPerson(female1);
		pw.addPerson(female2);
		pw.addPerson(female3);
		pw.addPerson(female4);
		
		pw.setVisible(true);
		
	}
	
	public void keyPressed(KeyEvent e) {
	    if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
	  
	    }
	}
		
	}