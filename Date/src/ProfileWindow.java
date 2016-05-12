import java.awt.Graphics;

import javax.swing.JFrame;

public class ProfileWindow extends JFrame {
	
	Person person;
	
	public ProfileWindow(Person person){
		this.person = person;
		setSize(800,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200,200);
	}
	
	public void paint(Graphics g){
		g.drawImage(person.getImage(), 50,50, null);
	}
	
}
