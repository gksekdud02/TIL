import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex extends JFrame{
	public Ex() {
		setTitle("¿¹ÂÅ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(null);
		
		JButton A = new JButton("A");
		A.addActionListener(new MyActionListener());
		A.setSize(50,30);
		A.setLocation(0,0);
		contentPane.add(A);
		
		JButton B = new JButton("B");
		B.addActionListener(new MyActionListener());
		B.setSize(50,30);
		B.setLocation(235,0);
		contentPane.add(B);
		
		JButton C = new JButton("C");
		C.addActionListener(new MyActionListener());
		C.setSize(50,30);
		C.setLocation(0,235);
		contentPane.add(C);
		
		JButton D = new JButton("D");
		D.addActionListener(new MyActionListener());
		D.setSize(50,30);
		D.setLocation(235,235);
		contentPane.add(D);
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex();
	}
}

class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton a = (JButton)e.getSource();
		if(a.getText().equals("A"))
			a.setText("1");
		else if(a.getText().equals("B"))
			a.setText("2");
		else if(a.getText().equals("C"))
			a.setText("3");
		else if(a.getText().equals("D"))
			a.setText("4");
		else if(a.getText().equals("1"))
			a.setText("A");
		else if(a.getText().equals("2"))
			a.setText("B");
		else if(a.getText().equals("3"))
			a.setText("C");
		else if(a.getText().equals("4"))
			a.setText("D");
		
		/*
		 * class MyActionListener implements ActionListener {
   public void actionPerformed(ActionEvent e) {
      JButton b = (JButton)e.getSource();
      String s = b.getText();
      char c = s.charAt(0);
      int in = c;
      System.out.println(in);
      if((in >= 65) && (in <= 96)) {
         in = in-64;
         b.setText(Integer.toString(in));
      }
      else if(in <65) {
         in = in + 16;
         c = (char)in;
         System.out.println(c);
         b.setText(Character.toString(c));
      }
   }
}
		 */
	}
}