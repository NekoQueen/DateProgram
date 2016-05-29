public class User {
	private int age;
	private String firstName;
	private String lastName;
	private boolean gender;
	double matchPercentage;
	private String city;
	
	public User(String firstName, String lastName, int age, boolean gender, double matchPercentage, String city){
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.matchPercentage = matchPercentage;
		this.city = city;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public boolean getGender(){
		return gender;
	}
	
	public double getPercentage(){
		return matchPercentage;
	}
	
	public String getCity(){
		return city;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public void setMatchPercentage(double matchPercentage) {
		this.matchPercentage = matchPercentage;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
