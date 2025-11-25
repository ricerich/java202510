package ch05.ex11;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력해주세요>>>");
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		
		char op = sc1.next().charAt(0);
		
		Calc calc1=null;
		switch(op)
		{
			case '+':
				calc1 = new Add();
				break;
			case '-':
				calc1 = new Sub();
				break;
			case '*':
				calc1 = new Mul();
				break;
			case '/':
				calc1 = new Div();
				break;
				
			default:
				System.out.println("부호를 잘못 입력하셨어요!");
		}
		
		calc1.setValue(a, b);
		
		if(calc1 instanceof Div && b==0) {
			System.out.println("0으로 나눌 수 없어요!");
		}
		else {
			System.out.println(calc1.calculate());
		}
	}
}
