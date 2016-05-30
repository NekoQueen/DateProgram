
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
		g2.setColor(Color.white);
		g2.fillRect(0, 0, width, height);
		g2.setColor(Color.black);
		UtilityMethods.centerTextAtY(g2, DateDemo.user.getFirstName(), 100, 100);
		UtilityMethods.centerTextAtY(g2, DateDemo.user.getLastName(), 100, 200);
		UtilityMethods.centerTextAtY(g2, String.valueOf((DateDemo.user.getAge())), 100,300);
		UtilityMethods.centerTextAtY(g2, String.valueOf(DateDemo.user.getGender()), 100, 400);
		UtilityMethods.centerTextAtY(g2, DateDemo.user.getCity(), 100, 500);

		for(int i = 0; i < PresetUsers.UsersList.size(); i++){
			UtilityMethods.centerTextAtY(g2,PresetUsers.UsersList.get(i).getFirstName(), 600, y);
			UtilityMethods.centerTextAtY(g2,String.valueOf(PresetUsers.UsersList.get(i).getMatchPercentage()), 650, y);
			y+=100;
		}
	}

	public void keyPressed(KeyEvent k) {
		if(k.getKeyCode() == KeyEvent.VK_SPACE){
			Screen mainMenu = new MainMenu(game);
			game.setScreen(mainMenu);
		}
	}

	public void keyReleased(KeyEvent arg0) {

	}

	public void keyTyped(KeyEvent arg0) {
	}








}
