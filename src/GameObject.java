import java.awt.Color;
import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
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