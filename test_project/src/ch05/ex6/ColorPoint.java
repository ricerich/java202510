package ch05.ex6;

import ch05.ex578.Point;

public class ColorPoint extends Point {

	private String color;
	
	public ColorPoint() 
	{
		this(0, 0);
//		color ="BLACK";		
	}
	
	public ColorPoint(int x, int y) 
	{
		super(x,y);
		color ="BLACK";
	}
	
	public void setXY(int x, int y) {
		move(x, y);	
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString(){
		return color+"색의 ("+getX()+","+getY()+")의 점";
	}

}
