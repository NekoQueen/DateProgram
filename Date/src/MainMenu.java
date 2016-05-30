import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class MainMenu extends Screen {
	
	public MainMenu(Game game) {
		super(game);
	}

	public KeyListener getKeyListener() {
		return null;
	}

	public void paintScreen(Graphics2D g2) {
		 int y = 100;
		g2.setColor(Color.blue);
		g2.fillRect(0,0,width,height);
		g2.setColor(Color.white);
		ArrayList<User> people = Sort.selectAge(27);
		for(int i = 0; i < people.size(); i++){
			UtilityMethods.centerTextAtY(g2,people.get(i).getFirstName(), 600, y);
			y += 100;
		}
	}

}
