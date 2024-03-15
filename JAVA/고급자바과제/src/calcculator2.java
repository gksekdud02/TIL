import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class calcculator2 extends JFrame{
   private JLabel input = new JLabel(); //�Է� ��
   private JLabel view = new JLabel(); //�� ��
   private JButton numbutton[] = new JButton[10]; //0~9���� ����Ǵ� ��ư �迭
   private JPanel p = new JPanel(); //�ѹ���ư�� =,CE�� �߰��Ǵ� �г�
   private JPanel p2 = new JPanel(); //+,-,*,/�� �߰��Ǵ� �г�
   private JButton compute = new JButton("="); //= ��ư ����
   private JButton CE = new JButton("CE"); //CE ��ư ����
   private JButton add = new JButton(" + "); // + ��ư ����
   private JButton sub = new JButton(" - "); // - ��ư ����
   private JButton mul = new JButton(" * "); // * ��ư ����
   private JButton div = new JButton(" / "); // /��ư ����
   int Lnum = 0; //�Է��� ���� ���� �ϴ� ����
   public calcculator2() {
      setTitle("calculator2"); //�������� Ÿ��Ʋ �ޱ�
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ �����츦 ������ ���α׷� ����
      Container c= getContentPane(); //����Ʈ���� �˾Ƴ���.
      c.setLayout(null); //���������� ��ġ������ ���� 
      
      p.setLayout(new GridLayout(4,4,10,10)); 
    //4*4,�¿� �� ������Ʈ ������ ���򰣰� :10,���� �� ������Ʈ ������  �������� :10�� GridLayout ��ġ������ p1
      p2.setLayout(new GridLayout(4,4,10,10));
    //4*4,�¿� �� ������Ʈ ������ ���򰣰� :10,���� �� ������Ʈ ������  �������� :10�� GridLayout ��ġ������ p2
      
      input.setSize(80,20); //input�� ������ 
      input.setLocation(260,30);//input��ġ 
      view.setSize(80,20); //view�� ������
      view.setLocation(260,10); //view�� ��ġ
      
      for(int i=1;i<numbutton.length;i++) { //1~9���� ���� ��ư ����
         numbutton[i] = new JButton(Integer.toString(i));
         numbutton[0] = new JButton("0"); 
         p.add(numbutton[i]); //p�� ��ư 1~9���� ����
         numbutton[i].addActionListener(new numListener()); //Action������ ���
      }
   
      p.add(CE); // p�� CE ��ư �ޱ�
      CE.addActionListener(new calc2Listener()); //Action������ ���
      p.add(numbutton[0]); // p�� 0��ư ����
      numbutton[0].addActionListener(new numListener()); //Action������ ���
      p.add(compute); // p�� = ��ư �ޱ�
      compute.addActionListener(new calc2Listener()); //Action������ ���
   
      p2.add(add); // p2�� + ��ư �ޱ�
      add.addActionListener(new calcListener()); //Action������ ���
      p2.add(sub); // p2�� - ��ư �ޱ�
      sub.addActionListener(new calcListener()); //Action������ ���
      p2.add(mul); // p2�� * ��ư �ޱ�
      mul.addActionListener(new calcListener()); //Action������ ���
      p2.add(div); // p2�� /��ư �ޱ�
      div.addActionListener(new calcListener()); //Action������ ���
      
      p.setSize(200,200); //�г� p�� ������
      p.setLocation(30, 70); //�г� p�� ��ġ
      
      p2.setSize(60,200); //�г� p2�� ������
      p2.setLocation(240, 70); //�г� p2�� ��ġ

      c.add(p); //p����
      c.add(p2); //p2����
      c.add(view); //view ����
      c.add(input); //input ����
   
      setSize(350,350); //������ ũ�� 350X350 ����
      setVisible(true); //ȭ�鿡 ������ ���
   }
   
   class numListener implements ActionListener{ 
      public void actionPerformed(ActionEvent e) {
         JButton b = (JButton)e.getSource(); //�̺�Ʈ �ҽ� ��ư �˾Ƴ���
         input.setText(input.getText() + b.getText()); //������ input�� �ؽ�Ʈ + ��ư�� ���ڿ� -> input�� �ؽ�Ʈ
         view.setText(view.getText() + b.getText()); //������ view�� �ؽ�Ʈ + ��ư�� ���ڿ� -> view�� �ؽ�Ʈ
      }
   }
   
   class calcListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         JButton b = (JButton)e.getSource(); //�̺�Ʈ �ҽ� ��ư �˾Ƴ���
         view.setText(view.getText()+b.getText()); //������ input�� �ؽ�Ʈ + ��ư�� ���ڿ� -> input�� �ؽ�Ʈ
         Lnum = Integer.valueOf(input.getText()); //input�� �ؽ�Ʈ�� int�� �����Ͽ� Lnum�� ����
         input.setText(""); //input �ؽ�Ʈ �ʱ�ȭ
      }
   }
   class calc2Listener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         int result = 0; //���� ��� ���� ������ ����
         JButton b = (JButton)e.getSource();
         
         if(b.getText()=="CE") { //
            input.setText(""); //input�� �ؽ�Ʈ �ʱ�ȭ
            view.setText(""); //view�� �ؽ�Ʈ �ʱ�ȭ
         }
         else if(b.getText()=="=") {
           String str = view.getText();
           StringTokenizer st = new StringTokenizer(str," "); // ��ũ������
           ArrayList<String> operand = new ArrayList<String>(); // �ǿ�����
           ArrayList<String> op = new ArrayList<String>(); // ������
           
           int n = st.countTokens(); // �и��� ��ū ���� Ȯ��
           while(st.hasMoreTokens()) {
              String token = st.nextToken(); //��ū ���
              
              switch(token)
              {
              case "+":
                 op.add(token); //��ū "+"���
                 break;
              case "-":
                 op.add(token); //��ū "+"���
                 break;
              case "*":
                 op.add(token); //��ū "+"���
                 break;
              case "/":
                 op.add(token); //��ū "+"���
                 break;
              default:
                 operand.add(token); //�ǿ����� ��ū ���
              }
           }
          
           for(int i = 0 ; i < operand.size()-1;  i++) {
              int operand1 = Integer.valueOf(operand.get(i)); //ù��° �ǿ����� ����
              int operand2 = Integer.valueOf(operand.get(i+1)); //�ι��� �ǿ����� ����
              
              String operator = op.get(i); // ������
              if(operator.equals("+")) //"+"�̸�
                 result = operand1 + operand2;
              else if(operator.equals("-")) //"-"�̸�
                     result = operand1 - operand2;
              else if(operator.equals("*")) //"*"�̸�
                 result = operand1 * operand2;
              else if(operator.equals("/")) //"/"�̸�
                 result = operand1 / operand2;
           }
           
           view.setText(view.getText()+" "+ b.getText()+" "+Integer.toString(result)); //result�� int�� ��ȯ�ؼ� view�� �ؽ�Ʈ�� �̾� ����
           input.setText(""); //input�ʱ�ȭ
         } 
      }
   }
      
   public static void main(String[] args) {
      new calcculator2();
   }
}