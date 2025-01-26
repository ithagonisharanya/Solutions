class Test3
{
String name = "sharanya";
}
class Food extends Test3
{
double salary= 100000.0;
}
class Inheritance
{
public static void main(String[] args)
{
Food f = new Food();
System.out.println("name:"+f.name);
System.out.println("salary:"+f.salary);
}
}