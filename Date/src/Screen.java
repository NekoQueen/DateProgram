import java.awt.Graphics;

import java.util.Scanner;

import javax.swing.JFrame;

public class Screen extends JFrame{
	
	static Scanner input = new Scanner(System.in);
	static User user = new User();
	
	public static void main(String[] args){
		
		System.out.println("first name");
		user.setFirstName(input.next());
		System.out.println("last name");
		user.setLastName(input.next());
		System.out.println("age");
		user.setAge(input.nextInt());
		System.out.println("gender");
		user.setGender(input.nextBoolean());
		System.out.println("city");
		user.setCity(input.next());
		
		new Screen();
	}
	
	public Screen(){
		setSize(800,600);
		setVisible(true);
	}
	
	public void paint(Graphics g){
//		int x = 100;
		int y = 100;
//		int n = Sort.selectAge(27).size();
//		for(int i = 0; i < n; i++){
//			g.drawString(Sort.selectAge(27).get(i).getFirstName(), x, y);
//			y+=100;
//		}
		g.drawString(user.getFirstName(), 100, 100);
		g.drawString(user.getLastName(), 100, 200);
		g.drawString(String.valueOf((user.getAge())), 100,300);
		g.drawString(String.valueOf(user.getGender()), 100, 400);
		g.drawString(user.getCity(), 100, 500);
		
		for(int i = 0; i < PresetUsers.UsersList.size(); i++){
			g.drawString(PresetUsers.UsersList.get(i).getFirstName(), 200, y);
			y+=100;
		}
	}
	  
	 
}
