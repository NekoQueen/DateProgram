
public class Matching {
	
	static double[] percentList = new double[PresetUsers.UsersList.size()];
	public static double matchMaking(boolean[] array){
		double yes = 0;
		double no = 0;
		
		for(int i = 0; i < array.length; i++){
			if(array[i] == PresetUserAnswers.userAnswers[i]){
				if(array[i] == false){
					no++;
				}else{
					yes++;
				}
			}
		}
//		
//		System.out.println((yes+no)/5);
		return (yes+no)/5;
	}
	
	public static double[] storePercentage(){
		
		percentList[0] = Matching.matchMaking(PresetUserAnswers.a1A);
		percentList[1] = Matching.matchMaking(PresetUserAnswers.a2A);
		percentList[2] = Matching.matchMaking(PresetUserAnswers.a3A);
		percentList[3] = Matching.matchMaking(PresetUserAnswers.a4A);
		return percentList;
	}
}
