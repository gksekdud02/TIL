// ��ǻ�Ͱ��а� 1761013 ���ؼ�
package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JoinMemberShip extends JFrame {
	public static ArrayList<User> userList = new ArrayList<User>();

	// ���̵� ǥ���ϴ� ���̺�, ���̵� �Է¹޴� �ؽ�Ʈ�ʵ�
	// ���̵� ���������� �Է����� �� ��Ÿ���� ���̺�
	JLabel idLabel = new JLabel("���̵�");
	JTextField id = new JTextField("", 20);
	JLabel idCheckText = new JLabel("����");
	// ��й�ȣ�� ǥ���ϴ� ���̺�, ��й�ȣ�� �Է¹޴� �ؽ�Ʈ�ʵ�
	// ��й�ȣ�� ���������� �Է����� �� ��Ÿ���� ���̺�
	JLabel pwLabel = new JLabel("��й�ȣ");
	JTextField pw = new JTextField("", 20);
	JLabel pwCheckText = new JLabel("����");
	// ��й�ȣ ��Ȯ���� ǥ���ϴ� ���̺�, ��й�ȣ ��Ȯ���� �Է¹޴� �ؽ�Ʈ�ʵ�
	// ��й�ȣ ��Ȯ���� ���������� �Է����� �� ��Ÿ���� ���̺�
	JLabel pwCheckLabel = new JLabel("��й�ȣ Ȯ��");
	JTextField pwCheck = new JTextField("", 20);
	JLabel pwCheckTextLabel = new JLabel("����");
	// �̸��� ǥ���ϴ� ���̺�, �̸��� �Է¹޴� �ؽ�Ʈ�ʵ�
	// �̸��� ���������� �Է����� �� ��Ÿ���� ���̺�
	JLabel nameLabel = new JLabel("�̸�");
	JTextField name = new JTextField("", 20);
	JLabel nameCheckText = new JLabel("����");
	// ������ ǥ���ϴ� ���̺�, ������ �Է¹޴� �׷�, ������ ��Ÿ���� ������ư(��,��)
	JLabel genderLabel = new JLabel("����");
	ButtonGroup group = new ButtonGroup();
	JRadioButton man = new JRadioButton("��");
	JRadioButton woman = new JRadioButton("��");
	// ��������� ǥ���ϴ� ���̺�, ��������� �Է¹޴� �ؽ�Ʈ�ʵ�
	// ��������� ���������� �Է����� �� ��Ÿ���� ���̺�
	JLabel birthDateLabel = new JLabel("�������");
	JTextField birthDate = new JTextField("2021-11-01", 20);
	JLabel birthDateText = new JLabel("����");
	// ����ó�� ǥ���ϴ� ���̺�, ����ó�� �Է¹޴� �ؽ�Ʈ�ʵ�
	// ����ó�� ���������� �Է����� �� ��Ÿ���� ���̺�
	JLabel phoneNumberLabel = new JLabel("��ȭ��ȣ");
	JTextField phoneNumber = new JTextField("010-1234-5678", 20);
	JLabel phoneNumberText = new JLabel("����");
	// �ּҸ� ǥ���ϴ� ���̺�, �ּҸ� �Է¹޴� �ؽ�Ʈ�ʵ�
	// �ּҸ� ���������� �Է����� �� ��Ÿ���� ���̺�
	JLabel addressLabel = new JLabel("�ּ�");
	JTextField address = new JTextField("", 20);
	JLabel addressText = new JLabel("�ּ� ����");
	// �̸����� ǥ���ϴ� ���̺�, �̸����� �Է¹޴� �ؽ�Ʈ�ʵ�
	JLabel eMailLabel = new JLabel("�̸���(����)");
	JTextField eMail = new JTextField("", 20);
	// ��й�ȣ ���� �迭, ��й�ȣ ������ ��Ÿ���� ���̺�
	// ��й�ȣ ������ ��Ÿ���� �޺��ڽ�
	String[] pwQuestionArr = { "��￡ ���� �߾��� ��Ҵ�?", "�ڽ��� �λ� �¿����?", "�ڽ��� ���� ��1ȣ��", "���� ��￡ ���� ������ ������?",
			"�λ� ��� ���� å �̸���?", "�ʵ��б� �� ��￡ ���� ¦�� �̸���?", "�޾Ҵ� ���� �� ��￡ ���� ��Ư�� ������?", "������� ���� �������� ģ�� �̸���?",
			"���� �����ϴ� ĳ���ʹ�?", "�ڽ��� �ι�°�� �����ϴ� �ι���?", "�ڽ��� �ٳ�� �ʵ��б� �̸���?", "�ڽ��� �ٳ�� ���б� �̸���?", "�ڽ��� �ٳ�� ����б� �̸���?", };
	JLabel pwQuestionLabel = new JLabel("��й�ȣ ã�� ����/�亯");
	JComboBox<String> pwQuestion = new JComboBox<String>(pwQuestionArr);
	// ��й�ȣ ������ ���� �亯�� �Է¹޴� �ؽ�Ʈ�ʵ�
	// ��й�ȣ ������ ���� �亯�� ���������� �Է����� �� ��Ÿ���� ���̺�
	JTextField pwQuestionAnswer = new JTextField("", 20);
	JLabel pwQuestionAnswerText = new JLabel("����");
	// ȸ������ ��ư, ȸ������ ������ ��Ÿ���� ���̺�
	JButton joinMerbership = new JButton("ȸ������");
	JLabel joinMerbershipText = new JLabel("����");

	public JoinMemberShip(ArrayList<User> user) {
		userList = user;
		// ���� ����, ���� ������ ����� �̺�Ʈ ������ �����ϵ��� ����
		setTitle("ȸ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// �������� ȭ�� �߾ӿ� ��ġ
		setLocationRelativeTo(null);

		// �����̳��� �̸��� c�� ����, ��ġ������ ����
		Container c = getContentPane();
		c.setLayout(null);

		// ���� �ӽ� �Ͼ��
		c.setBackground(Color.WHITE);

		// ��Ʈ ����(����,����,����)
		Color failColor = new Color(250, 0, 0);
		Color successColor = new Color(34, 139, 34);
		Color normalColor = new Color(255, 165, 0);

		// ���̵� ��Ÿ���� ���̺��� ��ġ�� ũ�⼳��
		idLabel.setBounds(20, 40, 100, 30);
		// ���̵� �Է¹޴� �ؽ�Ʈ�ʵ��� ��ġ�� ũ�⼳�� �� ���콺������ ����, Ű ������ ����
		id.setBounds(100, 40, 200, 30);
		id.addMouseListener(new MyMouseListener());
		id.addKeyListener(new KeyAdapter() {
			// Ű�� ����
			public void keyReleased(KeyEvent e) {
				// id�� ������ ���� ���ϵ��� ����
				String idText = id.getText();
				idText = idText.replaceAll(" ", "");
				id.setText(idText);

				if (idText.equals("")) {
					return;
				}

				// ���� �ƹ��� ȸ�������� �������� �ƹ� ���̵� ��밡��, ������, â ǥ��
				if (userList.size() == 0) {
					idCheckText.setText("��밡��");
					idCheckText.setForeground(successColor);
					idCheckText.setVisible(true);
				}
				// ȸ�������� ������ �� ���¶��
				else {
					// ������ �ο���ŭ �ݺ��ϴ� �ݺ���
					for (int i = 0; i < userList.size(); i++) {
						// �� ������ ���̵�� �����ϴٸ�
						if (userList.get(i).getId().equals(idText)) {
							// �ߺ��Ǿ��ٰ� ���̺� ����, ������, â ǥ��
							idCheckText.setText("���Ұ�");
							idCheckText.setForeground(failColor);
							idCheckText.setVisible(true);
						}
						// �� ������ ���̵�� �������� �ʴٸ�
						else {
							// �ߺ��ȵǾ��ٰ� ���̺� ����, ������, â ǥ��
							idCheckText.setText("��밡��");
							idCheckText.setForeground(successColor);
							idCheckText.setVisible(true);
						}
					}
				}
			}
		});
		// ���̵� ���������� �Է����� �� ��Ÿ���� ���̺��� ��ġ����, â�� ǥ������ �ʵ��� ����(�⺻����)
		idCheckText.setBounds(320, 40, 200, 30);
		idCheckText.setVisible(false);

		// ��й�ȣ�� ��Ÿ���� ���̺��� ��ġ�� ũ�⼳��
		pwLabel.setBounds(20, 80, 100, 30);
		// ��й�ȣ�� �Է¹޴� �ؽ�Ʈ�ʵ��� ��ġ�� ũ�⼳��, ���콺������ ����, Ű ������ ����
		pw.setBounds(100, 80, 200, 30);
		pw.addMouseListener(new MyMouseListener());
		pw.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				// ó������ ������ �Է����� ���ϵ��� ����
				String pwText = pw.getText();
				pwText = pwText.replaceAll(" ", "");
				pw.setText(pwText);
				if (pwText.equals("")) {
					return;
				}

				// ���� ��й�ȣ�� Ư�����ڰ� �� ���¶��
				if (pwText.contains("~") || pwText.contains("!") || pwText.contains("@") || pwText.contains("#")
						|| pwText.contains("$") || pwText.contains("%") || pwText.contains("^") || pwText.contains("&")
						|| pwText.contains("*") || pwText.contains("(") || pwText.contains(")") || pwText.contains("<")
						|| pwText.contains(">") || pwText.contains("?") || pwText.contains("|") || pwText.contains("{")
						|| pwText.contains("}")) {
					// ��й�ȣ ���̰� 10�ڸ��� �Ѵ´ٸ�
					if (pwText.length() > 10) {
						// ����(������, â ǥ��)
						pwCheckText.setText("����");
						pwCheckText.setForeground(successColor);
						pwCheckText.setVisible(true);
					}
					// Ư�����ڴ� ������ ��й�ȣ ���̰� 10�ڸ��� ���� �ʴ´ٸ�
					else {
						// ����(������, â ǥ��)
						pwCheckText.setText("����");
						pwCheckText.setForeground(normalColor);
						pwCheckText.setVisible(true);
					}
				}
				// ��й�ȣ�� Ư�����ڰ� ���� ���� ���¶��
				else {
					// ����(���� ����, â ǥ��)
					pwCheckText.setText("����");
					pwCheckText.setForeground(failColor);
					pwCheckText.setVisible(true);
				}
			}
		});
		// ��й�ȣ�� ���������� �Է����� �� ��Ÿ���� ���̺��� ��ġ�� ũ�� ����, â�� �⺻������ �Ⱥ��̵��� ����
		pwCheckText.setBounds(320, 80, 200, 30);
		pwCheckText.setVisible(false);

		// ��й�ȣ�� ��Ȯ���ϴ� ���̺��� ��ġ�� ũ�⼳��
		pwCheckLabel.setBounds(20, 120, 100, 30);
		// ��й�ȣ�� ��Ȯ���ϴ� �ؽ�Ʈ �ʵ��� ��ġ�� ũ�⼳��, ���콺������ ����, Ű ������ ����
		pwCheck.setBounds(100, 120, 200, 30);
		pwCheck.addMouseListener(new MyMouseListener());
		pwCheck.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				// ���� ��й�ȣ�� �����ϴٸ�
				if (pwCheck.getText().equals(pw.getText())) {
					// ��й�ȣ�� �����ϴٴ� ���̺� ����, ���� ����, â ǥ��
					pwCheckTextLabel.setText("��ġ");
					pwCheckTextLabel.setForeground(successColor);
					pwCheckTextLabel.setVisible(true);
				}
				// ��й�ȣ�� �������� �ʴٸ�
				else {
					// ��й�ȣ�� �������� �ʴٴ� ���̺� ����, ���� ����, â ǥ��
					pwCheckTextLabel.setText("����ġ");
					pwCheckTextLabel.setForeground(failColor);
					pwCheckTextLabel.setVisible(true);
				}
			}
		});
		// ��й�ȣ�� ���������� ��Ȯ�� ���� �� ��Ÿ���� ���̺��� ��ġ�� ũ�� ����, â�� �⺻������ �Ⱥ��̵��� ����
		pwCheckTextLabel.setBounds(320, 120, 200, 30);
		pwCheckTextLabel.setVisible(false);

		// �̸��� ��Ÿ���� ���̺��� ��ġ�� ũ�� ����
		nameLabel.setBounds(20, 160, 100, 30);
		// �̸��� �Է¹޴� �ؽ�Ʈ �ʵ��� ��ġ�� ũ�� ����, ���콺������ ����, Ű ������ ����
		name.setBounds(100, 160, 200, 30);
		name.addMouseListener(new MyMouseListener());
		name.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				String text = name.getText();

				// ���� �̸��� �Է¹޴� �ؽ�Ʈ �ʵ尡 ����ִٸ�
				if (text.equals("")) {
					// ��Ȯ���� �ʴٴ� ���̺� ����, ���� ����, â ǥ��
					nameCheckText.setText("�Ұ�");
					nameCheckText.setForeground(failColor);
					nameCheckText.setVisible(true);
				}
				// �̸��� �Է¹޴� �ؽ�Ʈ �ʵ尡 ������� �ʴٸ�
				else {
					// ��Ȯ�ϴٴ� ���̺� ����, ���� ����, â ǥ��
					nameCheckText.setText("����");
					nameCheckText.setForeground(successColor);
					nameCheckText.setVisible(true);
				}
			}
		});
		// �̸��� ���������� �Է����� �� ��Ÿ���� ���̺��� ��ġ�� ũ�� ����, â�� �⺻������ �Ⱥ��̵��� ����
		nameCheckText.setBounds(320, 160, 200, 30);
		nameCheckText.setVisible(false);

		// ������ ��Ÿ���� ���̺��� ��ġ�� ũ�� ����
		genderLabel.setBounds(20, 200, 100, 30);
		// ���� ���� ��ư�� ��ġ�� ũ�� ����, ���� ���� ��ư�� ��ġ�� ũ�� ����
		man.setBounds(100, 200, 50, 30);
		woman.setBounds(150, 200, 50, 30);

		// ��������� ��Ÿ���� ���̺��� ��ġ�� ũ�� ����
		birthDateLabel.setBounds(20, 240, 100, 30);
		// ��������� �Է¹޴� �ؽ�Ʈ �ʵ��� ��ġ�� ũ�� ����, ���콺 ������ ����, Ű ������ ����
		birthDate.setBounds(100, 240, 200, 30);
		birthDate.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				// ���� ��������� ��������� ��Ÿ���� ���� �����Ϳ� �����ϴٸ�
				if (birthDate.getText().equals("2021-11-01"))
					// ���콺�� Ŭ������ �� �����
					birthDate.setText("");
				// ���� �޴��� �ѹ��� ����ִٸ�
				if (phoneNumber.getText().equals(""))
					// ��������� ��Ÿ���� ���� �����͸� ����ֱ�
					phoneNumber.setText("010-1234-5678");
			}
		});
		birthDate.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				String text = birthDate.getText();

				// ��������� �Է¹޴� ���� ����ִٸ�
				if (text.equals("")) {
					// ��Ȯ���� �ʴٴ� ���̺� ����, ���� ����, â ǥ��
					birthDateText.setText("�Ұ�");
					birthDateText.setForeground(failColor);
					birthDateText.setVisible(true);
				}
				// ��������� �Է¹޴� ���� ������� �ʴٸ�
				else {
					// ��Ȯ�ϴٴ� ���̺� ����, ���� ����, â ǥ��
					birthDateText.setText("����");
					birthDateText.setForeground(successColor);
					birthDateText.setVisible(true);
				}
			}
		});
		// ��������� ���������� �Է����� �� ��Ÿ���� ���̺��� ��ġ�� ũ�⼳��, â ǥ��
		birthDateText.setBounds(320, 240, 200, 30);
		birthDateText.setVisible(false);

		// �޴�����ȣ�� ��Ÿ���� ���̺��� ��ġ�� ũ�� ����
		phoneNumberLabel.setBounds(20, 280, 100, 30);
		// �޴�����ȣ�� �Է¹޴� �ؽ�Ʈ �ʵ��� ��ġ�� ũ�� ����, ���콺 ������ ����, Ű ������ ����
		phoneNumber.setBounds(100, 280, 200, 30);
		phoneNumber.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				// ��������� �Է¹޴� ���̺��� ����ִٸ�
				if (birthDate.getText().equals(""))
					// ��������� �����ִ� ���� �����ͷ� ��ü����
					birthDate.setText("2021-11-01");
				// �޴�����ȣ�� �Է¹޴� ���̺��� ���� ������ ���¶��
				if (phoneNumber.getText().equals("010-1234-5678"))
					// ���콺�� ������ �� ���� ���������� ����
					phoneNumber.setText("");
			}
		});
		phoneNumber.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				String text = phoneNumber.getText();

				// ���� ��ȭ��ȣ�� �Է¹޴� ���̺��� ����ִٸ�
				if (text.equals("")) {
					// ��Ȯ���� �ʴٴ� ���̺� ����, ���� ����, â ǥ��
					phoneNumberText.setText("�Ұ�");
					phoneNumberText.setForeground(failColor);
					phoneNumberText.setVisible(true);
				}
				// ��ȭ��ȣ�� �Է¹޴� ���̺��� ������� �ʴٸ�
				else {
					// ��Ȯ�ϴٴ� ���̺� ����, ���� ����, â ǥ��
					phoneNumberText.setText("����");
					phoneNumberText.setForeground(successColor);
					phoneNumberText.setVisible(true);
				}
			}
		});
		// ��ȭ��ȣ�� ���������� �Է����� �� ��Ÿ���� ���̺��� ��ġ�� ũ�� ����, â�� �⺻������ �Ⱥ��̵��� ����
		phoneNumberText.setBounds(320, 280, 200, 30);
		phoneNumberText.setVisible(false);

		// �ּҸ� ��Ÿ���� ���̺��� ��ġ�� ũ�� ����
		addressLabel.setBounds(20, 320, 100, 30);
		// �ּҸ� �Է¹޴� �ؽ�Ʈ �ʵ��� ��ġ�� ũ�� ����, ���콺 ������ ����, Ű ������ ����
		address.setBounds(100, 320, 200, 30);
		address.addMouseListener(new MyMouseListener());
		address.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				String text = address.getText();
				// ���� �ּҸ� �Է¹޴� �ؽ�Ʈ �ʵ尡 ����ִٸ�
				if (text.equals("")) {
					// ��Ȯ���� �ʴٴ� ���̺� ����, ���� ����, â ǥ��
					addressText.setText("�Ұ�");
					addressText.setForeground(failColor);
					addressText.setVisible(true);
				}
				// �ּҸ� �Է¹޴� �ؽ�Ʈ �ʵ尡 ������� �ʴٸ�
				else {
					// ��Ȯ�ϴٴ� ���̺� ����, ���� ����, â ǥ��
					addressText.setText("����");
					addressText.setForeground(successColor);
					addressText.setVisible(true);
				}
			}
		});
		// �ּҸ� ���������� �Է����� �� ��Ÿ���� ���̺��� ��ġ�� ũ�� ����, â�� �⺻������ �Ⱥ��̵��� ����
		addressText.setBounds(320, 320, 200, 30);
		addressText.setVisible(false);

		// �̸����� ��Ÿ���� ���̺��� ��ġ�� ũ�� ����
		eMailLabel.setBounds(20, 360, 100, 30);
		// �̸����� �Է¹޴� �ؽ�Ʈ �ʵ��� ��ġ�� ũ�� ����, ���콺 ������ ����
		eMail.setBounds(100, 360, 200, 30);
		eMail.addMouseListener(new MyMouseListener());

		// ��й�ȣã�� ������ ��Ÿ���� ���̺��� ��ġ�� ũ�� ����
		pwQuestionLabel.setBounds(20, 400, 200, 30);
		// ��й�ȣã�� ������ �����ִ� �޺��ڽ��� ��ġ�� ũ�� ����
		pwQuestion.setBounds(20, 440, 300, 30);

		// ��й�ȣã�� �亯�� �Է¹޴� �ؽ�Ʈ �ʵ��� ��ġ�� ũ�� ����, ���콺 ������ ����, Ű ������ ����
		pwQuestionAnswer.setBounds(20, 480, 300, 30);
		pwQuestionAnswer.addMouseListener(new MyMouseListener());
		pwQuestionAnswer.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				String text = pwQuestionAnswer.getText();

				// ���� ��й�ȣã�� �亯�� �Է¹޴� �ؽ�Ʈ �ʵ尡 ����ִٸ�
				if (text.equals("")) {
					// ��Ȯ���� �ʴٴ� ���̺� ����, ���� ����, â ǥ��
					pwQuestionAnswerText.setText("�Ұ�");
					pwQuestionAnswerText.setForeground(failColor);
					pwQuestionAnswerText.setVisible(true);
				}
				// ��й�ȣã�� �亯�� ��Ÿ���� �ؽ�Ʈ �ʵ尡 ������� �ʴٸ�
				else {
					// ��Ȯ�ϴٴ� ���̺� ����, ���� ����, â ǥ��
					pwQuestionAnswerText.setText("����");
					pwQuestionAnswerText.setForeground(successColor);
					pwQuestionAnswerText.setVisible(true);
				}
			}
		});
		// ��й�ȣ�� ���������� �Է����� �� ��Ÿ���� ���̺��� ��ġ�� ũ�� ����, â�� �⺻������ �Ⱥ��̵��� ����
		pwQuestionAnswerText.setBounds(340, 480, 200, 30);
		pwQuestionAnswerText.setVisible(false);

		// ȸ������ ��ư�� ��ġ�� ũ�⼳�� �׼� ������ ����
		joinMerbership.setBounds(130, 520, 100, 50);
		joinMerbership.addActionListener(new MyActionListener());
		// ȸ�������� ���������� �Ϸ����� �� ��Ÿ���� ���̺��� ��ġ�� ũ�� ����, â�� �⺻������ �Ⱥ��̵��� ����
		joinMerbershipText.setBounds(250, 530, 200, 30);
		joinMerbershipText.setVisible(false);

		// ����
		JButton backButton = new JButton("����");
		backButton.setBounds(10, 10, 60, 25);
		backButton.setBackground(Color.WHITE);
		backButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new Login();
			}
		});

		// ������ư �����̳� ����
		c.add(backButton);

		// id�� ���õ� ������Ʈ�� �����̳ʿ� ����
		c.add(idLabel);
		c.add(id);
		c.add(idCheckText);

		// pw�� ���õ� ������Ʈ�� �����̳ʿ� ����
		c.add(pwLabel);
		c.add(pw);
		c.add(pwCheckText);

		// pwCheck�� ���õ� ������Ʈ�� �����̳ʿ� ����
		c.add(pwCheckLabel);
		c.add(pwCheck);
		c.add(pwCheckTextLabel);

		// name�� ���õ� ������Ʈ�� �����̳ʿ� ����
		c.add(nameLabel);
		c.add(name);
		c.add(nameCheckText);

		// ������ ���õ� ������Ʈ�� �����̳ʿ� ����
		c.add(genderLabel);
		group.add(man);
		group.add(woman);
		c.add(man);
		c.add(woman);

		// ������Ͽ� ���õ� ������Ʈ�� �����̳ʿ� ����
		c.add(birthDateLabel);
		c.add(birthDate);
		c.add(birthDateText);

		// ��ȭ��ȣ�� ���õ� ������Ʈ�� �����̳ʿ� ����
		c.add(phoneNumberLabel);
		c.add(phoneNumber);
		c.add(phoneNumberText);

		// �ּҿ� ���õ� ������Ʈ�� �����̳ʿ� ����
		c.add(addressLabel);
		c.add(address);
		c.add(addressText);

		// �̸��Ͽ� ���õ� ������Ʈ�� �����̳ʿ� ����
		c.add(eMailLabel);
		c.add(eMail);

		// ��й�ȣã�� ������ ���õ� ������Ʈ�� �����̳ʿ� ����
		c.add(pwQuestionLabel);
		c.add(pwQuestion);

		// ��й�ȣã�� �亯�� ���õ� ������Ʈ�� �����̳ʿ� ����
		c.add(pwQuestionAnswer);
		c.add(pwQuestionAnswerText);

		// ȸ�����Կ� ���õ� ������Ʈ�� �����̳ʿ� ����
		c.add(joinMerbership);
		c.add(joinMerbershipText);

		// ������ ����(350,550), â ���
		setSize(400, 630);
		setVisible(true);

		// �ܼ�â�� ����ϱ� ���ؼ� ����
//		programRun();
	}

	// ���콺������(����Ŭ������ ����)
	// ������ϰ� ��ȭ��ȣ�� ���� �����͸� �����ִµ� ����ڰ� ���� �����͸� �����ϰ� �ƹ��͵� �Է����� ���� ��� �ٽ� ���� �����͸� �����ֵ���
	// ����
	class MyMouseListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			// ��������� �Է¹޴� �ؽ�Ʈ �ʵ尡 ����ִٸ�
			if (birthDate.getText().equals("")) {
				// ��������� �Է¹޴� �ؽ�Ʈ �ʵ忡 ���� �����͸� �߰�
				birthDate.setText("2021-11-01");
			}
			// ��ȭ��ȣ�� �Է¹޴� �ؽ�Ʈ �ʵ尡 ����ִٸ�
			if (phoneNumber.getText().equals("")) {
				// ��ȭ��ȣ�� �Է¹޴� �ؽ�Ʈ �ʵ忡 ���� �����͸� �߰�
				phoneNumber.setText("010-1234-5678");
			}
		}
	}

	// �׼Ǹ�����(����Ŭ������ ����)
	// ȸ�����Կ� ���õ� �׸���� ��� �����ϰ� ȸ������ ��ư�� ������ �� ȸ�������� �ǵ��� ����
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// ȸ������ ���õ� �׸���� ������� ���� �޾ƿ�
			String idTextTemp = id.getText();
			String pwTextTemp = pw.getText();
			String nameTextTemp = name.getText();
			String genderTextTemp = "����";
			if (man.isSelected()) {
				genderTextTemp = "����";
			} else if (woman.isSelected()) {
				genderTextTemp = "����";
			}
			String birthDateTextTemp = birthDate.getText();
			String phoneNumberTextTemp = phoneNumber.getText();
			String addressTextTemp = address.getText();
			String eMailTextTemp = eMail.getText();
			String pwQuestionTextTemp = pwQuestion.getSelectedItem().toString();
			String pwQuestionAnswerTextTemp = pwQuestionAnswer.getText();

			// ���� ����
			Color color = new Color(139, 0, 0);
			Color failColor = new Color(255, 0, 0);

			// �׸���� �������� �ʾ��� ��� üũ�ϴ� ����
			// �׸���� �߸� �������� ��� üũ�ϴ� ����
			boolean emptyLabel = true;
			boolean falutLabel = true;

			// �׸���� �������� �ʾ��� ��� �����ϴ� �ڵ��
			// �׸��� ���¸� ��Ÿ���� ���̺��� ������ ���� (�ۼ�)
			// �׸��� ���¸� ��Ÿ���� ���̺��� ���� ����
			// �׸��� ���¸� ��Ÿ���� ���̺��� â ǥ��
			// ��� ���������� ������ �Ͽ��ٸ� emptyLabel�� false���·� ����
			if (idCheckText.isVisible() == false) {
				idCheckText.setText("�ۼ�");
				idCheckText.setForeground(failColor);
				idCheckText.setVisible(true);
			} else if (pwCheckText.isVisible() == false) {
				pwCheckText.setText("�ۼ�");
				pwCheckText.setForeground(failColor);
				pwCheckText.setVisible(true);
			} else if (pwCheckTextLabel.isVisible() == false) {
				pwCheckTextLabel.setText("�ۼ�");
				pwCheckTextLabel.setForeground(failColor);
				pwCheckTextLabel.setVisible(true);
			} else if (nameCheckText.isVisible() == false) {
				nameCheckText.setText("�ۼ�");
				nameCheckText.setForeground(failColor);
				nameCheckText.setVisible(true);
			} else if (birthDateText.isVisible() == false) {
				birthDateText.setText("�ۼ�");
				birthDateText.setForeground(failColor);
				birthDateText.setVisible(true);
			} else if (phoneNumberText.isVisible() == false) {
				phoneNumberText.setText("�ۼ�");
				phoneNumberText.setForeground(failColor);
				phoneNumberText.setVisible(true);
			} else if (addressText.isVisible() == false) {
				addressText.setText("�ۼ�");
				addressText.setForeground(failColor);
				addressText.setVisible(true);
			} else if (pwQuestionAnswerText.isVisible() == false) {
				pwQuestionAnswerText.setText("�ۼ�");
				pwQuestionAnswerText.setForeground(failColor);
				pwQuestionAnswerText.setVisible(true);
			} else {
				emptyLabel = false;
			}

			// �׸���� �߸� �������� ��� �����ϴ� �ڵ��
			// �׸��� ���¸� ��Ÿ���� ���̺��� ������ ���� (�ۼ�)
			// �׸��� ���¸� ��Ÿ���� ���̺��� ���� ����
			// �׸��� ���¸� ��Ÿ���� ���̺��� â ǥ��
			// ��� ���������� ������ �Ͽ��ٸ� falutLabel�� false���·� ����
			if (idCheckText.getText() == "���Ұ�") {
				idCheckText.setText("���ۼ�");
				idCheckText.setForeground(color);
				idCheckText.setVisible(true);
			} else if (pwCheckText.getText() == "����") {
				pwCheckText.setText("���ۼ�");
				pwCheckText.setForeground(color);
			} else if (pwCheckTextLabel.getText().equals("����ġ")) {
				pwCheckTextLabel.setText("���ۼ�");
				pwCheckTextLabel.setForeground(color);
			} else if (nameCheckText.getText().equals("�Ұ�")) {
				nameCheckText.setText("���ۼ�");
				nameCheckText.setForeground(color);
			} else if (genderTextTemp.equals("")) {
				idCheckText.setText("���ۼ�");
			} else if (birthDateText.equals("�Ұ�")) {
				birthDateText.setText("���ۼ�");
				birthDateText.setForeground(color);
			} else if (phoneNumberText.getText().equals("�Ұ�")) {
				phoneNumberText.setText("���ۼ�");
				phoneNumberText.setForeground(color);
			} else if (addressText.getText().equals("�Ұ�")) {
				addressText.setText("���ۼ�");
				addressText.setForeground(color);
			} else if (pwQuestionAnswerText.getText().equals("�Ұ�")) {
				pwQuestionAnswerText.setText("���ۼ�");
				pwQuestionAnswerText.setForeground(color);
			} else {
				falutLabel = false;
			}

			// �׸���� ��� ���������� �����ߴٸ�
			if (emptyLabel == false && falutLabel == false) {
				// User�� ��ü�� �����ϰ� �����ڿ� ȸ������ �����ؼ� �޾ƿ� ������� �Ű������� �־���
				User user = new User(idTextTemp, pwTextTemp, nameTextTemp, genderTextTemp, birthDateTextTemp,
						phoneNumberTextTemp, addressTextTemp, eMailTextTemp, pwQuestionTextTemp,
						pwQuestionAnswerTextTemp);
				// ArrayList�� ������ userList�� ��ü�߰�
				userList.add(user);

				// ȸ�������� ���������� ���� ��� ��Ÿ���� ���̺��� ����
				Color c = new Color(0, 255, 0);

				// ȸ�������� ���������� ���� ��� ��Ÿ���� ���̺��� ���ڿ�����, ���� ����, â ǥ��
				joinMerbershipText.setText("ȸ������ ����!!");
				joinMerbershipText.setBackground(c);
				joinMerbershipText.setVisible(true);

				setVisible(false);
				new Login(userList);
			}
		}
	}

	// ȸ�������� User�� ������� �ַܼ� ����ϱ� ���� ���� �޼ҵ�
	public void programRun() {
		Scanner scan = new Scanner(System.in);
		// ���ѹݺ���
		while (true) {
			System.out.print("1. �α��� 2.���� : ");
			String text = scan.next();

			// �Է¹��� ���� "1"�̶�� �α���
			if (text.equals("1")) {
				// ���̵�� ��й�ȣ�� �Է¹���
				System.out.print("���̵� : ");
				String idTemp = scan.next();
				System.out.print("��й�ȣ : ");
				String pwTemp = scan.next();

				// ArrayList�� �ִ� User�� �� ���̵�� ��й�ȣ�� ������ ��ü�� ��ȸ�ϰ� index��ȣ�� ������ �޾ƿ�
				boolean idCheck = false;
				boolean pwCheck = false;
				int index = -1;
				// ArrayList�� �ִ� ��ü���� ������ŭ �ݺ�
				for (int i = 0; i < userList.size(); i++) {
					if (idTemp.equals(userList.get(i).getId())) {
						idCheck = true;
					}
					if (idCheck == true && pwTemp.equals(userList.get(i).getPw())) {
						pwCheck = true;
						index = i;
						break;
					}
					idCheck = false;
					pwCheck = false;

					// ���������� �� ��ü�� ���̵�� ��й�ȣ�� ����ڰ� �Է��� ���̵�� ��й�ȣ�� �����ؾ� boolean ������ ��� true���·� ���ϰ�
					// index ��ȣ�� �޾ƿ� �� �ݺ����� �����
				}

				if (idCheck == false && pwCheck == false)
					System.out.println("���̵� Ȥ�� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");

				// boolean������ ��� true���¶�� �α��� ����
				if (idCheck == true && pwCheck == true) {
					// ���ѹݺ���
					while (true) {
						System.out.print("1. ���� ��� ���� ���� 2. �α��� ȭ������ ���ư��� : ");
						text = scan.next();

						// �Է¹��� ���� "1"�� ��� ������ ��� ������ ���
						if (text.equals("1")) {
							System.out.println("���̵� : " + userList.get(index).getId());
							System.out.println("��й�ȣ : " + userList.get(index).getPw());
							System.out.println("�̸� : " + userList.get(index).getName());
							System.out.println("���� : " + userList.get(index).getGender());
							System.out.println("������� : " + userList.get(index).getBirthDate());
							System.out.println("�޴�����ȣ : " + userList.get(index).getPhoneNumber());
							System.out.println("�ּ� : " + userList.get(index).getAddress());
							System.out.println("�̸��� : " + userList.get(index).geteMail());
							System.out.println("��й�ȣã�� ���� : " + userList.get(index).getPwQuestion());
							System.out.println("��й�ȣã�� �亯 : " + userList.get(index).getPwQuestionAnswer());
						}
						// �Է¹��� ���� "2"��� �α��� ȭ������ ���ư�
						else if (text.equals("2")) {
							System.out.println("-----     -----");
							System.out.println("�α��� ȭ������ ���ư��ϴ�");
							System.out.println("-----     -----");
							break;
						}
					}
				}
			}
			// �Է¹��� ���� "2"��� ���α׷��� ����(���� �����嵵 ���� ����)
			else if (text.equals("2")) {
				System.out.println("-----     -----");
				System.out.println("���α׷� ����(���ν����嵵 �����մϴ�)");
				System.out.println("-----     -----");
				System.exit(ABORT);
				break;

			}
		}
	}

	// �̹��� ����� �°� �߰��ϱ�.

	public static void main(String[] args) {
	}
}