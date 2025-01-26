public class Duplicate
{
public static void main(String[] args)
{
int temp;
int a[]={11,11,2,3,3,4,4,16,16,8,9,9};
for(int i=0; i<a.length-1; i++)
{
for(int j=0; j<a.length-1-i; j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.print("Assending oder:");
for(int i=0; i<a.length; i++)
{
System.out.print(a[i]+" ");
}
System.out.println();
System.out.print("DupilicateElements");
for(int i=0; i<a.length-1;i++)
{
if(a[i]!=a[i+1])
{
System.out.print(a[i]+" ");
}
}
System.out.println(a[a.length-1]);
}
}