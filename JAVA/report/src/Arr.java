/* 2061065  �Ѵٿ� ������ȣ1 */
import java.util.Scanner;

public class Arr {
	public static void main(String[] args) {
	
		System.out.print("������ ����(5~10��):");
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int Arr[] = new int[size];
		
		System.out.print("���� �Է�: ");
		
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
