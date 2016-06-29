import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Category implements ActionListener {
	JButton erVerb = new JButton ("-ER VERBS");
	JButton irVerb = new JButton ("-IR VERBS");
	JButton reVerb = new JButton ("-RE VERBS");
	JButton irregularVerbs = new JButton ("IRREGULAR VERBS");
	JFrame window2 = new JFrame();
	
	Category() {
		window2.setVisible(true);
		window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pan = new JPanel();
		pan.add(erVerb);
		pan.add(irVerb);
		pan.add(reVerb);
		pan.add(irregularVerbs);
		window2.add(pan);
		pan.setLayout(null);
		window2.setSize(600,600);
		erVerb.setBounds(0,0,600,140);
		irVerb.setBounds(0,140,600,140);
		reVerb.setBounds(0,280,600,140);
		irregularVerbs.setBounds(0,420,600,140);
		erVerb.addActionListener(this);
		irVerb.addActionListener(this);
		reVerb.addActionListener(this);
		irregularVerbs.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton)e.getSource();
		if (clicked == erVerb) {
			new ErVerb();
			window2.setVisible(false);
		}
	}
	
	
}
