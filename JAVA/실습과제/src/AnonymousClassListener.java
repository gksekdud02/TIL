import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame{
	public AnonymousClassListener() {
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		
		//익명 클래스로 Action 리스너 작성
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action")) //버튼의 문자열이 "Action"인지 비교
					b.setText("액션"); //버튼의 문자열을 "액션"으로 변경
				else
					b.setText("Action"); //버튼의 문자열을 "Action"으로 변경
				setTitle(b.getText());
			}
		});
		setSize(350,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AnonymousClassListener();
	}
}
