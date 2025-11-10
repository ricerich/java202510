package ch03_problem;

public class Ex12 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int n=0;
		for(int i=0; i<args.length; i++) {
			try 
			{
				n = Integer.parseInt(args[i]);
				sum = sum + n;
			}
			catch(Exception e) {
				System.out.println(args[i] +"얘는 못더해요!");
			}
		}
		
		System.out.println("합계: " + sum);
		
	}

}
