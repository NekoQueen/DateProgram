import java.util.ArrayList;

public class Sort {
	
	public static ArrayList<User> selectAge(int age){
		ArrayList<User> users = new ArrayList<User>();
		for(int i = 0; i < PresetUsers.UsersList.size(); i++){
			if(PresetUsers.UsersList.get(i).getAge() == age ){
				users.add(PresetUsers.UsersList.get(i));
			}
		}
		for(int i = 0; i < users.size(); i++){
			System.out.println(users.get(i).getFirstName());
		}
		return users;
	}
	
	public static ArrayList<User> selectAgeRange(int ageMin, int ageMax){
		ArrayList<User> users = new ArrayList<User>();
		for(int i = 0; i < PresetUsers.UsersList.size(); i++){
			if(PresetUsers.UsersList.get(i).getAge() <= ageMax && PresetUsers.UsersList.get(i).getAge() >= ageMin){
				users.add(PresetUsers.UsersList.get(i));
			}
		}
		for(int i = 0; i < users.size(); i++){
			System.out.println(users.get(i).getFirstName());
		}
		return users;
	}
	
	public static ArrayList<User> selectGender(boolean gender){
		ArrayList<User> users = new ArrayList<User>();
		for(int i = 0; i < PresetUsers.UsersList.size(); i++){
			if(PresetUsers.UsersList.get(i).getGender() == gender ){
				users.add(PresetUsers.UsersList.get(i));
			}
		}
		for(int i = 0; i < users.size(); i++){
			System.out.println(users.get(i).getFirstName());
		}
		return users;	
	}
	
	public static ArrayList<User> showMatch(double percentage){
		ArrayList<User> users = new ArrayList<User>();
		for(int i = 0; i < PresetUsers.UsersList.size(); i++){
			if(PresetUsers.UsersList.get(i).getPercentage() >= percentage){
				users.add(PresetUsers.UsersList.get(i));
			}
		}
		for(int i = 0; i < users.size(); i++){
			System.out.println(users.get(i).getFirstName());
		}
		return users;	
	}
}
