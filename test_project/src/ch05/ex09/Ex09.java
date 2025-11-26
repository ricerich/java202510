package ch05.ex09;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("총 스택의 크기 입력>>");
		int capacity = sc1.nextInt();
		StringStack ss1 = new StringStack(capacity);
		
		while(true) {
			System.out.print("과일 입력>>");
			String fruit = sc1.next();
			
			if(fruit.equals("그만")) {
				break;
			}
			
			boolean ok = ss1.push(fruit);
//			if(!ok)
			if(ok == false) {
				System.out.println("스택이 꽉 찼어 더이상 못 넣어요!");
			}
		}
		
		System.out.print("모든 과일 출력:");
		
//		for(int i=0; i<ss1.length(); i++) //이거 안됨!!
		
		int cnt = ss1.length();
		for(int i=0; i<cnt; i++)
		{
			System.out.print(ss1.pop()+" ");
		}
		

	}

}




