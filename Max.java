public class Max
{
public static void main(String[] args)
{
int a[]={1,2,3,12,13,43,15,20,11};
int max=a[0];

for(int i=1; i<a.length; i++)
{
if(a[i]>max)
{
max=a[i];
}
}
System.out.print(max);
}
}

