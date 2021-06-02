import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JLabelEx extends JFrame{
	JLabelEx(){
		setTitle("JLabel 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("릅갈통 입니더~"));
		
		ImageIcon lbj = new ImageIcon("images/Lebron.jpg"); // src, bin 등이 있는 폴더에 images 폴더 생성 
		JLabel la = new JLabel("Goat!!",lbj,SwingConstants.CENTER);
		
		c.add(la);
		
		setVisible(true);
		setSize(300,300);
		
	}
	public static void main(String[] args) {
		new JLabelEx();
	}
}
