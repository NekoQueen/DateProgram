
public class Matching {
	public static double matchMaking(boolean[] array){
		double yes = 0;
		double no = 0;
		
		for(int i = 0; i < array.length; i++){
			if(array[i] == Main.userAnswers[i]){
				if(array[i] == false){
					no++;
				}else{
					yes++;
				}
			}
		}
		
		System.out.println((yes+no)/5);
		return (yes+no)/5;
		
		//use new classes to set percentage later
	}
}
