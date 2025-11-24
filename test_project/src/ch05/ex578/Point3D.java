package ch05.ex578;

public class Point3D extends Point {

	private int z;
	public Point3D(int x, int y, int z) {
		super(x,y);
//		move(x,y);
		this.z = z;
	}
	
	public void moveUp() 
	{
		z++;
	}

	public void moveDown() 
	{
		z--;		
	}

	public void move(int x, int y, int z) {
		move(x,y);
		this.z = z;
	}
	
//	private int getZ() {
//		return z;
//	}
	
	@Override
	public String toString(){
		return "("+getX()+","+getY()+","+z+")의 점";
	}


}
