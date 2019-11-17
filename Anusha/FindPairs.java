NOV15th
import java.util.*;
public class Main
{
    static void primeNumbers(int maxm, int [] prime)
    {
    prime[0] = prime[1] = 1; 
  
        for (int i = 2; i * i <= maxm; i++) 
            if (prime[i]==0) 
                for (int j = 2 * i; j <= maxm; j += i) 
                    prime[j] = 1; 
    }
    
     static long countPair(int a[], int n) 
    { 
        int maxm = a[0]; 
       
          
        for(int j = 1; j < n; j++) 
            if(a[j] > maxm) 
            maxm = a[j]; 
          
        int [] prime = new int[maxm + 1]; 
          
        for(int k = 0; k < maxm + 1; k++) 
            prime[k] = 0; 
      
         //Find primes upto maximum 
        primeNumbers(maxm, prime); 
      
   
        int countPrimes = 0; 
        for ( int j = 0; j < n; j++) 
            if (prime[a[j]] == 0) 
                countPrimes++; 
      
        int nonPrimes = n - countPrimes; 
        long pairswith1Prime = nonPrimes *  
                                countPrimes; 
        long pairsWith2Primes = (countPrimes *  
                            (countPrimes - 1)) / 2; 
      
        return pairswith1Prime + pairsWith2Primes; 
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
	 System.out.println(countPair(numbers, a));
}
}

