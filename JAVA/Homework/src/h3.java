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
				System.out.println("문자는 " + i + " 번째에 있습니다.");
				break;
			}
		}
		if(search==0) {
			System.out.println("찾는 문자가 없습니다.");
		}
	}
}

public class h3 {
	public static void main(String[] args) {
		int key;
		Sequential S = new Sequential();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력>>");
		key = sc.nextInt();
		S.search(key);
		
		sc.close();
	}
}
