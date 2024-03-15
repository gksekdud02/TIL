import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gambling extends JFrame{
	JLabel JL[]  = new JLabel[3];
	JLabel result = new JLabel("시작합니다.");
	public Gambling() {
		setTitle("Open Challenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=0;i<JL.length;i++) {
			JL[i] = new JLabel("0");
			JL[i].setBackground(Color.MAGENTA);
			JL[i].setHorizontalAlignment(JLabel.CENTER);
			JL[i].setSize(80,80);
			JL[i].setLocation(50 + i * 100, 80);
			JL[i].setOpaque(true);
			JL[i].setForeground(Color.YELLOW);
			JL[i].setFont(new Font("Arial", Font.PLAIN, 30));
			c.add(JL[i]);
		}
		
		result.setLocation(150,200);
		result.setSize(100,100);
		
		c.add(result);
		c.addKeyListener(new MyKeyListener());
		
		setSize(400,400);
		setVisible(true); 
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar() =='\n') {
				int x = (int)(Math.random()*5);
				int y = (int)(Math.random()*5);
				int z = (int)(Math.random()*5);
				JL[0].setText(x + "");
				JL[1].setText(y + "");
				JL[2].setText(z + "");
				if(x==y&&y==z) {
					result.setText("축하합니다!");
				}
				else {
					result.setText("아쉽군요");
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Gambling();
	}
} 