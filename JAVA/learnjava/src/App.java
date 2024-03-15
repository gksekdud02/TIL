import java.util.Scanner;

abstract class Calculator{
	protected int a,b;
	abstract protected int calc();
	protected void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요>>");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public void run() {
		input();
		int result=calc();
		System.out.println("계산된 값은 "+ result);
	}
}
 
class Adder extends Calculator{
	protected int calc() {
		return a+b;
	}
}

class Subtracter extends Calculator{
	protected int calc() {
		return a-b;
	}
}

public class App {
	public static void main(String[] args) {
		Adder add = new Adder();
		Subtracter sub = new Subtracter();
		
		add.run();
		sub.run();
	}
}
