final class chinnu
{
final int a;
public chinnu(int a)
{
this.a=a;
}
final void show()
{
System.out.println("final method"+ a);
}
}
class Fnal
{
public static void main(String[] args)
{
chinnu c = new chinnu(10);
c.show();
}
}