package ch03_ex;

import java.util.Scanner;

public class TestDoWhile {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		
		int num=0;
		
		do
		{
			System.out.print("숫자1개 입력(0넣으면 종료)>>");
			num = sc1.nextInt();			
		}
		while(num != 0);
	}
}
