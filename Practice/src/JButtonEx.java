import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JButtonEx extends JFrame{
	JButtonEx(){
		setTitle("JButton ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("images/Lebron.jpg");
		ImageIcon rolloverIcon = new ImageIcon("images/Lebron2.jpg");
		ImageIcon pressedIcon = new ImageIcon("images/Lebron3.jpg");
		
		JButton jb = new JButton("����~",normalIcon);
		jb.setRolloverIcon(rolloverIcon);
		jb.setPressedIcon(pressedIcon);
		jb.setSize(150,150);
		c.add(jb);
		
		setVisible(true);
		setSize(300,300);
	}
	public static void main(String[] args) {
		new JButtonEx();
	}

}
