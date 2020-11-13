package Patterns4;
public class Pattern94 {	
		public static void main(String[] args) {
			int n = 5;
			int x = n; // x = 5
			int y = n; // y = 5
			
			for(int i = 5; i >= 1; i--) // i = 5,4,3,2,1
			{
				for(int j= 1; j<= (n*2)-1; j++)// j= 1,2,3,4,5,6,7,8,9
				{
					if(j==x || j==y) // 5==5||5==5 -> t
						System.out.print((char)(i+64));  //5 
					else
						System.out.print(" ");
				}
				System.out.println();
				x = x-1; // x = 4,3,2,1
				y = y+1; // y = 6,7,8,9
			}
	} }

