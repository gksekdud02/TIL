import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonEx extends JFrame {
	private JRadioButton[] fruits = new JRadioButton[3];
	private String[] names = {"사과","배","체리"};
	
	private JLabel label;
	public RadioButtonEx() {
		setTitle("라디오버튼");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		ButtonGroup g = new ButtonGroup();
		
		MyItemListener listener = new MyItemListener();
		for(int i=0;i<fruits.length;i++) {
			fruits[i]=new JRadioButton(names[i]);
			g.add(fruits[i]);
			c.add(fruits[i]);
			fruits[i].addItemListener(listener);
		}
	
		label = new JLabel("가격");
		c.add(label);
	
		setSize(170,200);
		setVisible(true);
	}
	class MyItemListener implements ItemListener{
		
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0]) {
					label.setText("사과는 100원 입니다");
				}
				else if(e.getItem()==fruits[1]) {
					label.setText("배는 200원 입니다");
				}
				else {
					label.setText("체리는 300원 입니다");
				}
			}
		}
	}
	public static void main(String[] args) {
		new RadioButtonEx();
	}
}
