import java.util.Scanner;

class Sequential{
	int search = 0;
	int result;
	public void search(int result) {
		int []Arr = {2,5,8,9,6};
		this.result = result;
		
		for(int i=0;i<Arr.length;i++) {
			if(result == Arr[i]) {
				search =1;
				System.out.println("���ڴ� " + i + " ��°�� �ֽ��ϴ�.");
				break;
			}
		}
		if(search==0) {
			System.out.println("ã�� ���ڰ� �����ϴ�.");
		}
	}
}

public class h3 {
	public static void main(String[] args) {
		int key;
		Sequential S = new Sequential();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�>>");
		key = sc.nextInt();
		S.search(key);
		
		sc.close();
	}
}
