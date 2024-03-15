import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame{
	public AnonymousClassListener() {
		setTitle("Action �̺�Ʈ ������ �ۼ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		
		//�͸� Ŭ������ Action ������ �ۼ�
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action")) //��ư�� ���ڿ��� "Action"���� ��
					b.setText("�׼�"); //��ư�� ���ڿ��� "�׼�"���� ����
				else
					b.setText("Action"); //��ư�� ���ڿ��� "Action"���� ����
				setTitle(b.getText());
			}
		});
		setSize(350,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AnonymousClassListener();
	}
}
