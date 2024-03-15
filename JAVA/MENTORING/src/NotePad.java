//���� �ۼ��ϴ� �ɷ� �����

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class NotePad extends JFrame {
	JTextArea tf1 = new JTextArea(20,60);
	JTextField tf2 = new JTextField(20);
	
	JButton b1  = new JButton("����");
	JButton b2 = new JButton("����");
	JButton b3 = new JButton("���� �����");
	
	public NotePad() {
		setTitle("�޸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		b1.setSize(80,40);
		b1.addActionListener(new MyActionListener());

		b2.setSize(80,40);
		b2.addActionListener(new MyActionListener2());
		
		b3.setSize(80,40);
		b3.addActionListener(new MyActionListener3());
		
		c.add(tf1);
		c.add(tf2);
		c.add(b1);
		c.add(b2);
		c.add(b3);
		
		setSize(800,500);
		setVisible(true);
		
	}
	private class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			FileReader fr = null;
			try {
				fr = new FileReader(tf2.getText()); //���� �Է� ��Ʈ�� ����
			} catch (FileNotFoundException e2) { //������ ������ �����޼���â ����
				JOptionPane.showMessageDialog(null,"������ �����ϴ�.","Message",JOptionPane.ERROR_MESSAGE);
				e2.printStackTrace();
			}
			BufferedReader br = new BufferedReader(fr); 
			try { //������ ���� ��
				String c=null;
				tf1.setText(""); //�ʱ�ȭ ��Ŵ
				while((c=br.readLine())!=null) { 
					tf1.append(c); 
				}
				fr.close();
				br.close();
			}catch(IOException e1) {
				JOptionPane.showMessageDialog(null,"���� ����","Message",JOptionPane.ERROR_MESSAGE);
			}
		}
	
	}
	
	private class MyActionListener2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try {
				File file = new File(tf2.getText()); //tf2�� ��η� ���� �����
				FileWriter fw = new FileWriter(file, true); 
				fw.write(tf1.getText()); //tf1�� ����Ǿ� �ִ� ���ڸ� ���Ͽ� ����
				
				fw.close();
			}catch(IOException e1) {
				JOptionPane.showMessageDialog(null,"���� ����","Message",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	private class MyActionListener3 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			tf1.setText(null);
			tf2.setText(null);
		}
	}
	
	public static void main(String[] args) {
		new NotePad();
	}
}

