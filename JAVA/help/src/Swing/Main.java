package Swing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// 1061 460
public class Main extends JFrame {
	User user = new User();

	public Main(User u) {
		user = u;
		// ���� ����, ���� ������ ����� �̺�Ʈ �����嵵 �����ϵ��� ����
		setTitle("����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// �������� ȭ�� �߾ӿ� ��ġ
		setLocationRelativeTo(null);

		// Main�����̳� �̸��� c�� ����, ��ġ������ ����, ��׶��� ����
		Container c = getContentPane();
		c.setLayout(null);

		// �ϴ� �Ͼ������ ���� ����, ���� �̹����� �ٲ� ����
		c.setBackground(Color.WHITE);

		// �̸�
		Font welcomeFont = new Font("���ڸ�ü", Font.PLAIN, 30);
		JLabel nameLabel = new JLabel("Hi Pos");
		nameLabel.setFont(welcomeFont);
		nameLabel.setBounds(50, 10, 200, 50);
		JLabel SameDaySaleLabel = new JLabel("���� ���� : 15,000,000");
		SameDaySaleLabel.setBounds(50, 60, 200, 50);

		// �α׾ƿ�
		JButton logoutButton = new JButton("�α׾ƿ�");
		logoutButton.setBounds(590, 10, 90, 30);
		logoutButton.setBackground(Color.WHITE);
		logoutButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new Login();
			}
		});

		// �� ����
		JButton myInformationButton = new JButton("�� ����");
		myInformationButton.setBounds(45, 200, 250, 40);
		myInformationButton.setBackground(Color.WHITE);
		myInformationButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new MyInformation(user);
			}
		});

		// ȯ��
		JButton RefundButton = new JButton("ȯ��");
		RefundButton.setBounds(400, 200, 250, 40);
		RefundButton.setBackground(Color.WHITE);
		RefundButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				new Refund_Main();
			}
		});

		// ���
		JButton calculationButton = new JButton("���");
		calculationButton.setBounds(45, 250, 250, 40);
		calculationButton.setBackground(Color.WHITE);
		calculationButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				new CalculationMain(user);
			}
		});

		// ���� ����
		JButton monthRefortButton = new JButton("���� ����");
		monthRefortButton.setBounds(400, 250, 250, 40);
		monthRefortButton.setBackground(Color.WHITE);
		monthRefortButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new MonthlyReport(user);
			}
		});

		// ��ǰ ����
		JButton productsSuperintendButton = new JButton("��ǰ ����");
		productsSuperintendButton.setBounds(45, 300, 250, 40);
		productsSuperintendButton.setBackground(Color.WHITE);

		// 2021 ����
		JButton yearRefortButton = new JButton("2021 ����");
		yearRefortButton.setBounds(400, 300, 250, 40);
		yearRefortButton.setBackground(Color.WHITE);
		yearRefortButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new yearReport(user);
			}
		});

		// ������ ��ȭ��ȣ
		JLabel managerPhoneLabel = new JLabel("������ ��ȭ��ȣ : 010-9206-9486");
		managerPhoneLabel.setBounds(510, 340, 200, 20);
		c.add(managerPhoneLabel);

		c.add(nameLabel);
		c.add(SameDaySaleLabel);
		c.add(logoutButton);
		c.add(myInformationButton);
		c.add(RefundButton);
		c.add(calculationButton);
		c.add(monthRefortButton);
		c.add(productsSuperintendButton);
		c.add(yearRefortButton);

		setSize(710, 400);
		setVisible(true);
	}

//	public Main(User u) {
//		this();
//		this.user = u;
//	}

	// ������ �Ѱ��ִ� �� null�� ���ؼ� ����� / �޼ҵ带 ���� �⺻�����ڸ� ȣ���ϰ� ������ �Ѱ��ִµ� �̷��� �⺻ �����ڿ��� �׳�
	// �ڵ���� ������ ���ް� �޼ҵ�� ���� �ڵ峪 �̺�Ʈ�� �߰��ϸ� ������ ����.. ������ �𸣰���.

	// ������������ ������ �� �ѱ⳪ ���� �� �������� ���� �Ű� �ٴϴٺ��� ������ �Ҿ������ ���� �߻���
	// �׷��Ƿ� ���� �ʿ��� ������ �Ѱ������ʰ� ���� �ű�� ����� ��� ������ �ְ� �ٽ� ��� ������ �޵��� �����ؾ� �� �� ����.

	public static void main(String[] args) {
	}

}
