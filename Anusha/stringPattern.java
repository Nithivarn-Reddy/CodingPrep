/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.lang.*;
import java.util.*;
public class Main
{
   public static int patternMatching(String s, String p)
{
    int count = 0;
    String substr = " ";
    int plen = p.length();
   int slen =  s.length();
	for(int i=0; i<slen;i++)
	{
	    int j =0;
	    if(s.charAt(i)==p.charAt(j))
	    {
	      substr = s.substring(i,i+plen);
	    if(substr.compareTo(p)==0)
	    {
	        count++;
	        System.out.println("Start"+i);
                    i=i+plen-1;
	    }
	    }
	}
	return count;
}
    
    
    

	public static void main(String[] args) {
		//System.out.println("Hello World");
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		System.out.println("Enter the pattern");
		String pattern = sc.nextLine();
		System.out.println(patternMatching(input, pattern));
		
	}
}
