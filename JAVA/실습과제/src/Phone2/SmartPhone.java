package Phone2;

public class SmartPhone extends Phone { //Phone 클래스를 상속
	
	String model; //속성 : 스마트폰 모델
	
	void game() { //기능 : 게임 하기
		System.out.println(model + " 게임을 합니다.");
	}
}
