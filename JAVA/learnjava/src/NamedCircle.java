class Circle{
	private int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
}

public class NamedCircle extends Circle {
	String name;
	public NamedCircle(int radius,String name) {
		super(radius);
		this.name=name;
	}
	public void show() {
		System.out.println(name + ", ¹ÝÁö¸§ =" + super.getRadius());
	}
	public static void main(String args[]) {
		NamedCircle w = new NamedCircle(5,"Waffle");
		w.show();
	}
}
