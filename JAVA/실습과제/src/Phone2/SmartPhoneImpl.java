package Phone2;

public class SmartPhoneImpl extends Phone{
	String model;
	
	public SmartPhoneImpl(String phoneNumber, String model) { //2개의 인자를 가진 생성자
		super(phoneNumber); //상위 클래스 생성자 호출
		this.model = model; //SmartPhoneImpl의 model 매개변수로 입력받아 초기화
	}
	@Override
	void call() { //상위클래스의 메소드르르 재구성
		super.call(); //super 키워드는 상위클래스를 가르키는 키워드
		System.out.println("이어팟을 이용해서 통화를 합니다");
	}
}
