public interface PeopleInterface {
 public int getAge();
 
 public String getFirstName();
 
 public String getLastName();
 
 public boolean getGender();
 public double getPercentage();
 
 public String getCity();

 public void setAge(int age) ;

 public void setFirstName(String firstName) ;

 public void setLastName(String lastName) ;

 public void setGender(boolean gender) ;

 public void setMatchPercentage(double matchPercentage);

 public void setCity(String city) ;
 
 public int compareTo(User users) ;
}