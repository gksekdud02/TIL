
class Complex{
	double a, b;
	public Complex(double a) {
		this.a = a;
	}
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public double magnitude() {
		return Math.sqrt((a*a)+(b*b));
	}
	public Complex plus(Complex x) {
		return new Complex(this.a+x.a, this.b+x.b);
	}
	public Complex minus(Complex x) {
		return new Complex(this.a-x.a,this.b-x.b);
	}
	public Complex times(Complex x) {
		return new Complex(this.a*x.a,this.b*x.b);
	}
	public Complex divideBy(Complex x) {
		if(x.a!=0 && x.b!=0) {
			return new Complex(this.a/x.a,this.b/x.b);
		}
		else
			return x;
	}
}

public class h1 {
	public static void main(String[] args) {
		Complex A = new Complex(2.0,3.0);
		Complex B = new Complex(3.0,4.0);
		System.out.println(A.plus(B).a + " + " + A.plus(B).b + "i");
		System.out.println(A.minus(B).a + " + " + A.minus(B).b + "i");
		System.out.println(A.times(B).a + " + " + A.times(B).b + "i");
		System.out.println(A.divideBy(B).a + " + " + A.divideBy(B).b + "i");
	}
}
