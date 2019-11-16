import java.util.*;
class Pair 
{ /*static int facto(int n)
	{
		if(n==2)
			return 2;
		else 
			return n*facto(n-1);
	}*/
	public static void main(String[] args) 
	{
		int n,i,j,flag,cnt=0,no1=0,no2=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n");
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
System.out.print("primes in the above list are");
		for(i=0;i<n;i++)
		{ flag=0;if((a[i]%2==0&&a[i]!=2)||a[i]==1) flag=1;
		else
			{
			  for(j=3;j<=Math.sqrt(a[i]);j++)
			   {
				 if(a[i]%j==0)
				   {flag=1; break;}
			   }
			}

			if(flag==0)
			{cnt++; System.out.print(a[i]+"   ");}
		}
		no1=cnt*(n-cnt);
		if(cnt>=2)no2=cnt*(cnt-1)/2;
		
		System.out.println("cnt is "+(no1+no2));
        
	}
}
