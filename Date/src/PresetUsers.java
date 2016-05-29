import java.util.ArrayList;
import java.util.Arrays;

public class PresetUsers {
	static boolean MALE = true;
	static boolean FEMALE = false;
	
	static User a1 = new User("Bob","K",19, MALE, 56, "Brooklyn");
	static User a2 = new User("Jane","M",27, FEMALE, 74, "Queens" );
	static User a3 = new User("Johnny","G",27, MALE, 54, "Brooklyn");
	static User a4 = new User("Christy","O", 26, FEMALE, 100, "Bronx");
	
	static ArrayList<User> UsersList = new ArrayList<>(Arrays.asList(a1,a2,a3,a4));
	
}
