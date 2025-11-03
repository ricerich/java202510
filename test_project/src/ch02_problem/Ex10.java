package ch02_problem;

import java.util.Scanner;

public class Ex10 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("첫번째 원의 중심(x, y)과 반지름(r) 입력>>>");
		
		int x1 = sc1.nextInt();
		int y1 = sc1.nextInt();
		double r1 = sc1.nextDouble();
		
		System.out.print("두번째 원의 중심(x, y)과 반지름(r) 입력>>>");
		
		int x2 = sc1.nextInt();
		int y2 = sc1.nextInt();
		double r2 = sc1.nextDouble();
		
		double l = Math.sqrt( ((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2)) );
		
		if(l > r1+r2)
			System.out.println("두 원은 서로 안 겹칩니다!");
		else if(l < r1+r2) 
			System.out.println("두 원은 서로 겹칩니다!");
		else
			System.out.println("두 원은 서로 접하고 있다");

	}

}
