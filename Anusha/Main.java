/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
    static void returnIndices(int []a, int n)
    {
         int first =-1;
        int len = a.length;
        for(int i =0; i<len;i++)
        {
                  if(a[i]==n)
                  {
                     
                  first = i; 
                  break;
                  }
        }
       
    
    int last = first;
    for(int i = len-1; i>=0;i--)
    
    {
     if(a[i]==n)
    {
                     
    last = i; 
    break;
    }
    }
     if(first == -1 && last ==-1)
        {
            System.out.println("Match not found"+first);
             System.out.println("Match not found"+last);
        }
    else if (first == last) 
            System.out.println("Only one key is present at index : " + first); 
        else { 
            System.out.println("Start index: " + first); 
            System.out.println("Last index: " + last); 
        } 
   }

	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of an array");
		 int a = sc.nextInt();
    int[] numbers = new int[a];

    for (int i = 0; i < numbers.length; i++)
    
    {
        System.out.println("enter number");
        numbers[i] = sc.nextInt();
        
    }
    
  
  
	System.out.println("enter target");

        int n = sc.nextInt();
        returnIndices(numbers,n);
        //System.out.println(returnIndices(numbers,n));
}

}
