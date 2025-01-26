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
class MySerializable1
{
public static void main(String[] args)
{
    MySerialandDeserial sd = new MySerialandDeserial("sharanya", 101);
    try{
        FileOutputStream file = new FileOutputStream("MyTesr.txt");
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(sd);
        out.close();
        
        file.close();
System.out.println("serialization sussfull");
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }

}
}
