class Tv{
	boolean power; //천원 상태
	int channel; //채널

	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

class CaptionTv extends Tv{
	boolean caption; //캡션(자막) 상태
	void displayCaption(String text) {
		if(caption) { //캡션 상태가 true일때만 text를 보여줌
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {
	public static void main(String args[]) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello World");
		ctv.caption =true;
		ctv.displayCaption("Hello World");
	}
}
