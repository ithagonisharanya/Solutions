class Fibonacii
{
public static void main(String[] args)
{
int n=10,a=0,b=1;
int c;
for(int i=1; i<=n; i++)
{
System.out.print(a+",");
c=a+b;
a=b;
b=c;
}
}
}