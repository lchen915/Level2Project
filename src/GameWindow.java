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

public class GameWindow implements KeyListener{
	GamePanel gamePanel;
	JPanel panel2 = new JPanel();
	JTextField answer = new JTextField();
	GameWindow() {
		JFrame window = new JFrame();
		gamePanel=new GamePanel();
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
		window.add(gamePanel);
		window.addKeyListener(this);
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("keyTyped");
		InputManager.keyTyped(e);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("keyPressed");
		InputManager.keyPressed(e);
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			System.out.println(answer.getText());
			System.out.println(gamePanel.checkAnswer1(answer.getText()) || gamePanel.checkAnswer2(answer.getText()));
			answer.setText("");
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("keyReleased");
		InputManager.keyReleased(e);
		
	}

}