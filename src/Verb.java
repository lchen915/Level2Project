import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Verb implements ActionListener {
	JLabel title = new JLabel ("<html>Conjugation for -ER Verbs in Present Tense");
	JLabel instructions = new JLabel ("Instructions: Drop the -er to get the stem. Add these endings to the stem: ");
	JLabel pronouns = new JLabel ("<html>Pronouns<br>Je<br>Tu<br>Il/Elle/On<br>Nous<br>Vous<br>Ils/Elles</html>");
	JLabel conjugations = new JLabel ("<html>Endings<br>-e<br>-es<br>-e<br>-ons<br>-ez<br>-ent</html>");
	JLabel parlerConj = new JLabel ("<html>Example: Parler<br>parle<br>parles<br>parle<br>parlons<br>parlez<br>parlent</html>");
	JLabel memorize = new JLabel ("Memorize the endings. Click 'Start Game' when you are ready to play.");
	JButton startGame = new JButton ("Start Game");
	JFrame window3 = new JFrame();
	Verb() {
		window3.setVisible(true);
		window3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pan = new JPanel();
		pan.add(title);
		pan.add(instructions);
		pan.add(pronouns);
		pan.add(conjugations);
		pan.add(parlerConj);
		pan.add(startGame);
		pan.add(memorize);
		window3.add(pan);
		pan.setLayout(null);
		window3.setSize(600,600);
		title.setBounds(30,20,600,20);
		instructions.setBounds(30, 40, 600, 20);
		pronouns.setBounds(30, 90, 100, 120);
		conjugations.setBounds(130, 90, 100, 120);
		parlerConj.setBounds(230, 90, 100, 120);
		startGame.setBounds(30, 300, 100, 50);
		memorize.setBounds(30, 220, 600, 20);
		startGame.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton)e.getSource();
		if (clicked == startGame) {
			new GameWindow();
			System.out.print("startgame");
			window3.setVisible(false);
		}
	}
}
