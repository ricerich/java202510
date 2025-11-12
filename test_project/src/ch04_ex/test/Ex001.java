package ch04_ex.test;

public class Ex001 
{
	
//	Circle c2;
	
	public static void main(String[] args) 
	{
		//2.사용하기 - 클래스
		Circle c1;//1.만들기-객체변수
		
		//객체변수c1 -> 객체c1 승급
		c1 = new Circle();//찐객체 1.만들기-객체
		
		//2.사용하기-객체 -> 멤버를 사용한다는 의미
		c1.x = 20;// 2.사용하기-객체의 멤버변수
		c1.print();// 2.사용하기-객체의 메소드
		
		//1.객체 만들기 - 두번째
		Circle c2 = new Circle();
		c2.move();
		c2.print();
		
	}

}



