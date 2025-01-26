public class HighestNumber
{
public static void main(String[] args)
{
int temp;
System.out.print("Decsending Oder");
int a[]={2,1,4,3,16,7,34,8};
for(int i=0; i<a.length-1; i++)
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
int highest= a[0];
System.out.println("the highest number is="+ highest);
}
}
