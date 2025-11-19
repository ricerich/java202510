package ch04.problem;

import java.util.Scanner;

class Dictionary {
	private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	
	public static String kor2Eng(String word) {
		
		for(int i=0; i<kor.length; i++) {
//			if(word.equals(kor[i]))
			if(kor[i].equals(word))
			{
				return eng[i];
			}
		}
		
		return null;
	}
}


public class Ex10 {

	public static void main(String[] args) 
	{
		System.out.println("한영단어 검색 프로그램입니다.");
		
		while(true) {
			
			Scanner sc1 = new Scanner(System.in);
			
			System.out.print("한글단어 입력>>>");
			String word = sc1.next();
			
			if(word.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			
			String eng = Dictionary.kor2Eng(word);
			
			if(eng == null)
				System.out.println(word+"은 저의 사전에 없습니다");
			else
				System.out.println(word+"는 "+eng+" 입니다.");
			
			
		}
	}

}





