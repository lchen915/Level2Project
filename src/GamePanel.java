
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{
	Timer timer1;
	GameObject object1;
	GameObject object2;
	GameObject object4;
	int x;
	int y;
	int width;
	int height;
	Color c;
	int speedx;
	int speedy;
	boolean mouse1=false;
	Random random = new Random();	
	GamePanel() {
		System.out.println("gamepanel");
		timer1 = new Timer(10, this);
		//timer is 8, this
		timer1.start();
		x=1;
		y=1;
		width=100;
		height=50;
		object1 = new GameObject(10,random.nextInt(400) +0,220,30);
		object2 = new GameObject(-300,random.nextInt(400)+0,220,30);
	}
	
	public void paintComponent(Graphics g) {
		//g.fillRect(x, y, width, height);
		object1.draw(g, Color.WHITE);
		object2.draw(g, Color.WHITE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		move();
		//System.out.println("action performed");
		//System.out.println(e.getSource());
	}
	
	public synchronized void move() {
		repaint();
		object1.update();
		//object2.update();
		if ((object1.x<500)&&(object1.x>0)) {
			
		}
		if (object1.getX()>=500) {
			System.out.println("greater than 500");
			//System.out.println(object1.getPronoun());
			object1 = new GameObject(-220,random.nextInt(400) +0,220,30);
		}
		/*if (object2.x>=500) {
			object2 = new GameObject(-220,random.nextInt(400) +0,220,30);
		}*/
	}
}