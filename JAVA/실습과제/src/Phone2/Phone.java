package Phone2;

public class Phone {
	String phoneNumber; //속성 : 핸드폰 번호

	Phone(){} //기본 생성자
	Phone(String Number){ //1개의 인자를 가진 생성자
		phoneNumber = Number;
	}
	void call() { //기능 : 전화 걸기
		System.out.println(phoneNumber + "애서 전화를 걸어 통화를 합니다.");
	}
}
