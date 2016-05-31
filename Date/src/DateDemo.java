import java.util.ArrayList;
import java.util.Scanner;


public class DateDemo extends Game{
	
	 static Scanner input = new Scanner(System.in);
	 static User user = new User();
	 static ArrayList<User> highUsers = new ArrayList<>();
	 
	
	public static void main(String[] args){
		System.out.println("first name");
		user.setFirstName(input.next());
		System.out.println("last name");
		user.setLastName(input.next());
		System.out.println("age");
		user.setAge(input.nextInt());
		System.out.println("gender");
		user.setGender(input.nextBoolean());
		System.out.println("city");
		user.setCity(input.next());

		UserQuestions.userAnswer();

		PresetUserAnswers.setAnswers();

		PresetUsers.generatePercentage();
		
		

		new DateDemo();


	}
	
	public void reset(){
		Screen demoScreen = new DateScreen(this);
		setScreen(demoScreen);
	}
}
