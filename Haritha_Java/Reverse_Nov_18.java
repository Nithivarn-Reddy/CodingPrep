import java.util.*;
import java.lang.*;
public class Reverse{
public static void main(String args[])
{
int n,reverse;
Reverse r=new Reverse();
Scanner s=new Scanner(System.in);
System.out.println("Enter n");
n=s.nextInt();
System.out.println("Max Value of a Signed Integer : " + Integer.MAX_VALUE);
System.out.println("Min Value of a Signed Integer : " + Integer.MIN_VALUE);
reverse=r.find_reverse(Math.abs(n));
if(n>0)
{
System.out.println(reverse);
}
else
{
System.out.println("-"+reverse);
}
}

int find_reverse(int n)
{
int r,rev=0;
while(n!=0)
{
r=n%10;
n=n/10;
if((rev == Integer.MAX_VALUE/10 && n>7) || (rev > Integer.MAX_VALUE/10))	
{
return 0;
}
if (rev == Integer.MIN_VALUE/10 && n<-8 || rev <Integer.MIN_VALUE/10)
{
return 0;
}
rev=rev*10+r;
}
return rev;
}
}
