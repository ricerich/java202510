package ch04_ex;

public class Circle 
{
	int radius; 							// 원의 반지름 필드
	String name; 						// 원의 이름을 필드

	public double getArea() { 	// 멤버 메소드
		return 3.14*radius*radius;
	}
}
