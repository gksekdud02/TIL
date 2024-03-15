package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class yearReport extends JFrame {
	User user = new User();
	yearReport(User u) {
		user = u;
		// ���� ����, ���� ������ ����� �̺�Ʈ �����嵵 �����ϵ��� ����
		setTitle("���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// �������� ȭ�� �߾ӿ� ��ġ
		setLocationRelativeTo(null);

		// Main�����̳� �̸��� c�� ����, ��ġ������ ����, ��׶��� ����
		Container c = getContentPane();
		c.setLayout(null);
		// �ϴ� �Ͼ������ ���� ����, ���� �̹����� �ٲ� ����
		c.setBackground(Color.WHITE);

		// ����
		JButton backButton = new JButton("����");
		backButton.setBounds(10, 10, 60, 25);
		backButton.setBackground(Color.WHITE);
		backButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new Main(user);
			}
		});

		// ��¥
		Date date = new Date();
		SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
		String year = yearFormat.format(date);

		// ���
		JLabel monthLabel = new JLabel(year + "�� ����");
		monthLabel.setBounds(30, 100, 80, 20);

		// �� ����
		JLabel allSalesTextLabel = new JLabel("�� ���� : ");
		allSalesTextLabel.setBounds(30, 130, 80, 20);
		JLabel allSalesLabel = new JLabel("100,000,000");
		allSalesLabel.setBounds(80, 130, 80, 20);

		// ������
		JLabel netProfitTextLabel = new JLabel("������  : ");
		netProfitTextLabel.setBounds(30, 160, 100, 20);
		JLabel netProfitLabel = new JLabel("30,000,000");
		netProfitLabel.setBounds(80, 160, 300, 20);

		c.add(backButton);
		c.add(monthLabel);
		c.add(allSalesTextLabel);
		c.add(allSalesLabel);
		c.add(netProfitTextLabel);
		c.add(netProfitLabel);

		setSize(710, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
	}
}
