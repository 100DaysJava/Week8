
package Patterns4;
public class Pattern88 {
	public static void main(String[] args) {
		int n = 4;
		int x= 1;
		for(int i = n; i>= -n; i--)
			// i = 4,3,2,1,0,-1,-2,-3,-4 -> 9 rows
		{
			for(int j= 1; j <= Math.abs(i); j++) // j=1,2,3,4
				System.out.print(" ");
			
			for(int k=n; k >= Math.abs(i); k--) // k = 4>=4			
				System.out.print((char)(x+64)+" "); // A
			
			System.out.println();
			     
			if(i>0)
			x = x+1; // x=2,3,4,5   
			else
				x=x-1; //x= 4,3,2,1					
		}
} }

