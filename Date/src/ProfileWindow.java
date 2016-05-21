import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class ProfileWindow extends JFrame implements MouseListener{
	
	public static ArrayList<Person> persons;
	String s;
	
	public ProfileWindow(Person person){
		this.persons = new ArrayList<Person>();
		s="";
		persons.add(person);
		setSize(1800,1200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200,200);
		addMouseListener(this);
	}
	
	public void addPerson(Person p){
		persons.add(p);
	}
	
	public void paint(Graphics g){
		g.setColor(Color.white);
		g.fillRect(0, 0, 800, 500);
		g.setColor(Color.black);
		g.drawString(s, 280, 50);
		int y= 50;
		for(int i = 0; i < persons.size(); i++){
			g.drawImage(persons.get(i).getImage(), 50,y, null);
			y+=75;
		}
	}

	public void mouseClicked(MouseEvent m) {
		s="You clicked "+m.getX()+", "+m.getY();
		repaint();
		
		
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}