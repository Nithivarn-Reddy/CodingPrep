/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nov18th;
import java.util.*;


/**
 *
 * @author anusha
 */
public class Nov18th {

    public static int reverseNumber(int b)
    {
       int reverse = 0;
       final int MAX = Integer.MAX_VALUE;
       final int MIN = Integer.MIN_VALUE;
       while(b!=0)
       {
           int l =b%10;
           b = b/10;
           //int max =Integer.MAX_VALUE;
           //int min = Integer.MIN_VALUE;
           
       
        //System.out.println(max);
        //System.out.println(min);
           if((reverse>MAX/10)||(reverse==MAX/10 && l>7))
              return 0;
           if((reverse<MIN/10)||(reverse==MIN/10 && l<-8))
               return 0;
               //System.out.println(0);
           reverse = reverse*10 + l;
    }
       //System.out.println(reverse);
       return reverse;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println(reverseNumber(a));  
       
    }
    
}
