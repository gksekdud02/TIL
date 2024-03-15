/*2061065 �Ѵٿ� ����#1*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends JFrame {
	private String[] calc = {"+","-","/","*"}; //+,-,*,/�� ����Ǿ� �ִ� �迭
	private String[] calc2 = {"=","CE"}; //=,CE�� ����Ǿ� �ִ� �迭
	private JComboBox<String> strcalc = new JComboBox<String>(); // calc�� ����Ǵ� �޺��ڽ� ����
	private JComboBox<String> strcalc2 = new JComboBox<String>(); // calc2�� ����Ǵ� �޺��ڽ� ����
	private JButton numbutton[] = new JButton[10]; //0~9���� ����Ǵ� ��ư �迭
	private JTextField input = new JTextField(20); //input �ؽ�Ʈ �ʵ�
	private JTextField view = new JTextField(20); //view �ؽ�Ʈ �ʵ�
	private JPanel p = new JPanel(); //calc, calc2, numButton�� �߰��Ǵ� �г�
	int Lnum = 0; //�Է��� ���� ���� �ϴ� ����
	public calculator() {
		setTitle("Calculator"); //�������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ �����츦 ������ ���α׷� ����
		Container c = getContentPane(); //����Ʈ���� �˾Ƴ���.
		c.setLayout(new FlowLayout()); //����Ʈ�ҿ� FlowLayout ��ġ������ �ޱ�
		
		view.setBackground(null); //Background ���ֱ�
		input.setBorder(null); //JTextField �ܰ��� ���ֱ�
		view.setBorder(null); //JTextField �ܰ��� ���ֱ�
		input.setHorizontalAlignment(JTextField.RIGHT); //������ ����
		view.setHorizontalAlignment(JTextField.RIGHT); //������ ����
		c.add(view); //����Ʈ�ҿ� view ����
		c.add(input); //����Ʈ�ҿ� input ����
		
		p.setLayout(new GridLayout(4,4,10,10)); 
		//4*4,�¿� �� ������Ʈ ������ ���򰣰� :10,���� �� ������Ʈ ������  �������� :10�� GridLayout ��ġ������
		
		for(int i=1;i<numbutton.length;i++) { //1~9���� ���� ��ư ����
			numbutton[i] = new JButton(Integer.toString(i));
			numbutton[0] = new JButton("0"); 
			p.add(numbutton[i]); //�гο� ��ư ����
			numbutton[i].addActionListener(new numListener()); //numListener �̺�Ʈ ������ �ޱ�
		}
		numbutton[0].addActionListener(new numListener()); //numListener �̺�Ʈ ������ �ޱ�
		
		for(int i=0;i<calc.length;i++) { 
			strcalc.addItem(calc[i]); //calc�� ���ڿ����� strcalc�� ���������� �߰�
			p.add(strcalc); //P�� strcalc����
		}
		strcalc.addActionListener(new calcListener()); //�޺��ڽ��� Action ������ ���
		p.add(numbutton[0]); // P�� 0��ư ����
	
		for(int i=0;i<calc2.length;i++) {
			strcalc2.addItem(calc2[i]); //calc2�� ���ڿ����� strcalc2�� ���������� �߰�
			p.add(strcalc2); //P�� strcalc2����
		}
		strcalc2.addActionListener(new calc2Listener()); //�޺��ڽ��� Action ������ ���
		c.add(p); //����Ʈ�ҿ� P ����
		
		setSize(240,250); //������ ũ�� 400*300 
		setVisible(true); //ȭ�鿡 ������ ���
	}
	
	//numButton�� �̺�Ʈ ������
	class numListener implements ActionListener{ 
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource(); //�̺�Ʈ �ҽ� ��ư �˾Ƴ���
			input.setText(input.getText() + b.getText()); //������ input�� �ؽ�Ʈ + ��ư�� ���ڿ� -> input�� �ؽ�Ʈ
			view.setText(view.getText() + b.getText()); //������ view�� �ؽ�Ʈ + ��ư�� ���ڿ� -> view�� �ؽ�Ʈ
		}
	}
	
	//strcalc�� �̺�Ʈ ������
	class calcListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JComboBox<String> jc = (JComboBox<String>)e.getSource(); //Action �̺�Ʈ�� �߻��� �޺��ڽ� �˾Ƴ���
			int index = jc.getSelectedIndex(); //�޺��ڽ��� ���õ� �������� �ε��� ��ȣ �˾Ƴ���
			view.setText(view.getText()+calc[index]); //view�� �ؽ�Ʈ�� �˾Ƴ� �ε�����ȣ�� �޺��ڽ��� �������� view�� �ؽ�Ʈ�� ����
			Lnum = Integer.valueOf(input.getText()); //input�� �ؽ�Ʈ�� int�� �����Ͽ� Lnum�� ����
			input.setText(""); //input �ؽ�Ʈ �ʱ�ȭ
			
		}
	}
	
	//strcalc2�� �̺�Ʈ ������
	class calc2Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int result = 0; //���� ��� ���� ������ ����
			JComboBox<String> jc = (JComboBox<String>)e.getSource(); //Action �̺�Ʈ�� �߻��� �޺��ڽ� �˾Ƴ���
			int index = jc.getSelectedIndex(); //�޺��ڽ��� ���õ� �������� �ε��� ��ȣ �˾Ƴ���
		
			switch(index) { 
				case 0: //calc2[0]�ϋ�
					view.setText(view.getText()+calc2[index]); //view�� �ؽ�Ʈ�� �˾Ƴ� �ε�����ȣ�� �޺��ڽ��� �������� view�� �ؽ�Ʈ�� ����
					switch(strcalc.getSelectedIndex()) {
						case 0: //calc[0]�϶�
							result = Lnum + Integer.valueOf(input.getText()); //result�� Lnum�� int������ ��ȯ�� input�� �ؽ�Ʈ�� ���� ���� ����
							input.setText(Integer.toString(result)); //result�� String���� ��ȯ�ؼ� input�� �ؽ�Ʈ�� ����
							break;
						case 1: //calc[1]�϶�
							result = Lnum - Integer.valueOf(input.getText()); //result�� Lnum�� int������ ��ȯ�� input�� �ؽ�Ʈ�� �� ���� ����
							input.setText(Integer.toString(result)); //result�� String���� ��ȯ�ؼ� input�� �ؽ�Ʈ�� ����
							break;
						case 2: //calc[2]�϶�
							result = Lnum / Integer.valueOf(input.getText()); //result�� Lnum�� int������ ��ȯ�� input�� �ؽ�Ʈ�� ���� ���� ����
							input.setText(Integer.toString(result)); //result�� String���� ��ȯ�ؼ� input�� �ؽ�Ʈ�� ����
							break;
						case 3: //calc[3]�϶�
							result = Lnum * Integer.valueOf(input.getText()); //result�� Lnum�� int������ ��ȯ�� input�� �ؽ�Ʈ�� ���� ���� ����
							input.setText(Integer.toString(result)); //result�� String���� ��ȯ�ؼ� input�� �ؽ�Ʈ�� ����
							break;
					}
					break;
				case 1: //calc2[1]�ϋ�
					input.setText(""); //input�� �ؽ�Ʈ �ʱ�ȭ
					view.setText(""); //view�� �ؽ�Ʈ �ʱ�ȭ
					break;
			}
		}
	}
	
	public static void main(String[] args) {
		new calculator();
	}
}
