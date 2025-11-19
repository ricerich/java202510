package ch04.problem;

import java.util.Scanner;

class Add{
	private int a;
	private int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		return a+b;
	}
}

class Sub{
	private int a;
	private int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		return a-b;
	}
}

class Mul{
	private int a;
	private int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		return a*b;
	}
}

class Div{
	private int a;
	private int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		int c=0;
		try {
			c = a / b;
		}
		catch(Exception e)
		{
			System.out.println("0으로 나눌수 없어요!");
		}
		
		return c;
	}
}


public class Ex11 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력해주세요>>>");
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		
		char op = sc1.next().charAt(0);
		
		switch(op)
		{
			case '+':
				Add add1 = new Add();
				add1.setValue(a, b);
//				int result = add1.calculate();
				System.out.println(add1.calculate());
				break;
			case '-':
				Sub sub1 = new Sub();
				sub1.setValue(a, b);
//				int result = add1.calculate();
				System.out.println(sub1.calculate());			
				break;
			case '*':
				Mul mul1 = new Mul();
				mul1.setValue(a, b);
//				int result = add1.calculate();
				System.out.println(mul1.calculate());		
				break;
			case '/':
				Div div1 = new Div();
				div1.setValue(a, b);
//				int result = add1.calculate();
				System.out.println(div1.calculate());	
				break;
				
			default:
				System.out.println("부호를 잘못 입력하셨어요!");
		}

	}

}




