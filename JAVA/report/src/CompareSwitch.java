/* 2061065  �Ѵٿ� ������ȣ2-(2) */
import java.util.Scanner;

public class CompareSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char result;
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ���:");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���ڸ� �Է��ϼ���:");
		int num2 = sc.nextInt();
		
		result = (num1>num2)?'A':'B';
		
		if(num1==num2) {
			result = 'C';
		}
		
		switch(result) {
		case 'A':
			System.out.println("ù��° ���ڰ� �� Ů�ϴ�.");
			break;
		case 'B':
			System.out.println("�ι�° ���ڰ� �� Ů�ϴ�.");
			break;
		case 'C':
			System.out.println("�� ���ڰ� �����ϴ�.");
		}
		sc.close();
	}
}
