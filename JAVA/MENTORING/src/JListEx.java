import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JListEx extends JFrame {
	private String [] fruits = {"���","�ٳ���","��","Ű��","������"};
	private ImageIcon[] images = {new ImageIcon("C:\\Users\\gksek\\OneDrive\\���� ȭ��\\���.jfif"),
								  new ImageIcon("C:\\Users\\gksek\\OneDrive\\���� ȭ��\\�ٳ���.jfif"),
								  new ImageIcon("C:\\Users\\gksek\\OneDrive\\���� ȭ��\\��.jpg"),
								  new ImageIcon("C:\\Users\\gksek\\OneDrive\\���� ȭ��\\Ű��.jfif"),
								  new ImageIcon("C:\\Users\\gksek\\OneDrive\\���� ȭ��\\������.jfif") 
								  };
	private JLabel imgLabel = new JLabel(images[0]);

	public JListEx() {
		setTitle("�̹�������Ʈ ����");
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
