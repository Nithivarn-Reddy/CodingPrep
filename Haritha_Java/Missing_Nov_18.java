import java.util.*;
import java.lang.*;
public class Missing_Nov_18{
public static void main(String args[])
{
int i,n;
int[] a = new int[20];
//int[] temp=new int[20];
Missing_Nov_18 m=new Missing_Nov_18();
Scanner s=new Scanner(System.in);
System.out.println("Enter n");
n=s.nextInt();
System.out.println("Enter array");
for(i=1;i<=n;i++)
{
a[i]=s.nextInt();
}	
m.find_duplicate(a,n);
for(i=1;i<=n;i++)
{
if(a[i]>0)
{
System.out.println(i);
}
}
}

void find_duplicate(int[] a, int n)
{
	int i;
	for(i=1;i<=n;i++)
	{
		if(a[Math.abs(a[i])]>0)
		{
		a[Math.abs(a[i])]=-a[Math.abs(a[i])];
		//System.out.println(a[a[i]]);
		}
	}	
}
}