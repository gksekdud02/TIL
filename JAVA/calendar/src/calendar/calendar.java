package calendar;
import java.util.Scanner;

public class calendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է�(1~12):");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.print("31��");
			break;
		case 2:
			System.out.print("28��");
			break;
		default:
			System.out.print("30��");
		}
		
		sc.close();
	}
}
