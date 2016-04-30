
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
	//int yPosition1 = random.nextInt(400) + 0;
	//int yPosition2 = random.nextInt(400) + 0;
	
	GamePanel() {
		System.out.println("gamepanel");
		timer1 = new Timer(8, this);
		timer1.start();
		x=1;
		y=1;
		width=100;
		height=50;
		//speedx=100;
		//speedy=100;
		object1 = new GameObject(10,random.nextInt(400) +0,220,30,Color.BLUE);
		object2 = new GameObject(-300,random.nextInt(400)+0,220,30,Color.RED);
	}
	
	public void paintComponent(Graphics g) {
		//g.fillRect(x, y, width, height);
		object1.draw(g, Color.BLUE);
		object2.draw(g, Color.RED);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("actionperformed");
		repaint();
		object1.update();
		object2.update();
		if (object1.x>=500) {
			object1 = new GameObject(-220,random.nextInt(400) +0,220,30,Color.BLUE);
		}
		if (object2.x>=500) {
			object2 = new GameObject(-220,random.nextInt(400) +0,220,30,Color.RED);
		}
	}

}