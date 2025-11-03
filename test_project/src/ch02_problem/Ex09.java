package ch02_problem;

import java.util.Scanner;

public class Ex09 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("원의 중심(x, y)과 반지름(r) 입력>>>");
		
		int x = sc1.nextInt();
		int y = sc1.nextInt();
		double r = sc1.nextDouble();
		
		System.out.print("점(px, py) 입력>>> ");
		int px = sc1.nextInt();
		int py = sc1.nextInt();
		
		//원의 두 점과 입력점의 길이를 계산
		double length = Math.sqrt( ((x-px)*(x-px)) + ((y-py)*(y-py)) );
		
		if(length > r)
			System.out.println("점("+px+", "+py+")은 원 밖에 있습니다");
		else if(length < r)
			System.out.println("점("+px+", "+py+")은 원 안에 있습니다");
		else
			System.out.println("점("+px+", "+py+")은 원의 선에 있습니다");

	}

}




