package ch03_ex;

import java.util.Scanner;

public class TestFor {

	public static void main(String[] args) 
	{
//		Scanner sc1 = new Scanner(System.in);
//		System.out.print("반복횟수 입력>>>");
//		int num = sc1.nextInt();
		
		for(int i=0; i<3; i++) 
		{
			System.out.println(i+1);
			System.out.println("hello!");
			System.out.println("hi!");
			System.out.println("James...");
			System.out.println("");
		}
		
		int i=0;//1.초기 값
		while(i<2)//2.종료 식
		{
			System.out.println(i+1);
			System.out.println("hello!");
			System.out.println("hi!");
			System.out.println("James...");
			System.out.println("");
			i++;
		}
		

	}

}
