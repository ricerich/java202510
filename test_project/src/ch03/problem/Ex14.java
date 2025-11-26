package ch03.problem;

import java.util.Scanner;

public class Ex14 
{
	public static void main(String[] args) 
	{
		 String course [ ] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		 int score [ ] = {95, 88, 76, 62, 55};
		 
		 Scanner sc1 = new Scanner(System.in);
		 
		 while(true) {
			 System.out.print("과목 이름>>>");
			 String name = sc1.next();
			 
			 if(name.equals("그만")) {
				 System.out.println("종료합니다!");
				 break;
			 }
			 
			 int idx=0;
			 for(int i=0; i<course.length; i++)
			 {
				 idx=i;
//				 if(name == course[i])
//				 if(name.equals(course[i]))
				 if(course[i].equals(name)) {
					 System.out.println(course[i]+"의 점수는 "+score[i]);
					 break;
				 }
				 idx++;
			 }
			 
			 if(idx==course.length)
				 System.out.println("그런 과목은 없습니다!");
		 }
	}
}





