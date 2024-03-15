/* 2061065 �Ѵٿ� ������ȣ3 */
import java.util.Scanner;

public class Rectangle {
	int width; //����
	int height; //����
	String name; //�̸�
	public Rectangle() {} //������
	public Rectangle(int width, int height, String name) { //������
		this.width = width;
		this.height = height;
		this.name = name;
	}
	
	public int getArea() { //���� ���ϴ� �Լ�
		return width*height;
	}
	
	public void change(int width, int height) { //����, ���� ���� �����ϴ� �Լ�
		this.width = width;
		this.height = height;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle R[]= new Rectangle[3];
		
		for(int i=0;i<R.length;i++) { //����ڷκ��� �Է¹޾� �迭�� ����
			System.out.print("�̸�>>");
			String name = sc.next();
			System.out.print("����>>");
			int width = sc.nextInt();
			System.out.print("����>>");
			int height = sc.nextInt();
			
			R[i] = new Rectangle(width,height,name);
			System.out.println("");
		}
		
		for(int i=0;i<R.length;i++) { //���� ���
			System.out.println(R[i].name + "�� ������" + R[i].getArea());
		}
		
		for(int i=0;i<R.length;i++) { //���� ���� ���� ����
			System.out.print(R[i].name + " �� ���� ���� ����>>");
			int width = sc.nextInt();
			System.out.print(R[i].name + " �� ���� ���� ����>>");
			int height = sc.nextInt();
			R[i].change(width, height);
			System.out.println(" ");
		}
		
		for(int i=0;i<R.length;i++) { // �ٲ� ���� ���η� ���� ���ؼ� ���
			System.out.println("�ٲ� " + R[i].name + "�� ������" + R[i].getArea());
		}
		
		sc.close();
	}
}
