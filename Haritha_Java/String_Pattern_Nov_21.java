import java.util.*;
class String_Pattern_Nov_21{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String_Pattern_Nov_21 sp=new String_Pattern_Nov_21();
	System.out.println("Enter String");
	String str=s.nextLine();
	System.out.println("Enter Pattern");
	String pattern=s.nextLine();
	System.out.println("Total Ocurrences : " + sp.find_pattern(str,pattern));
}
int find_pattern(String str, String pattern)
{
	int i=0,count=0;
	System.out.print("Start indices: ");
	while(i<(str.length()-pattern.length()+1))
	{
		if(str.substring(i,i+pattern.length()).equals(pattern))
		{
			count++;
			System.out.print(" " + i);
		}
		i++;
	}
	return count;

}

}