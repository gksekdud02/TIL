import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("Action �̺�Ʈ ������ ����"); //�������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ �����츦 ������ ���α׷� ����
		Container c = getContentPane(); //����Ʈ�� �˾Ƴ���
		c.setLayout(new FlowLayout()); //����Ʈ�ҿ� FlowLayout ��ġ������ ����
		JButton btn = new JButton("Action"); //Action ��ư ������Ʈ ����
		btn.addActionListener(new MyActionListener()); //Action ������ �ޱ�
		c.add(btn); //����Ʈ�ҿ� ��ư ����
		
		setSize(350,150);//������ ũ�� 350x150 ����
		setVisible(true); //�������� ȭ�鿡 ���
	}
	public static void main(String[] args) {
		new IndepClassListener();
	}
}
//������ Ŭ������ �̺�Ʈ �����ʸ� �ۼ��Ѵ�.
class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) { //��ư�� Ŭ���� �� ȣ��Ǵ� �żҵ�
		JButton b = (JButton)e.getSource(); //�̺�Ʈ �ҽ� ��ư �˾Ƴ���
		if(b.getText().equals("Action")) //��ư�� ���ڿ��� "Action"���� ��
			b.setText("�׼�"); //��ư�� ���ڿ��� "�׼�"���� ����
		else
			b.setText("Action"); //��ư�� ���ڿ��� "Action"���� ����
	}
}
