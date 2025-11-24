package ch05;

class SuperObject {
	protected String name;
	
	SuperObject()
	{
		name="부모";
	}
	
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}
}
public class Test extends SuperObject {
	protected String name;
	
	Test()
	{
		name="자식";
	}
	
	public void draw() {
		name = "Sub";
		super.name = "Super";
		super.draw();
		System.out.println(name);
	}
	public static void main(String [] args) {
		SuperObject b = new Test();
//		b.paint();
		System.out.println("---------"+b.name);
	}
}





