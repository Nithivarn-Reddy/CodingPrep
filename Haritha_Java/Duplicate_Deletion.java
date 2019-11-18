import java.util.*;
class Duplicate_Deletion{
public static void main(String args[])
{
int i,n=0;
int[] a=new int[20];
Duplicate_Deletion t=new Duplicate_Deletion();
Scanner s = new Scanner(System.in);
System.out.println("Enter the length of the array:");
n = s.nextInt();
System.out.println("Enter sorted array:");
for(i=0; i<n; i++ ) 
{
a[i] = s.nextInt();
}
System.out.println(t.delete(a));
}
int delete(int[] a)
{
int i=0,j,c;
for(j=1;j<a.length;j++)
{
if(a[j]!=a[i])
{
i++;
a[i]=a[j];
}
}
System.out.println("Distinct items: ");
for(c=0;c<i;c++)
{
System.out.println(a[c]);
}
return i;
}
}