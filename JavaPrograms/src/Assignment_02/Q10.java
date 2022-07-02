package Assignment_02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Q10 {
	public static void main(String[] args) {
		register_gui obj = new register_gui(); 
	}
}

class register_gui extends JFrame{
	
	JLabel l;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;
	JLabel ln;
	
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;
	JTextField t5;
	JTextField t6;
	JTextField t;
	JButton b;
	
	StringBuffer sb = new StringBuffer();
	
	register_gui(){
		
		l = new JLabel("____________________NEW USER REGISTRATION____________________");
		l1 = new JLabel("First name        ");
		t1 = new JTextField(15);
		l2 = new JLabel("Username          ");
		t2 = new JTextField(15);
		l3 = new JLabel("Last name        ");
		t3 = new JTextField(15);
		l4 = new JLabel("Password           ");
		t4 = new JTextField(15);
		l5 = new JLabel("Email Address ");
		t5 = new JTextField(15);
		l6 = new JLabel("Phone Number  ");
		t6 = new JTextField(15);
		t = new JTextField("Registered Email IDs ");
		ln = new JLabel("Nil");
		b = new JButton("                                                Submit                                                   ");
		
		ActionListener al = new ActionListener() {

			String str = new String();
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b) {
					str = str+t5.getText()+" ,  ";
					ln.setText(str);
				}
			}
		};
		
		add(l);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(l5);
		add(t5);
		add(l6);
		add(t6);
		add(b);
		add(t);
		add(ln);
		
		b.addActionListener(al);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}