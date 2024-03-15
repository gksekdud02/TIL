package Swing;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.*;

public class FindId extends JFrame {
	public static ArrayList<User> userList = new ArrayList<User>();

	public FindId(ArrayList<User> user) {
		userList = user;
		// ���� ����, ���� ������ ����� �̺�Ʈ �����嵵 �����ϵ��� ����
		setTitle("��й�ȣ ã��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// �������� ȭ�� �߾ӿ� ��ġ
		setLocationRelativeTo(null);

		// Main�����̳� �̸��� c�� ����, ��ġ������ ����, ��׶��� ����
		Container c = getContentPane();
		c.setLayout(null);

		// �ϴ� �Ͼ������ ���� ����, ���� �̹����� �ٲ� ����
		c.setBackground(Color.WHITE);

		// ����
		RoundedButton backButton = new RoundedButton("����");
		// JButton backButton = new JButton("����");
		backButton.setBounds(10, 10, 60, 25);
		backButton.setBackground(Color.WHITE);
		backButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new Login();
			}
		});

		// �̸�
		JLabel nameLabel = new JLabel("�̸�");
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setBounds(250, 56, 295, 30);

		JTextField nameTextField = new JTextField();
		nameTextField.setBounds(250, 86, 250, 40);
		// �������
		JLabel birthLabel = new JLabel("�������");
		birthLabel.setForeground(Color.WHITE);
		birthLabel.setBounds(250, 136, 295, 30);

		JTextField birthTextField = new JTextField();
		birthTextField.setBounds(250, 166, 250, 40);
		// �޴��� ��ȣ
		JLabel phoneLabel = new JLabel("�޴��� ��ȣ");
		phoneLabel.setForeground(Color.WHITE);
		phoneLabel.setBounds(250, 216, 295, 30);

		JTextField phoneTextField = new JTextField();
		phoneTextField.setBounds(250, 246, 250, 40);

		// ���̵� ã��
		RoundedButton findIdButton = new RoundedButton("���̵� ã��");
		// JButton findIdButton = new JButton("���̵� ã��");
		findIdButton.setBackground(Color.WHITE);
		findIdButton.setBounds(305, 306, 140, 40);
		findIdButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				String name = nameTextField.getText();
				String birth = birthTextField.getText();
				String phone = phoneTextField.getText();

				boolean check = false;
				for (int i = 0; i < userList.size(); i++) {
					if (userList.get(i).getName().equals(name)) {
						if (userList.get(i).getBirthDate().equals(birth)) {
							if (userList.get(i).getPhoneNumber().equals(phone)) {
								JOptionPane.showMessageDialog(null, "���̵� : " + userList.get(i).getId());
								check = true;
								break;
							}
						}
					}
				}

				if (check) {
					setVisible(false);
					new Login();
				} else {
					JOptionPane.showMessageDialog(null, "������ Ʋ�Ƚ��ϴ�.");
				}

			}
		});

		c.add(backButton);
		c.add(nameLabel);
		c.add(nameTextField);
		c.add(birthLabel);
		c.add(birthTextField);
		c.add(phoneLabel);
		c.add(phoneTextField);
		c.add(findIdButton);

		backgroundImage();

		setSize(710, 400);
		setVisible(true);
	}

	// 12��~2�� �ܿ� 3��~5�� �� 6��~8�� ���� 9��~11�� ����
	// ����(1/1) ������(3/1)O ��̳�(5/5) ������(6/6) ������(8/15) ��õ��(10/3)O �ѱ۳�(10/9)O
	// ��ź��(12/25)
	public void backgroundImage() {
		Date now = new Date();
		SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
		SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
		String month = monthFormat.format(now);
		String day = dayFormat.format(now);

		JLabel background = new JLabel();
		// ��
		if (month.equals("3") || month.equals("4") || month.equals("5")) {
			background = new JLabel(new ImageIcon("images/��.jpg"));
			if (month.equals("3") && day.equals("1")) {
				background = new JLabel(new ImageIcon("images/������.jpg"));
			}
			if (month.equals("5") && day.equals("5")) {
				background = new JLabel(new ImageIcon("images/��̳�.jpg"));
			}
		}
		// ����
		else if (month.equals("6") || month.equals("7") || month.equals("8")) {
			background = new JLabel(new ImageIcon("images/����.jpg"));
			if (month.equals("6") && day.equals("6")) {
				background = new JLabel(new ImageIcon("images/������.jpg"));
			}
			if (month.equals("8") && day.equals("15")) {
				background = new JLabel(new ImageIcon("images/������.jpg"));
			}
		}
		// ����
		else if (month.equals("9") || month.equals("10") || month.equals("11")) {
			background = new JLabel(new ImageIcon("images/����.jpg"));
			if (month.equals("10") && day.equals("3")) {
				background = new JLabel(new ImageIcon("images/��õ��.jpg"));
			}
			if (month.equals("10") && day.equals("9")) {
				background = new JLabel(new ImageIcon("images/�ѱ۳�.jpg"));
			}
		}
		// �ܿ�
		else if (month.equals("12") || month.equals("1") || month.equals("2")) {
			background = new JLabel(new ImageIcon("images/�ܿ�.jpg"));
			if (month.equals("12") && day.equals("25")) {
				background = new JLabel(new ImageIcon("images/��ź��.jpg"));
			}
			if (month.equals("1") && day.equals("1")) {
				background = new JLabel(new ImageIcon("images/����.jpg"));
			}
		}
		background.setBounds(0, 0, 710, 400);
		super.add(background);
	}

	// �̹��������� ��¥ �� �ٲ�°�
	// ���̵�ã�� ������ �˾�â ����ִ� �� or ���Ϸ� �ޱ�

	public static void main(String[] args) {
	}
}
