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
	public static boolean[] male1A = new boolean[5];
	public static boolean[] male2A = new boolean[5];
	public static boolean[] male3A = new boolean[5];
	public static boolean[] male4A = new boolean[5];
	public static boolean[] female1A = new boolean[5];
	public static boolean[] female2A = new boolean[5];
	public static boolean[] female3A = new boolean[5];
	public static boolean[] female4A = new boolean[5];
	
	ArrayList<String> numbers = new ArrayList<>(Arrays.asList(""));

	
	public static void main(String[] args) {
		
		
		Answers.setFakeAnswers(male1A);
		Answers.setFakeAnswers(male2A);
		Answers.setFakeAnswers(male3A);
		Answers.setFakeAnswers(male4A);
		Answers.setFakeAnswers(female1A);
		Answers.setFakeAnswers(female2A);
		Answers.setFakeAnswers(female3A);
		Answers.setFakeAnswers(female4A);
				
		Profile.createUser();
		
		Matching.matchMaking(male1A);
		Matching.matchMaking(male2A);
		Matching.matchMaking(male3A);
		Matching.matchMaking(male4A);
		Matching.matchMaking(female1A);
		Matching.matchMaking(female2A);
		Matching.matchMaking(female3A);
		Matching.matchMaking(female4A);
		
	}
	
	
	//testing

}