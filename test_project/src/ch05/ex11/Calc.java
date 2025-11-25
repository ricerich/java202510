package ch05.ex11;

public abstract class Calc 
{
	protected int a;
	protected int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public abstract int calculate();
}
