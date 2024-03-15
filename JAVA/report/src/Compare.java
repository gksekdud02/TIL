/* 2061065  한다영 과제번호2-(1) */
import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요:");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요:");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("첫 번째 숫자가 더 큽니다.");
		}
		else if(num1<num2) {
			System.out.println("두 번째 숫자가 더 큽니다.");
		}
		else
			System.out.println("두 숫자가 같습니다.");
		
		sc.close();
	}
}
