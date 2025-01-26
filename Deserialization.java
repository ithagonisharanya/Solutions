import java.io.*;
class MySerialandDeserial implements Serializable
{

String name;
int num;
public MySerialandDeserial(String name, int num)
{
this.name=name;
this.num=num;
}
}
class Deserialization
{
public static void main(String[] args)
{
try
{
FileInputStream f = new FileInputStream("MyTest2.txt");
ObjectInputStream in = new ObjectInputStream(f);
MySerialandDeserial d = (MySerialandDeserial)in.readObject();
in.close();
f.close();
System.out.println("name:"+d.name);
System.out.println("number:"+d.num);
}
catch(Exception e)
{
e.printStackTrace();
}
}
}