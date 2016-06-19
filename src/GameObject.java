import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

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
	final String [] verbs  = {"chanter", "chercher", "danser", 
			"demander",  "donner", "fermer", "jouer",  "laver", 
			"parler", "penser", "travailler", "trouver", "visiter"};
	String pronoun1;
	String verb1;
	GameObject(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		randomPronoun = random.nextInt(6);
		randomVerb = random.nextInt(13);
		pronoun1 = pronouns[randomPronoun];
		verb1 = "(" + verbs[randomVerb] + ")";
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

	public boolean checkAnswer(String userAnswer) {
		if ((getX()<500)&&(getX()>0)) {
			if (getPronoun().substring(0,2).equals("je") || getPronoun().indexOf('o')!=-1 && getPronoun().substring(0, 10).equals("il/elle/on")) {
				if (userAnswer.equals(getVerb().substring(1, getVerb().length()-3)+"e")) {
					return true;
				}
			}
			if (getPronoun().substring(0, 2).equals("tu")) {
				if (userAnswer.equals(getVerb().substring(1, getVerb().length()-3)+"es")) {
					return true;
				}
			}
			if (getPronoun().substring(0, 4).equals("nous")) {
				if (userAnswer.equals(getVerb().substring(1, getVerb().length()-3)+"ons")) {
					return true;
				}
			}
			if (getPronoun().substring(0, 4).equals("vous")) {
				if (userAnswer.equals(getVerb().substring(1, getVerb().length()-3)+"ez")) {
					return true;
				}
			}
			if (getPronoun().substring(0, 9).equals("ils/elles")) {
				if (userAnswer.equals(getVerb().substring(1, getVerb().length()-3)+"ent")) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void draw (Graphics g, Color c) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
		g.setColor(c);
		g.drawString(pronoun1, x+10,y+20);
		g.drawString(verb1, x+140, y+20);
		//g.drawImage(image, x, y, width, height, null);
	}
	public void update() {
		x++;
	}
	
	
}