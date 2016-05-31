import java.util.ArrayList;

public class Sort {

	public int compareTo(User u1, User u2){

		return Integer.valueOf(u1.getAge()).compareTo(Integer.valueOf(u2.getAge()));

	}

	public static ArrayList<User> selectAge(){
		ArrayList<User> users = new ArrayList<User>();
		ArrayList<User> tmpUsers = PresetUsers.UsersList;
		for(int i = 0; i <= tmpUsers.size()*(i); i++){
			users.add(youngestUser(tmpUsers));
			tmpUsers.remove(youngestUser(tmpUsers));
		}
		for(int i = 0; i < users.size(); i++){
			System.out.println(users.get(i).getFirstName());
		}
		return users;

	}

	public static  User youngestUser(ArrayList<User> users){
		User tmp = users.get(0);
		for(int i = 1; i < users.size(); i++){
			if(users.size() == 1){
				return users.get(0);
			}
			if(users.get(i).getAge() < tmp.getAge()){
				tmp = users.get(i);
			}

		} return tmp;
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
