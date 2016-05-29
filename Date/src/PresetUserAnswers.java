
public class PresetUserAnswers {
	public static boolean[] userAnswers = new boolean[5];
	public static boolean[] a1A = new boolean[5];
	public static boolean[] a2A = new boolean[5];
	public static boolean[] a3A = new boolean[5];
	public static boolean[] a4A = new boolean[5];
	
	public static void setAnswers(){
		Answers.setFakeAnswers(a1A);
		Answers.setFakeAnswers(a2A);
		Answers.setFakeAnswers(a3A);
		Answers.setFakeAnswers(a4A);
		
		Matching.matchMaking(a1A);
		Matching.matchMaking(a2A);
		Matching.matchMaking(a3A);
		Matching.matchMaking(a4A);
	}
	
	
		

	
}
