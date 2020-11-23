package Patterns5;
public class Pattern101 {
	public static void main(String[] args) {
	int n = 5;
	int x = n;
	int y = n;
	
	for(int i=1; i<= n; i++) // i = 1,2..5 rows
	{
		for(int j=1; j < n*2; j++) // j= 1..9 cols
		{
			if(j > x && j <y) // 5 > 4 && 5 < 6 -> t
				System.out.print(" "); // 0,1,3,5,7 spaces
			else
				System.out.print("*"); // * -> 9
		}
		System.out.println();
		x= x-1; // x = 4,3
		y= y+1; // y = 6,7
	}
} }
