package ch03.problem;

import java.util.Scanner;

public class Ex06 
{
	public static void main(String[] args) 
	{
		int []unit = {50000, 10000,1000,500,100,50,10,1};
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = sc1.nextInt();
		
		int cnt=0;
		
		for(int i=0; i<unit.length; i++) {
			cnt   = money/unit[i];
			if(cnt>0) {
				money = money%unit[i];
				System.out.println(unit[i]+"권 "+ cnt + " 개");
			}
		}
	}

}
