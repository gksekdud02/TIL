import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame(){
		setTitle("첫번째 프레임");
		setSize(300,300); //프레임 크기
		setVisible(true); //프레임 출력
	}
	
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
	}
}
