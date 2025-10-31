package ch02_problem;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수 3개 입력>>>");
		
		int n1 = sc1.nextInt();
		int n2 = sc1.nextInt();
		int n3 = sc1.nextInt();
		
		if( n1>n2+n3 ||
			n2>n1+n3 ||
			n3>n1+n2)
		{
			System.out.println("안됨!");
		}
		else
			System.out.println("삼각형ㅇㅇ");
//		
//		if( n1<n2+n3 &&
//				n2<n1+n3 &&
//				n3<n1+n2)
//		{
//			System.out.println("삼각형ㅇㅇ");
//		}
//		else
//			System.out.println("안됨!");
		
		
	}

}



