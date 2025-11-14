package ch04.ex06;

public class Circle
{
	private int x;
	private int y;
	private int radius;
	
	public Circle()
	{
		x=0;
		y=0;
		radius=1;
	}
	
	public void setX(int x) {
		this.x = x;
		printX();
	}
	
	public int getX()
	{
		return x;
	}
	
	private void printX()
	{
		System.out.println("x값은: "+ x);
	}
	
}





