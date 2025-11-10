package ch03_problem;

public class Ex13 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=99; i++)
		{
			int ten = i / 10;
			int one = i % 10;
			
			int cnt=0;
			
			if( ten==3 || ten==6 || ten==9){
				cnt++;
			}
			
			if( one==3 || one==6 || one==9){
				cnt++;
			}
			
			String str1[] = {"박수짝", "박수짝짝"};
			
			switch(cnt) 
			{
				case 1:
					System.out.println(i+" " + str1[0]);
					break;
				case 2:
					System.out.println(i+" " + str1[1]);
					break;				
			}
		}
	}
}
