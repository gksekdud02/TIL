interface AdderInterface{
	int add(int x,int y); //public abstract int add(int x,int y);
	int add(int n); //public abstract int add(int n);
}

public class MyAdder implements AdderInterface { //interface를 상속받을 떄는 implements 사용
	int sum;
	public MyAdder() {;}
	public int add(int x,int y) {
		return x+y;
	}
	public int add(int n) {
		if(n>0) {
			for(int i=1;i<=n;i++) {
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String args[]) {
		MyAdder adder = new MyAdder(); 
		System.out.println(adder.add(5,10));
		System.out.println(adder.add(10));
	}
}
