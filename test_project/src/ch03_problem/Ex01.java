package ch03_problem;

public class Ex01 
{
	public static void main(String[] args) 
	{
//		int sum=0, i=0;
//		while(i<100)
//		{
//			System.out.println(i);
//			sum = sum + i;
		 
//			i += 2;//i = i + 2;	
//		}
		
		int sum=0;
		for(int i=0; i<100; i=i+2)
		{
			sum = sum + i;
		}
		
		System.out.println(sum);
	}
}






