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
	final String [] verbs  = {"aimer", "arriver", "chanter", "chercher", "danser", 
			"demander",  "donner", "fermer", "jouer",  "laver", 
			"parler", "penser", "travailler", "trouver", "visiter"};
	String pronoun1;
	String verb1;
	GameObject(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		randomPronoun = random.nextInt(5);
		randomVerb = random.nextInt(14);
		pronoun1 = pronouns[randomPronoun];
		verb1 = "(" + verbs[randomVerb] + ")";
	}
	
	public String getPronoun () {
		return pronoun1;
	}
	
	public int getX() {
		return x;
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