package Phone;

public class SmartPhoneMain {
	public static void main(String []args) {
		SmartPhone sp = new SmartPhone(6.8f); //SmartPhone 클래스로 객체 생성
		
		System.out.println("> color: "+ sp.color); //참조변수를 이용해 객체의 color변수 참조
		System.out.println("> size: "+ sp.size); //참조변수를 이용해 객체의 size변수 참조
		System.out.println("> volume: "+ sp.volume); //참조변수를 이용해 객체의 volume변수 참조
		
		sp.call(); //참조변수를 이용해 객체의 메소드 호출
		
		sp.volumeUp(); //참조변수를 이용해 객체의 메소드 호출
		System.out.println("> volume: " + sp.volume); //참조변수를 이용해 객체의 volume변수 참조
	}
}
