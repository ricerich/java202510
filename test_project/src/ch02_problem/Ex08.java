package ch02_problem;

import java.util.Scanner;

public class Ex08 
{
	public static boolean inRect(int x, int y,
								 int rect_x1, int rect_y1, int rect_x2, int rect_y2)
	{
		if((x>=rect_x1 && x<=rect_x2)  && ( y>=rect_y1 && y<=rect_y2))
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("두 점(x1,y1), (x2,y2)의 좌표 입력>>>");
		
		int x1 = sc1.nextInt();
		int y1 = sc1.nextInt();
		int x2 = sc1.nextInt();
		int y2 = sc1.nextInt();
		
		// 점1: (x1,y1)
		// 점2: (X2,Y2)
		// 점3: (x1,y2)
		// 점4: (X2,Y1)
		
		//4점 중 1개라도 걸리면, 겹침
		
		if(inRect(x1,y1, 100, 100, 200, 200) || 
		   inRect(x2,y2, 100, 100, 200, 200) ||
		   inRect(x1,y2, 100, 100, 200, 200) ||
		   inRect(x2,y1, 100, 100, 200, 200))
		{
			System.out.println("사각형이 겹칩니다.");
		}
		else if(inRect(100, 100, x1, y1, x2, y2) || 
		        inRect(200, 200, x1, y1, x2, y2) ||
		        inRect(100, 200, x1, y1, x2, y2) ||
		        inRect(200, 100, x1, y1, x2, y2))
		{
			System.out.println("사각형이 겹칩니다.");
		}
		else if((x1<100 && x2>200) && 
				(y1>100 && y2<200))
		{
			System.out.println("사각형이 겹칩니다.");
		}
		else if((x1>100 && x2<200) && 
				(y1>100 && y2>200))
		{
			System.out.println("사각형이 겹칩니다.");
		}
		else if((x1>100 && x2<200) && 
				(y1<100 && y2>200))
		{
			System.out.println("사각형이 겹칩니다.");
		}
		else if((x1<100 && x2>200) && 
				(y1>100 && y2<200))
		{
			System.out.println("사각형이 겹칩니다.");
		}
		else
			System.out.println("사각형이 겹지 않습니다.");
			
		sc1.close();
	}
}
