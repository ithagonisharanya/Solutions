class A extends Thread
{
public void run()
{
for(int i=0;i<=10;i++)
{
System.out.println("hi");
}
}
//try
//{
//Thread.sleep(2000);
//}
//catch(Exception e)
//{
//System.out.println("Bye");
//}
//}
}
class B extends A
{
public void run()
{
for(int i=0; i<=10; i++)
{
System.out.println("hello");
}
}
}
class MyThread
{
public static void main(String[] args)
{
A t1= new A();
B t2= new B();
t1.start();
t2.start();
try
{
t1.join();
}
catch(Exception e)
{
e.printStackTrace();
}

}
}