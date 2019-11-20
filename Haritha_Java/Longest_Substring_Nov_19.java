import java.util.*;
class Longest_Substring {
    public int lengthOfLongestSubstring(String str) {
        int i,j=0,max_length=0;
        HashSet<Character> h=new HashSet<Character>();
        for(i=0;i<str.length();i++)
        {
			char ch=str.charAt(i);
            if(!h.contains(ch))
            {
                h.add(ch);
                j++;
            }
            else
            {
                if(j>max_length)
                    max_length=j;
                h.removeAll(h);
				h.add(ch);
                j=1;
            }
        }
        return max_length;
    }
    public static void main(String args[])
    {
		Longest_Substring sub_string=new Longest_Substring();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String");
        String str = s.nextLine();
        System.out.println(sub_string.lengthOfLongestSubstring(str));
    }
}