package ch03_problem;

import java.util.Scanner;

public class Ex16 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다");
		
		String str[] = {"가위", "바위", "보"}; 
		
		while(true)
		{
			System.out.print("가위 바위 보>>");
			String me = sc1.next();
			
			if(me.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			
			int n = (int)(Math.random()*3); //컴퓨터가 낸것을 랜덤하게 선택
			String com = str[n];
			
			System.out.print("사용자="+me+", 컴퓨터="+com+", ");
			
//			if(!(me.equals("가위") || me.equals("바위") || me.equals("보"))) {
//				System.out.println("다시 하세요");
//				continue;
//			}
		     
			if(me.equals("가위")) {
				if(com.equals("가위")) 
					System.out.println("비겼습니다.");
				else if(com.equals("바위")) 
					System.out.println("컴퓨터가 이겼습니다.");
				else if(com.equals("보")) 
					System.out.println("사용자가 이겼습니다.");
			}
			else if(me.equals("바위")) { 
				if(com.equals("가위")) 
					System.out.println("사용자가 이겼습니다.");
				else if(com.equals("바위"))
					System.out.println("비겼습니다.");
				else if(com.equals("보")) 
					System.out.println("컴퓨터가 이겼습니다.");
			}
			else if(me.equals("보")) { 
				if(com.equals("가위")) 
					System.out.println("컴퓨터가 이겼습니다.");
				else if(com.equals("바위")) 
					System.out.println("사용자가 이겼습니다.");
				else if(com.equals("보")) 
					System.out.println("비겼습니다.");
			}
			else
				System.out.println("다시하세요!");
			
		}
		
     
		
     
		
	}
}




