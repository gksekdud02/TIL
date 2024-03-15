import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제"); //프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 윈도우를 닫으면 프로그램 종료
		Container c = getContentPane(); //컨텐트팬 알아내기
		c.setLayout(new FlowLayout()); //컨텐트팬에 FlowLayout 배치관리자 생성
		JButton btn = new JButton("Action"); //Action 버튼 컴포넌트 생성
		btn.addActionListener(new MyActionListener()); //Action 리스너 달기
		c.add(btn); //컨텐트팬에 버튼 부착
		
		setSize(350,150);//프레임 크기 350x150 설정
		setVisible(true); //프레임을 화면에 출력
	}
	public static void main(String[] args) {
		new IndepClassListener();
	}
}
//독립된 클래스로 이벤트 리스너를 작성한다.
class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) { //버튼이 클릭될 때 호출되는 매소드
		JButton b = (JButton)e.getSource(); //이벤트 소스 버튼 알아내기
		if(b.getText().equals("Action")) //버튼의 문자열이 "Action"인지 비교
			b.setText("액션"); //버튼의 문자열을 "액션"으로 변경
		else
			b.setText("Action"); //버튼의 문자열을 "Action"으로 변경
	}
}
