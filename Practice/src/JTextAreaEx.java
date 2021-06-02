import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JTextAreaEx extends JFrame{
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(7,20);
	
	JTextAreaEx(){
		setTitle("JTextArea ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText()+"\n");
				t.setText("");
			}
		});
		
		setVisible(true);
		setSize(300,300);
	}
	public static void main(String[] args) {
		new JTextAreaEx();
	}
}
