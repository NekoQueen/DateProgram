import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private boolean male;
	BufferedImage image;
	
	public Person(String firstName,String lastName, int age, boolean male){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.male = male;
		image = new BufferedImage(100, 200, BufferedImage.TYPE_INT_ARGB);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale(){
		return male;
	}
	public void setGender(boolean male){
		this.male = male;
	}

	public Image getImage() {
		//don't change the following line
		Graphics2D g2 = (Graphics2D)image.getGraphics();
		g2.setColor(Color.BLACK);
		g2.drawString(firstName,0,20);
		g2.drawString(lastName,0,40);
		return image;
	}
	
	

}


