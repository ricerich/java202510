package ch03_ex;

import java.util.Scanner;

public class TestWhile {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("숫자 입력(7에서 종료)>>>");
		int num = sc1.nextInt();
		
		while(true)//2.종료 식
		{
			System.out.println("현재num: "+num);
			System.out.println("hello!");
			System.out.println("hi!");
			System.out.println("James...");
			System.out.println("");
			
			if(num == 7)
				break;
			
			num++;
		}

	}

}
