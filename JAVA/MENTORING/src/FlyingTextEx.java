import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlyingTextEx extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel("HELLO");

	FlyingTextEx() {
		super("��,��,��,�� Ű�� �̿��Ͽ� �ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addKeyListener(new MyKeyListener());

		la.setLocation(50, 50); 
		la.setSize(100, 20);
		contentPane.add(la);

		setSize(200, 200);
		setVisible(true);

		contentPane.requestFocus();
	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			System.out.println(keyCode);
			switch(keyCode) {
				case KeyEvent.VK_UP:
					if(la.getY()>0) {
					la.setLocation(la.getX(),la.getY()-10);
					}
					break;
				case KeyEvent.VK_DOWN:
					if(la.getY()<200) {
					la.setLocation(la.getX(),la.getY()+10);
					}
					break;
				case KeyEvent.VK_LEFT:
					if(la.getX()>0) {
					la.setLocation(la.getX()-10,la.getY());
					}
					break;
				case KeyEvent.VK_RIGHT:
					if(la.getX()<200) {
					la.setLocation(la.getX()+10,la.getY());
					}
					break;
			}
		}
	}
	
	public static void main(String[] args) {
		new FlyingTextEx();
	}
}
