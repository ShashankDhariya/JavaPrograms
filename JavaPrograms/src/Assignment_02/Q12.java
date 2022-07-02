package Assignment_02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Q12 {
	public static void main(String[] args) {
		searchEmployee obj = new searchEmployee();
	}
}

class searchEmployee extends JFrame{
	
	JLabel l1;
	JTextField t;
	JButton b;
	JLabel l2;
	
	searchEmployee(){
		l1 = new JLabel("Enter Employee Id ");
		t = new JTextField(15);
		
		b = new JButton("Submit");
		
		l2 = new JLabel("____________");
		
		add(l1);
		add(t);
		add(b);
		add(l2);
		
		int arr[] = {1001,1003,1004,1005,1006,1007,1010};
		
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int i=0;
				if(e.getSource() == b) {
					
					int a = Integer.parseInt(t.getText());
					for(i=0;i<arr.length;i++){
						if(a == arr[i]) {
							l2.setText("Employee Present");
							System.out.println(l1);
							break;
						}
					}
					if(i == arr.length) {
						l2.setText("No Enployee with this ID present");
						System.out.println(l1);
					}
				}
			}
			
		};
		
		b.addActionListener(al);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(250,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}