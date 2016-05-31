
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class StartScreen extends Screen implements KeyListener{

	public StartScreen(Game game) {
		super(game);
	}

	public KeyListener getKeyListener() {
		return this;
	}

	public void paintScreen(Graphics2D g2) {
		int y = 100;
		g2.setColor(Color.PINK);
		g2.fillRect(0, 0, width, height);
		g2.setColor(Color.black);
		UtilityMethods.centerTextAtY(g2, "User Information", 200, 50);
		UtilityMethods.centerTextAtY(g2, "First Name:"+DateDemo.user.getFirstName(), 200, 100);
		UtilityMethods.centerTextAtY(g2, "Last Name:"+DateDemo.user.getLastName(), 200, 200);
		UtilityMethods.centerTextAtY(g2, "Age:"+String.valueOf((DateDemo.user.getAge())), 200,300);
		UtilityMethods.centerTextAtY(g2, "Gender"+String.valueOf(DateDemo.user.getGender()), 200, 400);
		UtilityMethods.centerTextAtY(g2, "City:" + DateDemo.user.getCity(), 200, 500);
		UtilityMethods.centerTextAtY(g2, "Other Users", 600, 50);
		UtilityMethods.centerTextAtY(g2, "Match Percentage", 900, 50);
		for(int i = 0; i < PresetUsers.UsersList.size(); i++){
			UtilityMethods.centerTextAtY(g2,PresetUsers.UsersList.get(i).getFirstName(), 600, y);
			UtilityMethods.centerTextAtY(g2,String.valueOf(PresetUsers.UsersList.get(i).getMatchPercentage()), 900, y);
			y+=100;
		}
	}

	public void keyPressed(KeyEvent k) {
		if(k.getKeyCode() == KeyEvent.VK_1){
			Screen sort1 = new Sort1(game);
			game.setScreen(sort1);
			Sort.selectAge();
		}
	}

	public void keyReleased(KeyEvent arg0) {

	}

	public void keyTyped(KeyEvent arg0) {
	}








}
