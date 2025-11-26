package ch05.ex13ex14;

public class Rect implements Shape {

	private int width ;
	private int height ;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width+"x"+height+"크기의 사각형입니다.");

	}

	@Override
	public double getArea() {
		return width*height;
	}

}
