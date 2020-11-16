
package Patterns5;
public class Pattern96{
	public static void main(String[] args) {
	int n = 9;
	int x = n/2+1;  // x = 5
	for(int i =1; i<= n; i++) // i=1,2,3,4,5..9 rows
	{
		for(int j=1; j<=n;j++) // j=1..9 cols
		{
			if( j == x || j == n-x+1) // j = 2	|| j = 9-2+1 = 8		
			 System.out.print("*"); // *
			else
			 System.out.print(" ");
		}		
		System.out.println();
		
		if( i <= n/2)  // 1 <= 9/2 = 4 -> t
			x=x-1; // x = 5-1 = 4,3,2,1
		else
			x=x+1; // x= 2,3,4,5
	}
} }
