import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JOptionPane;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	Random random = new Random();
	int randomPronoun;
	final String [] pronouns = {"je ______________ ", "tu ______________ ", "il/elle/on ________ ", 
			"nous ____________ ", "vous ___________ ", "ils/elles  ________ "};
	int randomVerb;
	final String [] verbs  = {"accepter", "adorer", "aimer", "annuler", "apporter",
			"attraper", "bavarder", "casser", "chanter", "chercher"};
	String pronoun1;
	String verb1;
	boolean show = true;
	GameObject(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		randomVerb = random.nextInt(10);
		randomPronoun = random.nextInt(6);
		verb1 = "(" + verbs[randomVerb] + ")";
		pronoun1 = pronouns[randomPronoun];
		if (pronoun1.equals("je ______________ ")  && verb1.charAt(1)=='a' || verb1.charAt(1)=='e'
				|| verb1.charAt(1)=='i' || verb1.charAt(1)=='o' || verb1.charAt(1)=='u') {
			pronoun1 = "j' ______________ ";
		}
	}
	
	public String getJustPronoun () {
		if (pronoun1.substring(0,2).equals("je") || pronoun1.substring(0,2).equals("j'") || pronoun1.substring(0,2).equals("tu")) {
			return pronoun1.substring(0,2);
		}
		if (pronoun1.substring(0,4).equals("nous") || pronoun1.substring(0,4).equals("vous")) {
			return pronoun1.substring(0,4);
		}
		if (pronoun1.equals("il/elle/on ________ ")) {
			return pronoun1.substring(0,10);
		}
		if (pronoun1.equals("ils/elles  ________ ")) {
			return pronoun1.substring(0,9);
		}
		return ("");
	}
	
	public String getPronoun () {
		return pronoun1;
	}
	
	public String getVerb() {
		return verb1;
	}
	
	public int getX() {
		return x;
	}
	
	public String getCorrectAnswer() {
		if (getPronoun().substring(0,2).equals("je") ||  getPronoun().substring(0, 10).equals("il/elle/on")) {
			return getJustPronoun() + " " + getVerb().substring(1, getVerb().length()-3)+"e";
		}
		if (getPronoun().substring(0,2).equals("j'")) {
			return getJustPronoun() + getVerb().substring(1, getVerb().length()-3)+"e";
		}
		if (getPronoun().substring(0, 2).equals("tu")) {
			return getJustPronoun() + " " + getVerb().substring(1, getVerb().length()-3)+"es";
		}
		if (getPronoun().substring(0, 4).equals("nous")) {
			return getJustPronoun() + " " + getVerb().substring(1, getVerb().length()-3)+"ons";
		}
		if (getPronoun().substring(0, 4).equals("vous")) {
			return getJustPronoun() + " " + getVerb().substring(1, getVerb().length()-3)+"ez";
		}
		else {
			return getJustPronoun() + " " + getVerb().substring(1, getVerb().length()-3)+"ent";
		}
	}

	public boolean checkAnswer(String userAnswer) {
		if ((getX()<500)&&(getX()>0)) {
			if (userAnswer.equals(getCorrectAnswer())) {
				show = false;
				return true;
			}
		}
		return false;
	}
	
	public void draw (Graphics g, Color c) {
		if (show) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
		g.setColor(c);
		g.drawString(pronoun1, x+10,y+20);
		g.drawString(verb1, x+140, y+20);
		}
		//g.drawImage(image, x, y, width, height, null);
	}
	public void update() {
		x++;
	}
	
	public boolean getVisibility() {
		return show;
	}
	
	//http://takelessons.com/blog/common-regular-french-verbs-z04
	
}