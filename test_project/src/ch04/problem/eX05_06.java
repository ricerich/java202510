package ch04.problem;

import java.util.Scanner;

class Circle
{
	private double x, y;	
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show()
	{
		System.out.println("("+x+","+y+")"+radius);
	}
	
	public double getArea()
	{
		return radius * radius * 3.14;
	}
			
}

class CircleManager
{
	void run() {
		Scanner sc1 = new Scanner(System.in);
		
		Circle c[] = new Circle[3];
		for(int i=0; i<c.length;i++) 
		{
			System.out.print("(x,y) r >>");
			double x = sc1.nextDouble();
			double y = sc1.nextDouble();
			int r = sc1.nextInt();
			
			c[i] = new Circle(x,y,r);
		}
		
		for(int i=0; i<c.length;i++) 
		{
			c[i].show();
		}
		
		//1.max가 있는 버전
//		double max=0;
//		int max_idx=0;
//		for(int i=0; i<c.length;i++) 
//		{
//			if(max < c[i].getArea()) {
//				max = c[i].getArea();//최대값을 갱신
//				max_idx = i; 
//			}
//		}
		
		//2.max없이 max_idx만 가지고 푸는 버전
//		double max=0;//없어도 됨!
		int max_idx=0;
		for(int i=0; i<c.length;i++) 
		{
			if(c[max_idx].getArea() < c[i].getArea()) {
//				max = c[i].getArea();//최대값을 갱신//없어도 됨!
				max_idx = i; 
			}
		}
		
		System.out.println("가장 면적인 큰 원은?");
		//(3,4)6인 원입니다....
		c[max_idx].show();
	}
}

public class eX05_06 {

	public static void main(String[] args) 
	{
//		CircleManager cm = new CircleManager();
//		cm.run();
		
		new CircleManager().run();

	}

}




