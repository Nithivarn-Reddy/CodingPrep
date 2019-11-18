import java.util.*;
class Find_Indices{
public static void main(String args[])
{
int i,n=0,target;
int[] a=new int[20];
Find_Indices t=new Find_Indices();
Scanner s = new Scanner(System.in);
System.out.println("Enter the length of the array:");
n = s.nextInt();
System.out.println("Enter sorted array:");
for(i=0; i<n; i++) 
{
a[i] = s.nextInt();
}
System.out.println("Enter target");
target = s.nextInt();
t.find_indices(a,target);
}
public int find_indices(int[] a, int target)
{
int i,j=0;
int[] b=new int[20];
for(i=0;i<a.length;i++)
{
if(a[i]==target)
{
b[j]=i;
j++;
}
}
if(j==0)
{
	System.out.println("[-1,-1]");
}
else
{
System.out.println("["+b[0]+","+b[j-1]+"]");
}
return 1;
}
}
