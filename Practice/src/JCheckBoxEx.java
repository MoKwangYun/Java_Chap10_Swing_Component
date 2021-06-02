import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JCheckBoxEx extends JFrame{
	JCheckBox [] fruits = new JCheckBox[3];
	String [] name = {"사과", "배", "체리"};
	
	JLabel sumLabel;
	JCheckBoxEx(){
		setTitle("체크박스와 ItemEvent");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("사과 100, 배 500, 체리 20000"));
		
		MyItemListener listener = new MyItemListener();
		for(int i = 0;i<3;i++) {
			fruits[i] = new JCheckBox(name[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(listener);
		}
		
		sumLabel = new JLabel("현재 0원입니다.");
		c.add(sumLabel);
		setVisible(true);
		setSize(250,200);
	}
	
	class MyItemListener implements ItemListener{
		int sum = 0;
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0])
					sum += 100;
				else  if(e.getItem() == fruits[1])
					sum += 500;
				else
					sum += 20000;
			}
			else {
				if(e.getItem() == fruits[0])
					sum -= 100;
				else  if(e.getItem() == fruits[1])
					sum -= 500;
				else
					sum -= 20000;
		
			}
		sumLabel.setText("현재 " +sum+"원 입니다.");
	
		}
	}
	public static void main(String[] args) {
		new JCheckBoxEx();
	}

}
