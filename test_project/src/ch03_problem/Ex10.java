package ch03_problem;

public class Ex10 
{
	public static void main(String[] args) 
	{
		int arr[][] = new int[4][4];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = 0;
			}
		}

		int cnt=0;
		while(cnt<10) {
						
			int row = (int)(Math.random()*4);
			int col = (int)(Math.random()*4);
			
			if(arr[row][col] == 0) {
				arr[row][col] = (int)(Math.random()*10+1);
				cnt++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
