import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	Random random = new Random();
	int randomPronoun = random.nextInt(5) + 0;
	String [] pronouns = {"je ________ ", "tu ________ ", "il/elle/on ________ ", 
			"nous _________ ", "vous ________ ", "ils/elles  ________ "};
	int randomVerb = random.nextInt(14) + 0;
	String [] verbs  = {"aimer", "arriver", "chanter", "chercher", "danser", 
			"demander",  "donner", "fermer", "jouer",  "laver", 
			"parler", "penser", "travailler", "trouver", "visiter"};
	static Color c;
	GameObject(int x, int y, int width, int height, Color c) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		GameObject.c=c;
	}
	public void draw (Graphics g, Color c) {
		g.fillRect(x, y, width, height);
		g.setColor(c);
		g.drawString(pronouns[randomPronoun], x+10,y+20);
		g.drawString("(" + verbs[randomVerb] + ")", x+135, y+20);
		//g.drawImage(image, x, y, width, height, null);
	}
	public void update() {
		x++;
		/*if(InputManager.LEFT_ARROW_KEY) {
			x--;
		}
		if(InputManager.RIGHT_ARROW_KEY) {
			x++;
		}
		if(InputManager.UP_ARROW_KEY) {
			y--;
		}
		if(InputManager.DOWN_ARROW_KEY) {
			y++;
		}
		if(InputManager.SPACEBAR) {
			width+=50;
			height+=50;
		}*/
		//x=InputManager.xOfMouse;
		//y=InputManager.yOfMouse;
	}
}