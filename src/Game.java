import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game {
	JFrame window4 = new JFrame();
	JButton test = new JButton("test");
	Game () {
		window4.setVisible(true);
		window4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pan = new JPanel();
		pan.add(test);
		window4.add(pan);
		window4.setSize(600, 600);
		test.setBounds(100,100,100,100);
	}
}
