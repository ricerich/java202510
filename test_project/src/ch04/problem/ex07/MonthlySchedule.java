package ch04.problem.ex07;

import java.util.Scanner;

public class MonthlySchedule {

	private int total_day;//전체 일수 ==배열의 길이	
	private Day dayArr[]; //Day객체가 여러개인 배열(한달)
	
	private Scanner sc;
	
	public MonthlySchedule(int total_day) {
		this.total_day = total_day;
		this.dayArr = new Day[total_day]; 
		
		for(int i=0; i<dayArr.length; i++) {
			dayArr[i] = new Day();
		}
		
		sc = new Scanner(System.in);
	}

	private void input() {
		System.out.print("날짜(1~30)?");
		int nDay = sc.nextInt();
		
		if(nDay<1 || nDay>30) {
			System.out.println("(1~30)의 날짜를 입력하셔야 합니다!");
			return;
		}
		
		System.out.print("할일(빈칸없이입력)>>>");
		String work = sc.next();
		
		dayArr[nDay-1].set(work);
		
	}
	
	private void view() {
		System.out.print("날짜(1~30)?");
		int nDay = sc.nextInt();
		
		if(nDay<1 || nDay>30) {
			System.out.println("(1~30)의 날짜를 입력하셔야 합니다!");
			return;
		}
		
		System.out.print(nDay+"일의 할일은 ");
		dayArr[nDay-1].show();
	}
	
	private void finish() {
		System.out.println("프로그램을 종료합니다");
	}
	
	
	public void run() 
	{
		System.out.println("이번 달 스케쥴 관리 프로그램");
		
		while(true) {
			System.out.print("할 일(입력:1, 보기:2, 종료:3) >> ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					input();
					break;
				case 2:
					view();
					break;
				case 3:
					finish();
					return;
				default:
					System.out.println("잘못입력하셨습니다.");
			}
			System.out.println();
		}
	}

}





