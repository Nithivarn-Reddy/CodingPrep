import java.util.*;
class Prime_Pair{
public static void main(String args[])
{
int i,n=0,target,prime_count,np_count,total;
int[] a=new int[20];
Prime_Pair t=new Prime_Pair();
Scanner s = new Scanner(System.in);
System.out.println("Enter the length of the array:");
n = s.nextInt();
System.out.println("Enter elements");
for(i=0; i<n; i++) 
{
a[i] = s.nextInt();
}
prime_count=t.find_prime(a);
np_count=n-prime_count;
int Prime_1_Pairs=prime_count*np_count;
int Prime_2_Pairs=(prime_count*(prime_count-1))/2;
total=Prime_1_Pairs+Prime_2_Pairs;
System.out.println("Prime_1_Pairs: " + Prime_1_Pairs);
System.out.println("Prime_2_Pairs: " + Prime_2_Pairs);
System.out.println("Total Pairs: " + total);
}
int find_prime(int[] a)
{
int prime_count=0,i;
for(i=0;i<a.length;i++)
{
if((a[i]!=1)&&(a[i]%2!=0))
{
prime_count++;
}
}
System.out.println(prime_count);
return prime_count;
}
}