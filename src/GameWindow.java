import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class GameWindow extends GamePanel implements KeyListener, MouseListener, MouseMotionListener{
	GamePanel panel;
	JPanel panel2 = new JPanel();
	JTextField answer = new JTextField();
	GameWindow() {
		JFrame window = new JFrame();
		panel=new GamePanel();
		window.setLayout(new BorderLayout());
		panel2.setBorder(new BevelBorder(BevelBorder.LOWERED));
		window.add(panel2, BorderLayout.SOUTH);
		panel2.setPreferredSize(new Dimension(window.getWidth(),30));
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
		answer.setHorizontalAlignment(SwingConstants.LEFT);
		answer.addKeyListener(this);
		panel2.add(answer);
		window.setVisible(true);
		window.setSize(500,500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		window.addKeyListener(this);
		window.addMouseListener(this);
		window.addMouseMotionListener(this);
	}
	public static void main (String [] args) {
		new GameWindow();
		System.out.println("game window");
	}
	
	/*public boolean checkAnswer (String userAnswer, String actualAnswer) {
		while (object1.x<500) {
			System.out.println("less than 500");
		}
		return true;
	}*/
	
	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseDragged");
		InputManager.mouseDragged(e);
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseMoved");
		InputManager.mouseMoved(e);
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseClicked");
		InputManager.mouseClicked(e);
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mousePressed");
		InputManager.mousePressed(e);
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseReleased");
		InputManager.mouseReleased(e);
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseEntered");
		InputManager.mouseEntered(e);
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseExcited");
		InputManager.mouseExited(e);
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyTyped");
		InputManager.keyTyped(e);
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyPressed");
		InputManager.keyPressed(e);
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyReleased");
		InputManager.keyReleased(e);
		
	}
}