package ch05.ex09;

public class StringStack implements Stack 
{
	private String element[];
	private int top;
	
	
	
	public StringStack(int capacity) {
		element = new String[capacity];
		top=-1;
	}

	@Override
	public int length() 
	{
		return top+1;
	}

	@Override
	public int capacity() {
		
		return element.length;
	}

	@Override
	public boolean push(String fruit) 
	{
		if(top == element.length-1)
			return false;
		else {
			element[top+1] = fruit;
			top++;
			return true;
			
//			element[++top] = fruit;
//			return true;
		}
		
	}
	
	@Override
	public String pop() {
		
		if(top == -1)
			return null;
		else {
			String s = element[top];
			top--;
			return s;
			
//			return element[top];
		}
	}


}
