package Assignment_02;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Q2 extends Canvas{
	public static void main(String[] args) {
		Q2 obj = new Q2();
		JFrame j = new JFrame();
		j.add(obj);
		
		j.setVisible(true);
		j.setSize(400,400);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics grap) {
		grap.setColor(Color.yellow);
		grap.fillOval(125, 125, 125, 150);
		
		grap.setColor(Color.black);
		grap.drawArc(140, 170, 50, 25, 70, 50);
		grap.drawArc(180, 170, 50, 25, 70, 50);
		
		grap.drawArc(160, 210, 50, 25, -180, 180);
	}
}
