
package Patterns4;
public class Pattern89 {
	public static void main(String[] args) {
		int n = 4, j, x= 1;
		
		for(int i = n; i>= -n; i--)
			// i = 4,3,2,1,0,-1,-2,-3,-4 -> 9 rows
		{
			for( j= 1; j <= Math.abs(i); j++) // j= 2<=1 ->f 
				System.out.print(" "); //1 ->space
			
			x= (i>0) ?1:j;
			
		/* or 
		 	if(i>0)
				x=1;
			else
				x=j; // x = 2  */
			
			for(int k=n; k >= Math.abs(i); k--) // k = 0>=1	
			{
				System.out.print((char)(x+64)+" "); // B C D E
			     x = x+1 ;  // x= 3,4,5
			}
			System.out.println();		     							
		}
}}
