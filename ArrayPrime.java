public class ArrayPrime
{
public static void main(String[] args)
{
int count=0,sum=0;
int a[]={2,3,5,6,7,8,9,12,23,122,34,55,65,76,18,10};
for(int i=0; i<a.length; i++)
{
count=0;
for(int j=1; j<=a[i]; j++)
{
if(a[i]%j==0)
{
count++;
}
}
if(count==2)
{
System.out.print(a[i]+" ");
sum=sum+a[i];
}
}
System.out.println();
System.out.print("total sum="+sum);
}
}