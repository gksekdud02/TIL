import java.util.Scanner;

public class leapYear {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ �Է�:");
		
		int year = sc.nextInt();
		
		if((year%4==0||year%100!=0) && year%400==0) {
			System.out.print("������");
		}
		else
			System.out.print("������ �ƴ�");
		
		sc.close();
	}
}
