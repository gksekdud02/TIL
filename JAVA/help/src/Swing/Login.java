package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
	// ȸ������ ����
	public static ArrayList<User> userList = new ArrayList<User>();
	User u = new User("123", "123", "���ؼ�", "��", "1998-03-08", "010-9206-9486", "���� ���� ������ 543-16",
			"dotdotot203@naver.com", "���� 1ȣ��?", "����");
	// �������ͷ� �α����ϴ� ��

	Login() {
		userList.add(u);
		// ������ ����, ���� ������ ����� �̺�Ʈ �����ӵ� �����ϵ��� ����
		setTitle("�α���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// �������� ȭ�� �߾ӿ� ��ġ
		setLocationRelativeTo(null);

		// Main�����̳� �̸��� c�� ����, ��ġ������ ����, ��׶��� ����
		Container c = getContentPane();
		c.setLayout(null);

		// �λ�
		Font welcomeFont = new Font("�ü�ü", Font.PLAIN, 30);
		Font textFont = new Font("���ڸ�ü", Font.ITALIC, 12);
		JLabel welcome = new JLabel("Heading");
		welcome.setBounds(50, 70, 200, 30);
		welcome.setFont(welcomeFont);
		JLabel text1 = new JLabel("Lorem ipsum dolor sit amet, consectetur");
		text1.setBounds(50, 120, 300, 20);
		text1.setFont(textFont);
		JLabel text2 = new JLabel("adipisicing elit, sed do eiusmod tempor");
		text2.setBounds(50, 140, 300, 20);
		text2.setFont(textFont);
		JLabel text3 = new JLabel("incididunt ut labore et dolore magna aliqua.");
		text3.setBounds(50, 160, 300, 20);
		text3.setFont(textFont);

		welcome.setForeground(Color.WHITE);
		text1.setForeground(Color.WHITE);
		text2.setForeground(Color.WHITE);
		text3.setForeground(Color.WHITE);

		// ID
		Font idFont = new Font("���ڸ�ü", Font.ITALIC, 13);
		JTextField idTextField = new JTextField();
		idTextField.setBounds(410, 100, 250, 40);
		idTextField.setBackground(Color.WHITE);
		idTextField.setFont(idFont);

		// PW
		Font pwFont = new Font("���ڸ�ü", Font.ITALIC, 13);
		JPasswordField pwTextField = new JPasswordField();
		pwTextField.setBounds(410, 160, 250, 40);
		pwTextField.setBackground(Color.WHITE);
		pwTextField.setFont(pwFont);

		// ȸ������
		RoundedButton joinMembershipButton = new RoundedButton("ȸ������");
		//JButton joinMembershipButton = new JButton("ȸ������");
		joinMembershipButton.setBounds(50, 240, 250, 40);
		joinMembershipButton.setBackground(Color.WHITE);
		joinMembershipButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new JoinMemberShip(userList);
			}
		});

		// �α���
		RoundedButton loginButton = new RoundedButton("�α���");
		//JButton loginButton = new JButton("�α���");
		loginButton.setBounds(410, 240, 250, 40);
		loginButton.setBackground(Color.WHITE);
		loginButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				String id = idTextField.getText();
				String pw = pwTextField.getText();
				boolean check = false;
				User user = new User();

				// userList�� id�� pw�� �����ϴ��� Ȯ��
				for (int i = 0; i < userList.size(); i++) {
					if (userList.get(i).getId().equals(id)) {
						if (userList.get(i).getPw().equals(pw)) {
							user = userList.get(i);
							check = true;
							break;
						}
					}
				}

				// �α��� ����
				if (check == true) {
					setVisible(false);
					new Main(user);
				}
				// �α��� ����
				else {
					JOptionPane.showMessageDialog(null, "���̵� Ȥ�� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
			}
		});

		// ���̵� ã��
		RoundedButton findIdButton = new RoundedButton("���̵� ã��");
		//JButton findIdButton = new JButton("���̵� ã��");
		findIdButton.setBounds(50, 290, 250, 40);
		findIdButton.setBackground(Color.WHITE);
		findIdButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new FindId(userList);
			}
		});

		// ��й�ȣ ã��
		RoundedButton findpwButton = new RoundedButton("��й�ȣ ã��");
		//JButton findpwButton = new JButton("��й�ȣ ã��");
		findpwButton.setBounds(410, 290, 250, 40);
		findpwButton.setBackground(Color.WHITE);
		findpwButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new FindPw(userList);
			}
		});

		c.add(welcome);
		c.add(text1);
		c.add(text2);
		c.add(text3);
		c.add(idTextField);
		c.add(pwTextField);
		c.add(joinMembershipButton);
		c.add(loginButton);
		c.add(findIdButton);
		c.add(findpwButton);

		// ���ȭ�� ����
		backgroundImage();

		// ������� �� ������ ���� ����
		setSize(710, 400);
		// setUndecorated(true); // ���� ����
		setResizable(false); // ũ�� ���� �Ұ����ϵ��� ��
		setVisible(true); // â ǥ��

	}

	// ȸ������ �� ������ ArrayList�� �����;��ϹǷ� �������� ������
	Login(ArrayList<User> user) {
		userList = user;
		// ���� ȣ��
		this.main(null);
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
		if (month.equals("03") || month.equals("04") || month.equals("05")) {
			background = new JLabel(new ImageIcon("images/��.jpg"));
			if (month.equals("03") && day.equals("01")) {
				background = new JLabel(new ImageIcon("images/������.jpg"));
			}
			if (month.equals("05") && day.equals("05")) {
				background = new JLabel(new ImageIcon("images/��̳�.jpg"));
			}
		}
		// ����
		else if (month.equals("06") || month.equals("07") || month.equals("08")) {
			background = new JLabel(new ImageIcon("images/����.jpg"));
			if (month.equals("06") && day.equals("06")) {
				background = new JLabel(new ImageIcon("images/������.jpg"));
			}
			if (month.equals("06") && day.equals("08")) {
				background = new JLabel(new ImageIcon("images/�κ�.jpg"));
			}
			if (month.equals("08") && day.equals("15")) {
				background = new JLabel(new ImageIcon("images/������.jpg"));
			}
		}
		// ����
		else if (month.equals("09") || month.equals("10") || month.equals("11")) {
			background = new JLabel(new ImageIcon("images/����.jpg"));
			if (month.equals("10") && day.equals("03")) {
				background = new JLabel(new ImageIcon("images/��õ��.jpg"));
			}
			if (month.equals("10") && day.equals("09")) {
				background = new JLabel(new ImageIcon("images/�ѱ۳�.jpg"));
			}
		}
		// �ܿ�
		else if (month.equals("12") || month.equals("01") || month.equals("02")) {
			background = new JLabel(new ImageIcon("images/�ܿ�.jpg"));
			if (month.equals("12") && day.equals("25")) {
				background = new JLabel(new ImageIcon("images/��ź��.jpg"));
			}
			if (month.equals("01") && day.equals("01")) {
				background = new JLabel(new ImageIcon("images/����.jpg"));
			}
		}
		background.setBounds(0, 0, 710, 400);
		super.add(background);
	}

	// �̹��������� ��¥ �� �ٲ�°�

	public static void main(String[] args) {
		new Login();
	}

}
