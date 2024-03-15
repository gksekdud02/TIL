package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FindPw extends JFrame {
	public static ArrayList<User> userList = new ArrayList<User>();

	public FindPw(ArrayList<User> user) {
		userList = user;
		System.out.println(userList.size());
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

		// ���̵�
		JLabel idLabel = new JLabel("���̵�");
		idLabel.setForeground(Color.WHITE);
		idLabel.setBounds(250, 56, 295, 30);

		JTextField idTextField = new JTextField();
		idTextField.setBounds(250, 86, 250, 40);
		// �̸�
		JLabel nameLabel = new JLabel("�̸�");
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setBounds(250, 136, 295, 30);

		JTextField nameTextField = new JTextField();
		nameTextField.setBounds(250, 166, 250, 40);
		// �޴��� ��ȣ
		JLabel phoneLabel = new JLabel("�޴��� ��ȣ");
		phoneLabel.setForeground(Color.WHITE);
		phoneLabel.setBounds(250, 216, 295, 30);

		JTextField phoneTextField = new JTextField();
		phoneTextField.setBounds(250, 246, 250, 40);

		// ��й�ȣ ã��
		RoundedButton findPwButton = new RoundedButton("��й�ȣ ã��");
		//JButton findPwButton = new JButton("��й�ȣ ã��");
		findPwButton.setBackground(Color.WHITE);
		findPwButton.setBounds(305, 306, 140, 40);
		findPwButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				String id = idTextField.getText();
				String name = nameTextField.getText();
				String phone = phoneTextField.getText();

//				System.out.println(id + " " + name + " " + phone);
//				System.out.println(userList.get(0).getId() + " " + userList.get(0).getName() + " "
//						+ userList.get(0).getPhoneNumber());

				boolean check = false;
				for (int i = 0; i < userList.size(); i++) {
					if (userList.get(i).getId().equals(id)) {
						if (userList.get(i).getName().equals(name)) {
							if (userList.get(i).getPhoneNumber().equals(phone)) {
								JOptionPane.showMessageDialog(null, "��й�ȣ : " + userList.get(i).getPw());
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
		c.add(idLabel);
		c.add(idTextField);
		c.add(nameLabel);
		c.add(nameTextField);
		c.add(phoneLabel);
		c.add(phoneTextField);
		c.add(findPwButton);

		backgroundImage();

		setSize(710, 400);
		setVisible(true);
	}

	// 12��~2�� �ܿ� 3��~5�� �� 6��~8�� ���� 9��~11�� ����
	// ����(1/1) ������(3/1) ��̳�(5/5) ������(6/6) ������(8/15) ��õ��(10/3) �ѱ۳�(10/9) ��ź��(12/25)
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
	// ��й�ȣ ã�� ������ ���Ϸ� �ޱ� �ܺ� jar���� �ҷ����°� �ñ��� �ڲ� ������
	// ���Ϸ� �ް� ������..

	// �ܺ� jar �����Կ��� ���庸��
	public static void main(String[] args) {
	}
}
