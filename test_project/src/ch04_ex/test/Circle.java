package ch04_ex.test;

//1.만들기 - 클래스
public class Circle 
{
	//클래스 구성의 3가지 멤버

	//1.멤버 변수 - member variable
	int x;
	int y;
	double r;

	//2.생성자 (메소드) - constructor
	Circle()//1)클래스 이름과 동일,2)반환값이 없어야 되고
	{
		// 핵심 역할은 멤버 변수를 초기화(initialize), 
		// 기본값(default value)을 선호, 0보다는
		// 진짜 역할은 객체를 생성(=만들때)할 때 사용!
		x=0;
		y=0;
		r=30.0;
	}
	
	//3.(멤버) 메소드
	void print()
	{
		System.out.println("원의 중심은("+this.x+","+y+") 이고,");
		System.out.println("반지름은 ("+r+") 입니다");
	}
	
	void move()
	{
		x=50;
		y=40;
	}
	

}





