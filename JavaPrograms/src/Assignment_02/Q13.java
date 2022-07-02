package Assignment_02;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Q13 {
	public static void main(String[] args) {
		avgMarks obj = new avgMarks();
	}
}

class avgMarks extends JFrame{
	
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;
	JLabel l;
	
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;
	
	JButton b;
	
	avgMarks(){
		l1 = new JLabel("____AVERAGE MARKS CALCULATOR____");
		l2 = new JLabel("Enter marks in four course & click on Average");
		l3 = new JLabel("     Course Mark 1       ");
		t1 = new JTextField(8);
		l4 = new JLabel("     Course Mark 2       ");
		t2 = new JTextField(8);
		l5 = new JLabel("     Course Mark 3       ");
		t3 = new JTextField(8);
		l6 = new JLabel("     Course Mark 4       ");
		t4 = new JTextField(8);
		b = new JButton("       Average      ");
		l = new JLabel("__________________________________");
		
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b) {
					int a = Integer.parseInt(t1.getText());
					int b = Integer.parseInt(t2.getText());
					int c = Integer.parseInt(t3.getText());
					int d = Integer.parseInt(t4.getText());
					Float avg = (float)(a+b+c+d)/4;
					l.setText("      Average of "+a+", "+b+", "+c+", "+d+" is "+avg.toString()+"       ");
				}
			}
		};
		
		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(l4);
		add(t2);
		add(l5);
		add(t3);
		add(l6);
		add(t4);
		add(b);
		add(l);
		
		b.addActionListener(al);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(350,280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}