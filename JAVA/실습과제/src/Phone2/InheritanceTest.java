package Phone2;

public class InheritanceTest {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone(); //SmartPhone 클래스로 객체 생성
		SmartPhoneImpl phone = new SmartPhoneImpl("010-4046-8004","IOS"); //SmartPhoneImpl 클래스로 객체 생성
				
		smartPhone.phoneNumber = "010-4046-8004"; //조상 클래스로부터 상속받은 변수
		smartPhone.model = "IPhone"; //자식 클래스에서 추가로 정의한 변수
		smartPhone.call(); //조상 클래스로부터 상속받은 메소드
		smartPhone.game(); //자식 클래스에서 추가로 정의한 메소드
		
		phone.call(); //오버라이딩 된 메서드가 호출됨
	}
}
