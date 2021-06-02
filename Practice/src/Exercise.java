import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Exercise extends JFrame{
	Exercise(){
		setTitle("Exercise �ǽ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		
		JPanel jp = new JPanel();
		c.add(jp,BorderLayout.SOUTH);
		JButton jb1 = new JButton("Yellow");
		JButton jb2 = new JButton("Blue");
		jp.setLayout(new GridLayout(1,2));
		jp.add(jb1);
		jp.add(jb2);
		
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setBackground(Color.YELLOW);
			}
		});
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setBackground(Color.BLUE);
			}
		});
		
		setVisible(true);
		setSize(600,600);
	}
	
	public static void main(String[] args) {
		new Exercise();
	}

}
