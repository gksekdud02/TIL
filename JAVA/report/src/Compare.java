/* 2061065  �Ѵٿ� ������ȣ2-(1) */
import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ���:");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���ڸ� �Է��ϼ���:");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("ù ��° ���ڰ� �� Ů�ϴ�.");
		}
		else if(num1<num2) {
			System.out.println("�� ��° ���ڰ� �� Ů�ϴ�.");
		}
		else
			System.out.println("�� ���ڰ� �����ϴ�.");
		
		sc.close();
	}
}
