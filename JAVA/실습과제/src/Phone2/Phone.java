package Phone2;

public class Phone {
	String phoneNumber; //�Ӽ� : �ڵ��� ��ȣ

	Phone(){} //�⺻ ������
	Phone(String Number){ //1���� ���ڸ� ���� ������
		phoneNumber = Number;
	}
	void call() { //��� : ��ȭ �ɱ�
		System.out.println(phoneNumber + "�ּ� ��ȭ�� �ɾ� ��ȭ�� �մϴ�.");
	}
}
