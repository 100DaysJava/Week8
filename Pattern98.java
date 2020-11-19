//Patterns series
package Patterns5;
public class Pattern98 {
	public static void main(String[] args) {
	int n= 9;
	int x = n/2+1; // x=5
	for(int i = 1; i<=n ; i++) // i = 1,2.9 rows
	{
		for(int j=1; j<=n; j++) // j=1..9 cols
		{
			if (j == x || j== n-x+1)	 		
				System.out.print(x);
			else
				System.out.print(" ");			
		}
		System.out.println();
		if (i<=n/2) // i =1,
			x=x-1; // x=4
		else // i= 5,..
			x = x+1;
	}
} }
