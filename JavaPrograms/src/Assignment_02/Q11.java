package Assignment_02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Q11 {
	public static void main(String[] args) {
		convertor obj = new convertor();
	}
}

class convertor extends JFrame{
	
	JTextField t;
	JLabel lc;
	JButton b;
	JLabel lf;
	
	convertor(){
		
		t = new JTextField(9);
		lc = new JLabel("      Celcius");
		b = new JButton("Convert");
		lf = new JLabel("Fahrenheit");
		
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b) {
					int a = Integer.parseInt(t.getText());
					Float r = (float) ((a*(9.0/5))+32);
					lf.setText(r.toString()+" Fahrenheit");
				}
			}
			
		};
		
		add(t);
		add(lc);
		add(b);
		add(lf);
		b.addActionListener(al);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(250,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}