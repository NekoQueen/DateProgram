import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Sort3 extends Screen implements KeyListener{
	
	public Sort3(Game game) {
		super(game);
	}

	public KeyListener getKeyListener() {
		return this;
	}

	public void paintScreen(Graphics2D g2) {
		 int y = 100;
		g2.setColor(Color.blue);
		g2.fillRect(0,0,width,height);
		g2.setColor(Color.white);
//		ArrayList<User> people = //use sort method
//		for(int i = 0; i < people.size(); i++){
//			UtilityMethods.centerTextAtY(g2,people.get(i).getFirstName(), 600, y);
//			y += 100;
//		}
	}

	@Override
	public void keyPressed(KeyEvent k) {

		if(k.getKeyCode() == KeyEvent.VK_BACK_SPACE){
			Screen startScreen = new StartScreen(game);
			game.setScreen(startScreen);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}