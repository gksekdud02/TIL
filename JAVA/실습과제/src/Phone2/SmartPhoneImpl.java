package Phone2;

public class SmartPhoneImpl extends Phone{
	String model;
	
	public SmartPhoneImpl(String phoneNumber, String model) { //2���� ���ڸ� ���� ������
		super(phoneNumber); //���� Ŭ���� ������ ȣ��
		this.model = model; //SmartPhoneImpl�� model �Ű������� �Է¹޾� �ʱ�ȭ
	}
	@Override
	void call() { //����Ŭ������ �޼ҵ帣�� �籸��
		super.call(); //super Ű����� ����Ŭ������ ����Ű�� Ű����
		System.out.println("�̾����� �̿��ؼ� ��ȭ�� �մϴ�");
	}
}
