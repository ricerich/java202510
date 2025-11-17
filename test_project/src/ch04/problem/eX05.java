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
		
	}
}

public class eX05 {

	public static void main(String[] args) 
	{
//		CircleManager cm = new CircleManager();
//		cm.run();
		
		new CircleManager().run();

	}

}




