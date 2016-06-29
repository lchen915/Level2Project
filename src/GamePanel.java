
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{
	Timer timer1;
	GameObject object1;
	GameObject object2;
	int x;
	int y;
	int width;
	int height;
	Color c;
	int speedx;
	int speedy;
	boolean mouse1=false;
	Random random = new Random();	
	int actualScore;
	GamePanel() {
		System.out.println("gamepanel");
		timer1 = new Timer(6, this);
		timer1.start();
		x=1;
		y=1;
		width=100;
		height=50;
		object1 = new GameObject(10,random.nextInt(400),220,30);
		object2 = new GameObject(-300,random.nextInt(400),220,30);
		actualScore = 0; 
	}
	
	public void paintComponent(Graphics g) {
		object1.draw(g, Color.WHITE);
		object2.draw(g, Color.WHITE);
		g.setColor(Color.BLACK);
		//g.setFont(new Font("Times New Roman", 20, Font.PLAIN));
		g.drawString("Score: " + actualScore, 20, 20);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		move();
	}
	
	public boolean checkAnswer1(String userAnswer) {
		return object1.checkAnswer(userAnswer);
	}
	
	public boolean checkAnswer2(String userAnswer) {
		return object2.checkAnswer(userAnswer);
	}
	
	public void updateScore(String answer) {
		if (checkAnswer1(answer) || checkAnswer2(answer)) {
			actualScore+=1;
		}
		else {
			actualScore-=1;
		}
		System.out.println(actualScore);
	}

	public void move() {
		repaint();
		object1.update();
		object2.update();
		if (object1.getX()>=500) {
			if (object1.getVisibility()==true) {
				actualScore-=1;
				String correction = "";
				while (! correction.equals(object1.getCorrectAnswer())) {
						correction = JOptionPane.showInputDialog("You didn't type the correct answer in time. " 
						+ "The correct conjugation of " + object1.getJustPronoun() + " " + object1.getVerb() + " is " 
						+ object1.getCorrectAnswer() + ". Please type this below, then hit ENTER or click OK. Do not click CANCEL.");
				}
				System.out.println(correction);
			}
		object1 = new GameObject(-220,random.nextInt(400) +0,220,30);
		}
		if (object2.getX()>=500) {
			if (object2.getVisibility()==true) {
				actualScore-=1;
				String correction2 = "";
				while (! correction2.equals(object2.getCorrectAnswer())) {
						correction2 = JOptionPane.showInputDialog("You didn't type the correct answer in time. " 
						+ "The correct conjugation of " + object2.getJustPronoun() + " " + object2.getVerb() + " is " 
						+ object2.getCorrectAnswer() + ". Please type this below, then hit ENTER or click OK. Do not click CANCEL.");
				}
		object2 = new GameObject(-220,random.nextInt(400) +0,220,30);
		}
	}
	}
}