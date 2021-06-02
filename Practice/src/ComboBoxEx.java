import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ComboBoxEx extends JFrame{
	String [] Leb = {"Lebron", "LebGal","LebMiami"};
	ImageIcon [] images = {new ImageIcon("images/Lebron.jpg")
							,new ImageIcon("images/Lebron2.jpg")
							,new ImageIcon("images/Lebron3.jpg")};
	JLabel imgLabel = new  JLabel(images[0]);
	ComboBoxEx(){
		setTitle("JComboBox ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox cb = new JComboBox(Leb);
		c.add(cb);
		c.add(imgLabel);
		
		cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox combo = (JComboBox)e.getSource();
				
				int index = combo.getSelectedIndex();
				
				imgLabel.setIcon(images[index]);
			}
		});
		
		setVisible(true);
		setSize(700,700);
	}
	
	public static void main(String[] args) {
		new ComboBoxEx();
	}

}
