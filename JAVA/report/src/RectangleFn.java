
public class RectangleFn {
	int width; //����
	int height; //����
	String name; //�̸�
	public RectangleFn() { //������
		width = 10;
		height = 10;
	}
	public void change(int w, int h) {
		width = w;
		height = h;
	}
	public int getArea() { //���� ���ϴ� �Լ�
		return width*height;
	}

	public static void main(String[] args) {
		RectangleFn R1 = new RectangleFn();
		R1.name = "R1";
		double area = R1.getArea();
		System.out.println(R1.name + "�� ������ " + area);
		
		RectangleFn R2 = new RectangleFn();
		R2.name = "R2";
		R2.change(10,20);
		area = R2.getArea();
		System.out.println(R2.name + "�� ������ " + area);
		
		RectangleFn R3 = new RectangleFn();
		R3.name = "R3";
		R3.change(20,20);
		area = R3.getArea();
		System.out.println(R3.name + "�� ������ " + area);
	}
}