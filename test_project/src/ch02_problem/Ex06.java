package ch02_problem;

import java.util.Scanner;

public class Ex06 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("2자리의 정수입력(10~99)>>>");
		int num = sc1.nextInt();
		
		if( (num<10) || (num>99)){
			System.out.println("2자리의 수만 입력가능합니다!");
			return;
		}
		
		int ten = num / 10;
		int one = num % 10;
		
		int cnt=0;
		
		if( ten==3 || ten==6 || ten==9){
			cnt++;
		}
		
		if( one==3 || one==6 || one==9){
			cnt++;
		}
		
//		if( ten!=0 && ten%3==0){
//			cnt++;
//		}
//		
//		if( one!=0 && one%3 == 0){
//			cnt++;
//		}
		
		
//		if(cnt==1) {
//			System.out.println("박수짝");
//		}
//		else if(cnt==2) {
//			System.out.println("박수짝짝");
//		}
//		else {
//			System.out.println("박수없음!");
//		}
		
		String hand="";
		
		switch(cnt) 
		{
			case 0:
				hand = "박수없음!";
				break;
			case 1:
				hand = "박수짝";
				break;
			case 2:
				hand = "박수짝짝";
				break;				
		}
		
		System.out.println(hand);
		
	}

}




