public class NthHighest
{
public static void main(String[] args)
{
int temp;
System.out.println("Sorting");
int a[]={23,43,12,11,1,2,4,5,66,7,8,90,120,2136,3};
int n=1;
for(int i=0;i<a.length-1;i++)
{
for(int j=0; j<a.length-1-i; j++)
{
if(a[j]<a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}

for(int i=0; i<a.length; i++)
{
System.out.print(a[i]+" ");
}
System.out.println();
if(n<=a.length)
{
int NthHighest = a[n-1];
System.out.println("NthHighest number is="+NthHighest);
}
}
}