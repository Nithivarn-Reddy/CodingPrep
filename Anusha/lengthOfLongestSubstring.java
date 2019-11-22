/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
import java.lang.*;;
public class Main
{
	public static int lengthOfLongestSubstring(String input) {
	
		if (input == null || input.length() == 0) {
			return 0;
		}

		Set<Character> set = new HashSet<>();
		int l = 0;
		int r = 0;
		int max = 0;

		while (r< input.length() && l <= r) {
			
			if (set.add(input.charAt(r))) {
				
				r++;
				max = Math.max(max, set.size());
			} else {
			
				set.remove(input.charAt(l));
				l++;
			}

		}
		return max;
	}

	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter Input");
		String a = sc.nextLine();
		System.out.println(lengthOfLongestSubstring(a));
	}
}
