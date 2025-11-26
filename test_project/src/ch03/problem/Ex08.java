package ch03.problem;

import java.util.Scanner;

public class Ex08 
{
	//어떤 수(r)가 배열(arr)에서, 어디까지(end) 있는지 없는지 판별해서 True, False를 반환하는 함수
	public static boolean check(int r, int arr[], int end)
	{
		for(int i=0; i<end; i++) {
			if(r == arr[i]) {
				return true;//똑같은게 있어!
			}
		}
		return false;//똑같은게 없어
	}
	
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수 몇 개? >>");
		int n = sc1.nextInt();
		
		if(n<=0 || n >=100) {
			System.out.println("1~99사이의 수를 입력하셔야 합니다");
			sc1.close();
			return;
		}
		
		int arr[] = new int[n]; //예: 24개짜리
		
		//1.입력
		for(int i=0; i<arr.length; i++) {
			int r = (int)(Math.random()*100+1);
			
			//방법1: 반복문 안에 반복문 형태로
//			for(int j=0; j<i; j++)//랜덤수 r을 기존에 들어간 값들과 전수 비교
//			{
//				if(arr[j] == r)//랜덤수가 들어있으면 넣으면 안됨!
//				{
//					i--;
//					break;
//				}
//				
//				arr[i] = r;
//			}
			
			//방법2: 메소드를 사용해서 체크
//			boolean exist = check(r, arr, i);
//			if(exist) {//1.같은게 있음
			
			if(check(r, arr, i)) {//1.같은게 있음
				i--;
				continue;
			}

			arr[i]= r;	//2.같은게 없음
		}
		
		//2.출력
		for(int i=0; i<arr.length; i++) {
			
//			if(i!=0)
//			{
				if(i%10 == 0 && i!=0)
					System.out.println();
				
				System.out.print(arr[i] + " ");
//			}
//			else 
//				System.out.print(arr[i] + " ");
		}
		
	}

}




