/* 2061065 한다영 과제번호3 */
import java.util.Scanner;

public class Rectangle {
	int width; //가로
	int height; //세로
	String name; //이름
	public Rectangle() {} //생성자
	public Rectangle(int width, int height, String name) { //생성자
		this.width = width;
		this.height = height;
		this.name = name;
	}
	
	public int getArea() { //면적 구하는 함수
		return width*height;
	}
	
	public void change(int width, int height) { //가로, 세로 길이 수정하는 함수
		this.width = width;
		this.height = height;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle R[]= new Rectangle[3];
		
		for(int i=0;i<R.length;i++) { //사용자로부터 입력받아 배열에 저장
			System.out.print("이름>>");
			String name = sc.next();
			System.out.print("가로>>");
			int width = sc.nextInt();
			System.out.print("세로>>");
			int height = sc.nextInt();
			
			R[i] = new Rectangle(width,height,name);
			System.out.println("");
		}
		
		for(int i=0;i<R.length;i++) { //면적 출력
			System.out.println(R[i].name + "의 면적은" + R[i].getArea());
		}
		
		for(int i=0;i<R.length;i++) { //가로 세로 길이 수정
			System.out.print(R[i].name + " 의 가로 길이 수정>>");
			int width = sc.nextInt();
			System.out.print(R[i].name + " 의 세로 길이 수정>>");
			int height = sc.nextInt();
			R[i].change(width, height);
			System.out.println(" ");
		}
		
		for(int i=0;i<R.length;i++) { // 바뀐 가로 세로로 면적 구해서 출력
			System.out.println("바뀐 " + R[i].name + "의 면적은" + R[i].getArea());
		}
		
		sc.close();
	}
}
