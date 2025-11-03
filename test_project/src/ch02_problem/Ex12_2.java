package ch02_problem;

import java.util.Scanner;

public class Ex12_2 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("연산(공백 뛰어주세요>>");
		double n1 = sc1.nextDouble();
		String op1 = sc1.next();
		double n2 = sc1.nextDouble();
		
		double result=0;
		
		switch(op1)
		{
			case "+":
				result = n1 + n2;
				break;
			case "-":
				result = n1 - n2;
				break;
			case "*":
				result = n1 * n2;
				break;
			case "/":
				if(n2 == 0)
				{
					System.out.println("0으로 나눌 수 없어요!!");
					return;
				}
				result = n1 / n2;
				result = (int)(result*100)/100.0;
				break;
			default:
				System.out.println("잘못된 연산");
				return;
		}
		
		System.out.println(n1+ op1 +n2+"의 계산 결과는 "+result);
		sc1.close();
	}
}






