/* 2061065  한다영 과제번호2-(2) */
import java.util.Scanner;

public class CompareSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char result;
		
		System.out.print("첫 번째 숫자를 입력하세요:");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요:");
		int num2 = sc.nextInt();
		
		result = (num1>num2)?'A':'B';
		
		if(num1==num2) {
			result = 'C';
		}
		
		switch(result) {
		case 'A':
			System.out.println("첫번째 숫자가 더 큽니다.");
			break;
		case 'B':
			System.out.println("두번째 숫자가 더 큽니다.");
			break;
		case 'C':
			System.out.println("두 숫자가 같습니다.");
		}
		sc.close();
	}
}
