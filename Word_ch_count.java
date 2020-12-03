package String_Prgs;
import java.util.*;
public class Word_ch_count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int word = 0;
		System.out.println("enter string:");
		//This is 100 days java Coding
		String str = sc.nextLine();
		String s="";
		char[] ch = str.toCharArray();
		for(int i = 0; i<ch.length; i++) // i = 5
		{
			 s = "";
			while(i<ch.length && ch[i] != ' ') // ch[7] = space -> f
			{
				s = s+ch[i]; // s=is
				i++; // i = 7
			}
			word = word+1; // word = 2
			if(s.length() > 0 )
				System.out.println(s + " = "+ s.length());			
		}
		System.out.println("no of words "+word);
} }

