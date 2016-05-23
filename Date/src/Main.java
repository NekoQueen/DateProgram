import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//hi

public class Main{
	public static boolean[] userAnswers = new boolean[5];
	public static boolean[] male1 = new boolean[5];
	public static boolean[] male2 = new boolean[5];
	public static boolean[] male3 = new boolean[5];
	public static boolean[] male4 = new boolean[5];
	public static boolean[] female1 = new boolean[5];
	public static boolean[] female2 = new boolean[5];
	public static boolean[] female3 = new boolean[5];
	public static boolean[] female4 = new boolean[5];
	
	ArrayList<String> numbers = new ArrayList<>(Arrays.asList(""));

	
	public static void main(String[] args) {
		
		Answers.setFakeAnswers(male1);
		Answers.setFakeAnswers(male2);
		Answers.setFakeAnswers(male3);
		Answers.setFakeAnswers(male4);
		Answers.setFakeAnswers(female1);
		Answers.setFakeAnswers(female2);
		Answers.setFakeAnswers(female3);
		Answers.setFakeAnswers(female4);
			
		
		Profile.createUser();
	}
	
	
	//testing

}