package Phone;

public class SmartPhoneMain {
	public static void main(String []args) {
		SmartPhone sp = new SmartPhone(6.8f); //SmartPhone Ŭ������ ��ü ����
		
		System.out.println("> color: "+ sp.color); //���������� �̿��� ��ü�� color���� ����
		System.out.println("> size: "+ sp.size); //���������� �̿��� ��ü�� size���� ����
		System.out.println("> volume: "+ sp.volume); //���������� �̿��� ��ü�� volume���� ����
		
		sp.call(); //���������� �̿��� ��ü�� �޼ҵ� ȣ��
		
		sp.volumeUp(); //���������� �̿��� ��ü�� �޼ҵ� ȣ��
		System.out.println("> volume: " + sp.volume); //���������� �̿��� ��ü�� volume���� ����
	}
}
