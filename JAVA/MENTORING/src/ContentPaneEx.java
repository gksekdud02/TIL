import javax.swing.*;
import java.awt.*; //�׷��� ó���� ���� Ŭ�������� ��θ�

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ �����츦 ������ ���α׷� ����
		
		Container contentPane = getContentPane(); //����Ʈ���� �˾Ƴ���
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,30,30)); //����Ʈ�ҿ� FlowLayout ��ġ������ �ޱ�
		
		contentPane.add(new JButton("ok")); //��ư �ޱ�
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JButton("ok"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JButton("ok"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
