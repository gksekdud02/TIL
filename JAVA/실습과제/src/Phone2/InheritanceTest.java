package Phone2;

public class InheritanceTest {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone(); //SmartPhone Ŭ������ ��ü ����
		SmartPhoneImpl phone = new SmartPhoneImpl("010-4046-8004","IOS"); //SmartPhoneImpl Ŭ������ ��ü ����
				
		smartPhone.phoneNumber = "010-4046-8004"; //���� Ŭ�����κ��� ��ӹ��� ����
		smartPhone.model = "IPhone"; //�ڽ� Ŭ�������� �߰��� ������ ����
		smartPhone.call(); //���� Ŭ�����κ��� ��ӹ��� �޼ҵ�
		smartPhone.game(); //�ڽ� Ŭ�������� �߰��� ������ �޼ҵ�
		
		phone.call(); //�������̵� �� �޼��尡 ȣ���
	}
}
