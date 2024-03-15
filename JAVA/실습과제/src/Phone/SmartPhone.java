package Phone;

public class SmartPhone {
	
	String color = "white"; //속성 : 스마트폰의 색상
	float size = 5.7F; //속성 : 스마트폰의 사이즈
	int volume = 0; //속성 : 음량 크기
	
	SmartPhone(){} //기본 생성자
	SmartPhone(float num){ //1개의 인자를 갖는 생성자
		size = num;
	}
	void call() { //기능 : 전화걸기
		System.out.println("전화걸기");
	}
	void volumeUp() { //기능 : 음량 키우기
		volume += 1;
	}
	void volumeDown() { //기능 : 음량 낮추기
		volume -= -1;
	}
}
