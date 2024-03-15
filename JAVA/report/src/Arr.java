/* 2061065  한다영 과제번호1 */
import java.util.Scanner;

public class Arr {
	public static void main(String[] args) {
	
		System.out.print("정수의 개수(5~10개):");
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int Arr[] = new int[size];
		
		System.out.print("정수 입력: ");
		
		for(int i=0;i<size;i++) {
			Arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			System.out.print(Arr[i]);
			System.out.print(" ");
		}

		sc.close();
	}
}
