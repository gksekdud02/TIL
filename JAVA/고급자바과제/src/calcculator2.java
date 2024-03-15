import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class calcculator2 extends JFrame{
   private JLabel input = new JLabel(); //입력 라벨
   private JLabel view = new JLabel(); //뷰 라벨
   private JButton numbutton[] = new JButton[10]; //0~9까지 저장되는 버튼 배열
   private JPanel p = new JPanel(); //넘버버튼과 =,CE가 추가되는 패널
   private JPanel p2 = new JPanel(); //+,-,*,/가 추가되는 패널
   private JButton compute = new JButton("="); //= 버튼 생성
   private JButton CE = new JButton("CE"); //CE 버튼 생성
   private JButton add = new JButton(" + "); // + 버튼 생성
   private JButton sub = new JButton(" - "); // - 버튼 생성
   private JButton mul = new JButton(" * "); // * 버튼 생성
   private JButton div = new JButton(" / "); // /버튼 생성
   int Lnum = 0; //입력한 값을 저장 하는 변수
   public calcculator2() {
      setTitle("calculator2"); //프레임의 타이틀 달기
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 윈도우를 닫으면 프로그램 종료
      Container c= getContentPane(); //컨텐트팬을 알아낸다.
      c.setLayout(null); //컨텐츠팬의 배치관리자 삭제 
      
      p.setLayout(new GridLayout(4,4,10,10)); 
    //4*4,좌우 두 컴포넌트 사이의 수평간격 :10,상하 두 컴포넌트 사이의  수직간격 :10의 GridLayout 배치관리자 p1
      p2.setLayout(new GridLayout(4,4,10,10));
    //4*4,좌우 두 컴포넌트 사이의 수평간격 :10,상하 두 컴포넌트 사이의  수직간격 :10의 GridLayout 배치관리자 p2
      
      input.setSize(80,20); //input의 사이즈 
      input.setLocation(260,30);//input위치 
      view.setSize(80,20); //view의 사이즈
      view.setLocation(260,10); //view의 위치
      
      for(int i=1;i<numbutton.length;i++) { //1~9까지 숫자 버튼 부착
         numbutton[i] = new JButton(Integer.toString(i));
         numbutton[0] = new JButton("0"); 
         p.add(numbutton[i]); //p에 버튼 1~9까지 부착
         numbutton[i].addActionListener(new numListener()); //Action리스너 등록
      }
   
      p.add(CE); // p에 CE 버튼 달기
      CE.addActionListener(new calc2Listener()); //Action리스너 등록
      p.add(numbutton[0]); // p에 0버튼 부착
      numbutton[0].addActionListener(new numListener()); //Action리스너 등록
      p.add(compute); // p에 = 버튼 달기
      compute.addActionListener(new calc2Listener()); //Action리스너 등록
   
      p2.add(add); // p2에 + 버튼 달기
      add.addActionListener(new calcListener()); //Action리스너 등록
      p2.add(sub); // p2에 - 버튼 달기
      sub.addActionListener(new calcListener()); //Action리스너 등록
      p2.add(mul); // p2에 * 버튼 달기
      mul.addActionListener(new calcListener()); //Action리스너 등록
      p2.add(div); // p2에 /버튼 달기
      div.addActionListener(new calcListener()); //Action리스너 등록
      
      p.setSize(200,200); //패널 p의 사이즈
      p.setLocation(30, 70); //패널 p의 위치
      
      p2.setSize(60,200); //패널 p2의 사이즈
      p2.setLocation(240, 70); //패널 p2의 위치

      c.add(p); //p삽입
      c.add(p2); //p2삽입
      c.add(view); //view 삽입
      c.add(input); //input 삽입
   
      setSize(350,350); //프레임 크기 350X350 설정
      setVisible(true); //화면에 프레임 출력
   }
   
   class numListener implements ActionListener{ 
      public void actionPerformed(ActionEvent e) {
         JButton b = (JButton)e.getSource(); //이벤트 소스 버튼 알아내기
         input.setText(input.getText() + b.getText()); //기존의 input의 텍스트 + 버튼의 문자열 -> input의 텍스트
         view.setText(view.getText() + b.getText()); //기존의 view의 텍스트 + 버튼의 문자열 -> view의 텍스트
      }
   }
   
   class calcListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         JButton b = (JButton)e.getSource(); //이벤트 소스 버튼 알아내기
         view.setText(view.getText()+b.getText()); //기존의 input의 텍스트 + 버튼의 문자열 -> input의 텍스트
         Lnum = Integer.valueOf(input.getText()); //input의 텍스트를 int로 변경하여 Lnum에 저장
         input.setText(""); //input 텍스트 초기화
      }
   }
   class calc2Listener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         int result = 0; //연산 결과 값을 저장할 변수
         JButton b = (JButton)e.getSource();
         
         if(b.getText()=="CE") { //
            input.setText(""); //input의 텍스트 초기화
            view.setText(""); //view의 텍스트 초기화
         }
         else if(b.getText()=="=") {
           String str = view.getText();
           StringTokenizer st = new StringTokenizer(str," "); // 토크나이저
           ArrayList<String> operand = new ArrayList<String>(); // 피연산자
           ArrayList<String> op = new ArrayList<String>(); // 연산자
           
           int n = st.countTokens(); // 분리된 토큰 개수 확인
           while(st.hasMoreTokens()) {
              String token = st.nextToken(); //토큰 얻기
              
              switch(token)
              {
              case "+":
                 op.add(token); //토큰 "+"출력
                 break;
              case "-":
                 op.add(token); //토큰 "+"출력
                 break;
              case "*":
                 op.add(token); //토큰 "+"출력
                 break;
              case "/":
                 op.add(token); //토큰 "+"출력
                 break;
              default:
                 operand.add(token); //피연산자 토큰 출력
              }
           }
          
           for(int i = 0 ; i < operand.size()-1;  i++) {
              int operand1 = Integer.valueOf(operand.get(i)); //첫번째 피연산자 저장
              int operand2 = Integer.valueOf(operand.get(i+1)); //두번쨰 피연산자 저장
              
              String operator = op.get(i); // 연산자
              if(operator.equals("+")) //"+"이면
                 result = operand1 + operand2;
              else if(operator.equals("-")) //"-"이면
                     result = operand1 - operand2;
              else if(operator.equals("*")) //"*"이면
                 result = operand1 * operand2;
              else if(operator.equals("/")) //"/"이면
                 result = operand1 / operand2;
           }
           
           view.setText(view.getText()+" "+ b.getText()+" "+Integer.toString(result)); //result를 int로 변환해서 view의 텍스트에 이어 붙임
           input.setText(""); //input초기화
         } 
      }
   }
      
   public static void main(String[] args) {
      new calcculator2();
   }
}