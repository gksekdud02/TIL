import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class OptionPane extends JFrame{
	public OptionPane() {
		setTitle("옵션 팬 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setSize(500,200);
		c.add(new MyPanel(),BorderLayout.NORTH);
		setVisible(true);
	}
	class MyPanel extends Panel{
		private JButton inputBtn = new JButton("Input Name");
		private JTextField tf = new JTextField(10);
		private JButton confirmBtn = new JButton("Confirm");
		private JButton messageBtn = new JButton("Message");
		
		public MyPanel() {
			setBackground(Color.LIGHT_GRAY); 
			//borderLayout.NORTH 에만 적용됨
			add(inputBtn);
			add(confirmBtn);
			add(messageBtn);
			add(tf);
			//선언 순서와 상관없이 add순서로 적용됨
			
			inputBtn.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("이름을 입력하시오");
					if(name!=null) {
						tf.setText(name);
					}
				}
			});
			confirmBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, 
							"계속할 것입니까?","Confirm",JOptionPane.YES_NO_OPTION);
					if(result ==JOptionPane.CLOSED_OPTION)
						tf.setText("Just Closed without Selection");
					else if(result == JOptionPane.YES_OPTION)
						tf.setText("Yes");
					else
						tf.setText("No");
				}
			});
			
			messageBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "조심하세요","Message",JOptionPane.ERROR_MESSAGE);
				}
			});
		}
		
	}
	public static void main(String[] args) {
		new OptionPane();
	}
}
