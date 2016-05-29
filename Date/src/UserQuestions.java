import java.util.Scanner;


public class UserQuestions {
	static Scanner sc = new Scanner(System.in);
	public static void userAnswer(){
		System.out.println("Enter Yes or No");
				
		String[] questions = {"Do you think smoking is good?",
								"Do you think dogs are better than cats?",
								"Do you like sports?",
								"Do you like music?",
								"Do you know how to play an instrument?"};
		
		for(int i = 0; i < questions.length; i++){
			System.out.println(questions[i]);
			String answer = sc.next();
			if(answer.equals("Yes")){
				PresetUserAnswers.userAnswers[i] = true;
			}else{
				PresetUserAnswers.userAnswers[i] = false;
			}
		}
	}
}
