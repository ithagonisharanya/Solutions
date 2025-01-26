public class EvenArray
{
public static void main(String[] args)
{
int sum=0;
int a[]={1,2,3,4,5,6,7,8,9,10};
System.out.print("Even nmber");
for(int i=0; i<a.length; i++)
{
if(a[i] %2 == 0)
{
System.out.print(a[i]+" ");
sum=sum+a[i];
}
}
System.out.println();
System.out.print("sum="+sum);
}
}

