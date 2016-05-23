import java.util.Random;


public class Answers {
	
	static int random;
	
	public static boolean[] setFakeAnswers(boolean[] array){
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
		    array[i] = random.nextBoolean();
		}
		
		return array;		
	}
}
