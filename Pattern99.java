package Patterns5;
public class Pattern99 {
		public static void main(String[] args) {
		int n = 9; // rows	
		int x = n/2+1 ;  // x = 5 -> position
		int p = 1;  //values
		
		for(int i=1; i<=n ; i++) // i= 1,2,3,4,5,6,7,8,9,10<=9->f rows
		{
			for(int j=1; j <=n; j++) // j=1 .. 9 cols
			{
				if(j == x || j == n-x+1 )  // j==5||j==5
				  System.out.print((char)(p+64)); // 1,2,3,4,5,4,3,2,1
				else
			     System.out.print(" ");
			}
			System.out.println();
			if(i<=n/2) // 5 <= 4 -> f
			{
				p=p+1;    // p=2,3,4,5
				x = x-1; // x=4,3,2,1
			}
			else // if  i = 5,6,7,8,9
			{
				p=p-1; // p = 4,3,2,1,0 -> value
				x=x+1; // x = 2,3,4,5,6-> position
			}
		}
		} }
