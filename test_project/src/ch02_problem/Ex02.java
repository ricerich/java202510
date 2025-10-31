package ch02_problem;

import java.util.Scanner;

public class Ex02 
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
		
		if(ten == one) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
		}
		else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다");
		}
		
		
	}
}





