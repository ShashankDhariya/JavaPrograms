package Assignment_02;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Q3 extends Canvas{
	public static void main(String[] args) {
		Q3 obj = new Q3();
		JFrame j = new JFrame();
		j.add(obj);
		
		j.setVisible(true);
		j.setSize(400,400);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics grap) {
		grap.setColor(Color.green);
		grap.fillOval(85, 32, 75, 75);
//		grap.fillOval(ALLBITS, ABORT, WIDTH, HEIGHT);
		
		grap.setColor(Color.blue);
		grap.drawLine(362, 362, 0, 0);
	}
}