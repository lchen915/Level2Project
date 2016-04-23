import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class InputManager {
	public static boolean LEFT_ARROW_KEY = false;
	public static boolean RIGHT_ARROW_KEY=false;
	public static boolean UP_ARROW_KEY=false;
	public static boolean DOWN_ARROW_KEY=false;
	public static boolean SPACEBAR=false;
	public static int xOfMouse;
	public static int yOfMouse;
	public static boolean MOUSE = false;
	public static void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseDragged");
		
	}
	public static void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseMoved");
		xOfMouse = e.getX();
		yOfMouse = e.getY();
	}
	public static void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseClicked");
		xOfMouse = e.getX();
		yOfMouse = e.getY();
	}
	public static void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mousePressed");
		MOUSE = true;
	}
	
	public static void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseReleased");
		MOUSE = false;
	}
	
	public static void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseEntered");
		
	}
	public static void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseExcited");
		
	}
	public static void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyTyped");
		
	}
	public static void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyPressed");
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
	}
	public static void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyReleased");
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
	}
}