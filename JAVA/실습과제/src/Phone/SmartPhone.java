package Phone;

public class SmartPhone {
	
	String color = "white"; //�Ӽ� : ����Ʈ���� ����
	float size = 5.7F; //�Ӽ� : ����Ʈ���� ������
	int volume = 0; //�Ӽ� : ���� ũ��
	
	SmartPhone(){} //�⺻ ������
	SmartPhone(float num){ //1���� ���ڸ� ���� ������
		size = num;
	}
	void call() { //��� : ��ȭ�ɱ�
		System.out.println("��ȭ�ɱ�");
	}
	void volumeUp() { //��� : ���� Ű���
		volume += 1;
	}
	void volumeDown() { //��� : ���� ���߱�
		volume -= -1;
	}
}
