package ch03_problem;

public class Ex13_2 
{
	public static void main(String[] args) 
	{
		String str1[] = {"박수짝", "박수짝짝"};
		
		int num = 0;
		int one = 0;
		for(int i=1; i<=99; i++)
		{		
			int cnt = 0;
			num = i;
			for(one = num%10; num>0; one=num%10) {
				if(one==3 || one==6 || one==9)
					cnt++;
				num = num /10;
			}
			
			if(cnt>0)
				System.out.println(i +" " +str1[cnt-1]);
		
		}
	}
}
