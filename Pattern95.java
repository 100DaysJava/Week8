package Patterns4;
public class Pattern95 {
	public static void main(String[] args) {
	int n= 5;
	int x =1;
	int y= n*2-1; // y = 9
	
	for(int i= 1; i<=n; i++) // i=1,2,3,4,5 row
	{
		for(int j=1;j<=(n*2)-1; j++) // j =1 ..9 cols
		{
			if(j==x || j==y) // 5==5 || 5 == 5
				System.out.print("*");
			else
				System.out.print(" ");			
		}
		
		System.out.println(); // 2 row
		x=x+1; // x = 2,3,4,5
		y=y-1; // y = 8,7,6,5
	}
} }
