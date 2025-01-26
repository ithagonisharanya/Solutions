public class EvenTwod
{
public static void main(String[] args)
{
int sum=0,
int a[][]={{1,2,3},{5,6,7}};
System.out.print("Even numbers:");
for(int i=0;i<a.length; i++)
{
for(int j=0; j<a[i].length;j++)
{
if(a[i][j]%2==0)
{
System.out.print(a[i][j]);
sum=sum+a[i][j];
}
}
}
System.out.println();
System.out.println("sum of even numbers:"+sum1);
}
}