//일지 작성하는 걸로 만들기

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class NotePad extends JFrame {
	JTextArea tf1 = new JTextArea(20,60);
	JTextField tf2 = new JTextField(20);
	
	JButton b1  = new JButton("열기");
	JButton b2 = new JButton("저장");
	JButton b3 = new JButton("새로 만들기");
	
	public NotePad() {
		setTitle("메모장");
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
				fr = new FileReader(tf2.getText()); //문자 입력 스트림 생성
			} catch (FileNotFoundException e2) { //파일이 없으면 에러메세지창 띄우기
				JOptionPane.showMessageDialog(null,"파일이 없습니다.","Message",JOptionPane.ERROR_MESSAGE);
				e2.printStackTrace();
			}
			BufferedReader br = new BufferedReader(fr); 
			try { //파일이 있을 때
				String c=null;
				tf1.setText(""); //초기화 시킴
				while((c=br.readLine())!=null) { 
					tf1.append(c); 
				}
				fr.close();
				br.close();
			}catch(IOException e1) {
				JOptionPane.showMessageDialog(null,"열기 실패","Message",JOptionPane.ERROR_MESSAGE);
			}
		}
	
	}
	
	private class MyActionListener2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try {
				File file = new File(tf2.getText()); //tf2의 경로로 파일 만들기
				FileWriter fw = new FileWriter(file, true); 
				fw.write(tf1.getText()); //tf1에 저장되어 있는 문자를 파일에 저장
				
				fw.close();
			}catch(IOException e1) {
				JOptionPane.showMessageDialog(null,"저장 실패","Message",JOptionPane.ERROR_MESSAGE);
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

