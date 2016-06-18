import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class InputManager {
	public static boolean LEFT_ARROW_KEY = false;
	public static boolean RIGHT_ARROW_KEY=false;
	public static boolean UP_ARROW_KEY=false;
	public static boolean DOWN_ARROW_KEY=false;
	public static boolean SPACEBAR=false;
	public static boolean ENTER=false;
	public static int xOfMouse;
	public static int yOfMouse;

	public static void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("keyTyped");
		
	}
	public static void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("keyPressed");
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			LEFT_ARROW_KEY = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			RIGHT_ARROW_KEY = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			UP_ARROW_KEY = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			DOWN_ARROW_KEY = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			SPACEBAR = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			ENTER = true;
		}
	}
	public static void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("keyReleased");
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			LEFT_ARROW_KEY = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			RIGHT_ARROW_KEY = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			UP_ARROW_KEY = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			DOWN_ARROW_KEY = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			SPACEBAR = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			ENTER = false;
		}
	}
}