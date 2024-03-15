package Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Refund_Main extends JFrame {
	// �ŷ���ȣ �Է�
	JLabel transactionNumberLabel = new JLabel("�ŷ���ȣ");
	JTextField transactionNumberTextField = new JTextField();

	public Refund_Main() {
		// ���� ����, ���� ������ ����� �̺�Ʈ �����嵵 �����ϵ��� ����
		setTitle("ȯ��");
		// ���� ������ ���� ����

		// �������� ȭ�� �߾ӿ� ��ġ
		setLocationRelativeTo(null);

		// Main�����̳� �̸��� c�� ����, ��ġ������ ����, ��׶��� ����
		Container c = getContentPane();
		c.setLayout(null);
		// �ϴ� �Ͼ������ ���� ����, ���� �̹����� �ٲ� ����
		c.setBackground(Color.WHITE);

		// ���
		JButton cancelButton = new JButton("���");
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setBounds(10, 10, 60, 30);
		cancelButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
			}
		});

		// ȯ��
		JButton refundButton = new JButton("ȯ��");
		refundButton.setBackground(Color.WHITE);
		refundButton.setBounds(320, 10, 60, 30);
		refundButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				String transaction = transactionNumberTextField.getText();
				// ȯ�� ����
				if (true) {
					// ��ο��� �����ϰ� ������ ���̴� �ڵ尡 ������

					// ------------------------------------

					// ȯ�� ���� ��
					setVisible(false);
					new RefundSuccess();
				}
				// ȯ�� ����
				else {
					// ȯ�� ���� ��
					setVisible(false);
					new RefundFail();
				}
			}
		});

		transactionNumberLabel.setBounds(10, 70, 200, 20);
		transactionNumberTextField.setBounds(80, 70, 200, 20);

		c.add(cancelButton);
		c.add(refundButton);
		c.add(transactionNumberLabel);
		c.add(transactionNumberTextField);

		setSize(400, 200);
		setVisible(true);
	}
}

class RefundSuccess extends JFrame {
	public RefundSuccess() {
		// ���� ����, ���� ������ ����� �̺�Ʈ �����嵵 �����ϵ��� ����
		setTitle("ȯ�� ����");

		// �������� ȭ�� �߾ӿ� ��ġ
		setLocationRelativeTo(null);

		// Main�����̳� �̸��� c�� ����, ��ġ������ ����, ��׶��� ����
		Container c = getContentPane();
		c.setLayout(null);
		// �ϴ� �Ͼ������ ���� ����, ���� �̹����� �ٲ� ����
		c.setBackground(Color.WHITE);

		Font textFont = new Font("���ڸ�ü", Font.ITALIC, 80);

		JLabel success = new JLabel("����!!");
		success.setFont(textFont);
		success.setBounds(80, 40, 250, 80);

		c.add(success);

		setSize(400, 200);
		setVisible(true);
	}
}

class RefundFail extends JFrame {
	public RefundFail() {
		// ���� ����, ���� ������ ����� �̺�Ʈ �����嵵 �����ϵ��� ����
		setTitle("ȯ�� ����");

		// �������� ȭ�� �߾ӿ� ��ġ
		setLocationRelativeTo(null);

		// Main�����̳� �̸��� c�� ����, ��ġ������ ����, ��׶��� ����
		Container c = getContentPane();
		c.setLayout(null);
		// �ϴ� �Ͼ������ ���� ����, ���� �̹����� �ٲ� ����
		c.setBackground(Color.WHITE);

		Font textFont = new Font("���ڸ�ü", Font.ITALIC, 80);

		JLabel success = new JLabel("����..");
		success.setFont(textFont);
		success.setBounds(80, 40, 250, 80);

		c.add(success);

		setSize(400, 200);
		setVisible(true);
	}
}

public class Refund {
	public static void main(String[] args) {
		new Refund_Main();
	}
}
