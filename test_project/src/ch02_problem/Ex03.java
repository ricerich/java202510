package ch02_problem;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = sc1.nextInt();
		
		int cnt=0;
		
		cnt   = money/50000;
		money = money%50000;
		
		if(cnt>0)
			System.out.println("오만원권 "+ cnt + " 매");
		
		cnt   = money/10000;
		money = money%10000;
		if(cnt>0)
			System.out.println("만원권 "+ cnt + " 매");
		
		cnt   = money/1000;
		money = money%1000;
		if(cnt>0)
			System.out.println("천원권 "+ cnt + " 매");
		
		cnt   = money/500;
		money = money%500;
		if(cnt>0)
			System.out.println("오백원짜리 "+ cnt + " 개");
		
		cnt   = money/100;
		money = money%100;
		if(cnt>0)
			System.out.println("백원짜리 "+ cnt + " 개");
		
		cnt   = money/50;
		money = money%50;
		if(cnt>0)
			System.out.println("오십원짜리 "+ cnt + " 개");
		
		cnt   = money/10;
		money = money%10;
		if(cnt>0)
			System.out.println("십원짜리 "+ cnt + " 개");
		
		cnt   = money/1;
		money = money%1;
		if(cnt>0)
			System.out.println("일원짜리 "+ cnt + " 개");
	}

}
