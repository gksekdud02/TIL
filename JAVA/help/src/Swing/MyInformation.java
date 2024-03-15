package Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyInformation extends JFrame {
	User user = new User();

	public MyInformation() {
		// ���� ����, ���� ������ ����� �̺�Ʈ �����嵵 �����ϵ��� ����
		setTitle("�� ����");
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

		// �̸�
		JLabel nameLabel = new JLabel("�̸� : " + user.getName());
		nameLabel.setBounds(10, 50, 200, 20);

		// �������
		JLabel birthLabel = new JLabel("������� : " + user.getBirthDate());
		birthLabel.setBounds(10, 80, 200, 20);

		// ����
		JLabel genderLabel = new JLabel("���� : " + user.getGender());
		genderLabel.setBounds(10, 110, 200, 20);

		// ���̵�
		JLabel idLabel = new JLabel("���̵� : " + user.getId());
		idLabel.setBounds(10, 140, 200, 20);

		// ��й�ȣ
		JLabel pwLabel = new JLabel("��й�ȣ : " + user.getPw());
		pwLabel.setBounds(10, 170, 200, 20);

		// ��й�ȣã�� ����
		JLabel findPwQLabel = new JLabel("��й�ȣã�� ���� : " + user.getPwQuestion());
		findPwQLabel.setBounds(10, 200, 200, 20);

		// ��й�ȣã�� �亯
		JLabel findPwLabel = new JLabel("��й�ȣã�� �亯 : " + user.getPwQuestionAnswer());
		findPwLabel.setBounds(10, 230, 200, 20);

		// ��ȭ��ȣ
		JLabel phoneLabel = new JLabel("��ȭ��ȣ : " + user.getPhoneNumber());
		phoneLabel.setBounds(10, 260, 200, 20);

		// �̸���
		JLabel emailLabel = new JLabel("�̸��� : " + user.geteMail());
		emailLabel.setBounds(10, 290, 200, 20);

		// ������ ��ȭ��ȣ
		JLabel managerPhoneLabel = new JLabel("������ ��ȭ��ȣ : 010-9206-9486");
		managerPhoneLabel.setBounds(510, 340, 200, 20);

		c.add(backButton);
		c.add(nameLabel);
		c.add(birthLabel);
		c.add(genderLabel);
		c.add(idLabel);
		c.add(pwLabel);
		c.add(findPwQLabel);
		c.add(findPwLabel);
		c.add(phoneLabel);
		c.add(emailLabel);
		c.add(managerPhoneLabel);

		setSize(710, 400);
		setVisible(true);
	}

	public MyInformation(User u) {
		user = u;
		// ���� ����, ���� ������ ����� �̺�Ʈ �����嵵 �����ϵ��� ����
		setTitle("�� ����");
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

		// �̸�
		JLabel nameLabel = new JLabel("�̸� : " + user.getName());
		nameLabel.setBounds(10, 50, 200, 20);

		// �������
		JLabel birthLabel = new JLabel("������� : " + user.getBirthDate());
		birthLabel.setBounds(10, 80, 200, 20);

		// ����
		JLabel genderLabel = new JLabel("���� : " + user.getGender());
		genderLabel.setBounds(10, 110, 200, 20);

		// ���̵�
		JLabel idLabel = new JLabel("���̵� : " + user.getId());
		idLabel.setBounds(10, 140, 200, 20);

		// ��й�ȣ
		JLabel pwLabel = new JLabel("��й�ȣ : " + user.getPw());
		pwLabel.setBounds(10, 170, 200, 20);

		// ��й�ȣã�� ����
		JLabel findPwQLabel = new JLabel("��й�ȣã�� ���� : " + user.getPwQuestion());
		findPwQLabel.setBounds(10, 200, 200, 20);

		// ��й�ȣã�� �亯
		JLabel findPwLabel = new JLabel("��й�ȣã�� �亯 : " + user.getPwQuestionAnswer());
		findPwLabel.setBounds(10, 230, 200, 20);

		// ��ȭ��ȣ
		JLabel phoneLabel = new JLabel("��ȭ��ȣ : " + user.getPhoneNumber());
		phoneLabel.setBounds(10, 260, 200, 20);

		// �̸���
		JLabel emailLabel = new JLabel("�̸��� : " + user.geteMail());
		emailLabel.setBounds(10, 290, 200, 20);

		// ������ ��ȭ��ȣ
		JLabel managerPhoneLabel = new JLabel("������ ��ȭ��ȣ : 010-9206-9486");
		managerPhoneLabel.setBounds(510, 340, 200, 20);

		c.add(backButton);
		c.add(nameLabel);
		c.add(birthLabel);
		c.add(genderLabel);
		c.add(idLabel);
		c.add(pwLabel);
		c.add(findPwQLabel);
		c.add(findPwLabel);
		c.add(phoneLabel);
		c.add(emailLabel);
		c.add(managerPhoneLabel);

		setSize(710, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
	}
}
