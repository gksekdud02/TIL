/*2061065 한다영 과제#1*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends JFrame {
	private String[] calc = {"+","-","/","*"}; //+,-,*,/가 저장되어 있는 배열
	private String[] calc2 = {"=","CE"}; //=,CE가 저장되어 있는 배열
	private JComboBox<String> strcalc = new JComboBox<String>(); // calc가 저장되는 콤보박스 생성
	private JComboBox<String> strcalc2 = new JComboBox<String>(); // calc2가 저장되는 콤보박스 생성
	private JButton numbutton[] = new JButton[10]; //0~9까지 저장되는 버튼 배열
	private JTextField input = new JTextField(20); //input 텍스트 필드
	private JTextField view = new JTextField(20); //view 텍스트 필드
	private JPanel p = new JPanel(); //calc, calc2, numButton이 추가되는 패널
	int Lnum = 0; //입력한 값을 저장 하는 변수
	public calculator() {
		setTitle("Calculator"); //프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 윈도우를 닫으면 프로그램 종료
		Container c = getContentPane(); //컨텐트팬을 알아낸다.
		c.setLayout(new FlowLayout()); //컨텐트팬에 FlowLayout 배치관리자 달기
		
		view.setBackground(null); //Background 없애기
		input.setBorder(null); //JTextField 외곽선 없애기
		view.setBorder(null); //JTextField 외곽선 없애기
		input.setHorizontalAlignment(JTextField.RIGHT); //오른쪽 정렬
		view.setHorizontalAlignment(JTextField.RIGHT); //오른쪽 정렬
		c.add(view); //컨탠트팬에 view 부착
		c.add(input); //컨탠트팬에 input 부착
		
		p.setLayout(new GridLayout(4,4,10,10)); 
		//4*4,좌우 두 컴포넌트 사이의 수평간격 :10,상하 두 컴포넌트 사이의  수직간격 :10의 GridLayout 배치관리자
		
		for(int i=1;i<numbutton.length;i++) { //1~9까지 숫자 버튼 부착
			numbutton[i] = new JButton(Integer.toString(i));
			numbutton[0] = new JButton("0"); 
			p.add(numbutton[i]); //패널에 버튼 부착
			numbutton[i].addActionListener(new numListener()); //numListener 이벤트 리스너 달기
		}
		numbutton[0].addActionListener(new numListener()); //numListener 이벤트 리스너 달기
		
		for(int i=0;i<calc.length;i++) { 
			strcalc.addItem(calc[i]); //calc의 문자열들을 strcalc의 아이템으로 추가
			p.add(strcalc); //P에 strcalc부착
		}
		strcalc.addActionListener(new calcListener()); //콤보박스에 Action 리스너 등록
		p.add(numbutton[0]); // P에 0버튼 부착
	
		for(int i=0;i<calc2.length;i++) {
			strcalc2.addItem(calc2[i]); //calc2의 문자열들을 strcalc2의 아이템으로 추가
			p.add(strcalc2); //P에 strcalc2부착
		}
		strcalc2.addActionListener(new calc2Listener()); //콤보박스에 Action 리스너 등록
		c.add(p); //컨탠트팬에 P 부착
		
		setSize(240,250); //프레임 크기 400*300 
		setVisible(true); //화면에 프레임 출력
	}
	
	//numButton의 이벤트 리스너
	class numListener implements ActionListener{ 
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource(); //이벤트 소스 버튼 알아내기
			input.setText(input.getText() + b.getText()); //기존의 input의 텍스트 + 버튼의 문자열 -> input의 텍스트
			view.setText(view.getText() + b.getText()); //기존의 view의 텍스트 + 버튼의 문자열 -> view의 텍스트
		}
	}
	
	//strcalc의 이벤트 리스너
	class calcListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JComboBox<String> jc = (JComboBox<String>)e.getSource(); //Action 이벤트가 발생한 콤보박스 알아내기
			int index = jc.getSelectedIndex(); //콤보박스의 선택된 아이템의 인덱스 번호 알아내기
			view.setText(view.getText()+calc[index]); //view의 텍스트와 알아낸 인덱스번호의 콤보박스의 아이템을 view의 텍스트로 변경
			Lnum = Integer.valueOf(input.getText()); //input의 텍스트를 int로 변경하여 Lnum에 저장
			input.setText(""); //input 텍스트 초기화
			
		}
	}
	
	//strcalc2의 이벤트 리스너
	class calc2Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int result = 0; //연산 결과 값을 저장할 변수
			JComboBox<String> jc = (JComboBox<String>)e.getSource(); //Action 이벤트가 발생한 콤보박스 알아내기
			int index = jc.getSelectedIndex(); //콤보박스의 선택된 아이템의 인덱스 번호 알아내기
		
			switch(index) { 
				case 0: //calc2[0]일떄
					view.setText(view.getText()+calc2[index]); //view의 텍스트와 알아낸 인덱스번호의 콤보박스의 아이템을 view의 텍스트로 변경
					switch(strcalc.getSelectedIndex()) {
						case 0: //calc[0]일때
							result = Lnum + Integer.valueOf(input.getText()); //result에 Lnum과 int형으로 변환한 input의 텍스트를 더한 것을 저장
							input.setText(Integer.toString(result)); //result를 String으로 변환해서 input의 텍스트를 변경
							break;
						case 1: //calc[1]일때
							result = Lnum - Integer.valueOf(input.getText()); //result에 Lnum과 int형으로 변환한 input의 텍스트를 뺀 것을 저장
							input.setText(Integer.toString(result)); //result를 String으로 변환해서 input의 텍스트를 변경
							break;
						case 2: //calc[2]일때
							result = Lnum / Integer.valueOf(input.getText()); //result에 Lnum과 int형으로 변환한 input의 텍스트를 나눈 것을 저장
							input.setText(Integer.toString(result)); //result를 String으로 변환해서 input의 텍스트를 변경
							break;
						case 3: //calc[3]일때
							result = Lnum * Integer.valueOf(input.getText()); //result에 Lnum과 int형으로 변환한 input의 텍스트를 곱한 것을 저장
							input.setText(Integer.toString(result)); //result를 String으로 변환해서 input의 텍스트를 변경
							break;
					}
					break;
				case 1: //calc2[1]일떄
					input.setText(""); //input의 텍스트 초기화
					view.setText(""); //view의 텍스트 초기화
					break;
			}
		}
	}
	
	public static void main(String[] args) {
		new calculator();
	}
}
