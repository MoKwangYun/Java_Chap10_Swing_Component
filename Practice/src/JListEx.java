import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JListEx extends JFrame{
	String [] fruits={"���", "��",  "ü��","����","����","Ű��","����","����","����","��","������"};
	JListEx(){
		setTitle("JList ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JList strlist = new JList(fruits);
		c.add(strlist);
		
		JList scrolllist = new JList(fruits);
		c.add(new JScrollPane(scrolllist));
		
		setVisible(true);
		setSize(500,500);
	}
	
	public static void main(String[] args) {
		new JListEx();
	}

}
