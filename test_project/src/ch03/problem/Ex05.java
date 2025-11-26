package ch03.problem;

import java.util.Scanner;

public class Ex05 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력해주세요>>>");
		
		int arr[] = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = sc1.nextInt();
		}
		
		System.out.print("3의 배수는 ");
		for(int i=0; i<10; i++) {
			if(arr[i]%3 == 0 && arr[i]!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}





