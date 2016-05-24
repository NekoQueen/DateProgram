import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private boolean male;
	private int height;
	private double matchPercent;
	BufferedImage image;
	private ArrayList<String> favoriteThings = new ArrayList<String>();
	
	public Person(String firstName,String lastName, int age,int height, boolean male, double matchPercent){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.male = male;
		this.height = height;
		image = new BufferedImage(100, 200, BufferedImage.TYPE_INT_ARGB);
		favoriteThings = new ArrayList<String>();
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
	
	public int getHeight(){
		return height;
	}
	
	public void setHeight(int height){
		this.height = height;
	}

	public boolean isMale(){
		return male;
	}
	public void setGender(boolean male){
		this.male = male;
	}
	
	public double getMatchPercent(){
		return matchPercent = matchPercent;
	}
	public void setMatchPercent(double matchPercent){
		this.matchPercent = matchPercent;
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