package ch04.problem.ex08;

import java.util.Scanner;

public class PhoneBook 
{
		
	Phone phoneArr[];
	
	Scanner sc;
	
	public PhoneBook()
	{
		sc = new Scanner(System.in);
	}
			
	public void input() {
//		Scanner sc = new Scanner(System.in);		
		
		System.out.print("인원수>>");
		int n = sc.nextInt();
		
		phoneArr = new Phone[n];
		for(int i=0; i<phoneArr.length; i++)
		{
			System.out.print("이름과 전화번호(빈칸없이입력)>>");
			String name = sc.next();
			String tel = sc.next();
			phoneArr[i] = new Phone(name, tel);
		}
		System.out.println("저장 되었습니다...");
		
	}
	
	public void search() {
		
		while(true) {
//			Scanner sc = new Scanner(System.in);
			System.out.print("검색할 이름>>");
			String name = sc.next();
			
			if(name.equals("그만")) {
				System.out.println("종료합니다");
				break;
			}
			
			//입력받은 이름이 전화번호 배열을 돌면서 안에 있는지 검사
			int i;
			for(i=0; i<phoneArr.length; i++) {
//				if(name.equals(phoneArr[i]))
				if(phoneArr[i].getName().equals(name)) {
					System.out.println(name+"의 번호는 "+phoneArr[i].getTel()+" 입니다");
					break;
				}
			}
			
			if(i==phoneArr.length)
				System.out.println("홍길동의 번호는 없습니다.");
		}
	}
	
	public void run() {
		input();
		search();
	}

}
