class A
{
public void show()
{
System.out.println("it is a class");
}
private class B
{
 public void config()
{
System.out.println("it a inner class");
}
}

public static void main(String[] args)
{
A  obj =new A();
obj.show();
//A.B obj1 = new B(); //if use static inner class
A.B obj1 = obj.new B();
obj1.config();
}
}