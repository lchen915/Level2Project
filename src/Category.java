import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Category {
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
	}
	
	
	
}
