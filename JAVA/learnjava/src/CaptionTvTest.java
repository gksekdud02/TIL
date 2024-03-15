class Tv{
	boolean power; //õ�� ����
	int channel; //ä��

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
	boolean caption; //ĸ��(�ڸ�) ����
	void displayCaption(String text) {
		if(caption) { //ĸ�� ���°� true�϶��� text�� ������
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
