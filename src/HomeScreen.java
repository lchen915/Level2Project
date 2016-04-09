import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HomeScreen implements ActionListener {
	JButton startButton = new JButton("START");
	JFrame window = new JFrame();
	
	HomeScreen() {
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pan = new JPanel();
		pan.add(startButton);
		window.add(pan);
		pan.setLayout(null);
		window.setSize(600, 600);
		startButton.setBounds(200,100,200,50);
		startButton.addActionListener(this);
	}
	
	public static void main (String [] args) {
		new HomeScreen();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton)e.getSource();
		if (clicked == startButton) {
			new Category();
			window.setVisible(false);
		}
	}
	
	
}
