import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InnerClassListener extends JFrame{
	public InnerClassListener() {
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
	
	private class MyActionListener implements ActionListener{ //Action �����ʸ� ���� Ŭ������ �ۼ�
		public void actionPerformed(ActionEvent e) { //��ư�� Ŭ���� �� ȣ��Ǵ� �żҵ�
			JButton b = (JButton)e.getSource(); //�̺�Ʈ �ҽ� ��ư �˾Ƴ���
			if(b.getText().equals("Action")) //��ư�� ���ڿ��� "Action"���� ��
				b.setText("�׼�"); //��ư�� ���ڿ��� "�׼�"���� ����
			else
				b.setText("Action"); //��ư�� ���ڿ��� "Action"���� ����
			//InnerClassListener�� ����� JFrame�� ����� ȣ���� �� ����
			InnerClassListener.this.setTitle(b.getText()); //������ Ÿ��Ʋ�� ��ư ���ڿ��� ����Ѵ�.
		}
	}
	public static void main(String[] args) {
		new InnerClassListener();
	}
}
