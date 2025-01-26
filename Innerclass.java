class A
{
public void show()
{
System.out.println("it is a class");
}
class B
{
public void config()
{
System.out.println("it a inner class");
}
}

public static void main(String[] args)
{
A  obj =new B();
obj.show();
A.B obj1 = new A.B();
obj1.config();
}
}