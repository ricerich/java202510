package ch04.ex03;

class Circle 
{
	int radius;
	String name;
	
	public Circle() { // 매개 변수 없는 생성자
		radius = 1; 
		name = ""; // radius의 초기값은 1
	}
	
	public Circle(int r, String n) { // 매개 변수를 가진 생성자
		radius = r; 
		name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}