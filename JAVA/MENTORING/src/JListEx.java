import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JListEx extends JFrame {
	private String [] fruits = {"사과","바나나","배","키위","복숭아"};
	private ImageIcon[] images = {new ImageIcon("C:\\Users\\gksek\\OneDrive\\바탕 화면\\사과.jfif"),
								  new ImageIcon("C:\\Users\\gksek\\OneDrive\\바탕 화면\\바나나.jfif"),
								  new ImageIcon("C:\\Users\\gksek\\OneDrive\\바탕 화면\\배.jpg"),
								  new ImageIcon("C:\\Users\\gksek\\OneDrive\\바탕 화면\\키위.jfif"),
								  new ImageIcon("C:\\Users\\gksek\\OneDrive\\바탕 화면\\복숭아.jfif") 
								  };
	private JLabel imgLabel = new JLabel(images[0]);

	public JListEx() {
		setTitle("이미지리스트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JComboBox<String> combo = new JComboBox<String>(fruits);
		c.add(combo);
		c.add(imgLabel);
		
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}
		});
		
		setSize(300,250);
		setVisible(true);
		}
	public static void main(String[] args) {
		new JListEx();
	}
}
