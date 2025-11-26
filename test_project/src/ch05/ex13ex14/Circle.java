package ch05.ex13ex14;

public class Circle implements Shape {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("반지름이 "+radius+"인 원입니다.");

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}

}
