import javax.swing.*;
import java.awt.*; //그래픽 처리를 위한 클래스들의 경로명

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프래임 윈도우를 닫으면 프로그램 종료
		
		Container contentPane = getContentPane(); //컨텐트팬을 알아낸다
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,30,30)); //컨텐트팬에 FlowLayout 배치관리자 달기
		
		contentPane.add(new JButton("ok")); //버튼 달기
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JButton("ok"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JButton("ok"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
