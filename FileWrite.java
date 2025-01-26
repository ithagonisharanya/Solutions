import java.io.*;
class FileWrite
{
public static void main(String[] args)
{
String[] names={"Adhaya","Junnu","Rishika","pandu","sharanya"};
try
{
BufferedWriter writer = new BufferedWriter(new FileWriter("Tata"));
writer.write("writing to a file");
writer.write("\n Second line.");
for(String name:names)
{
//System.out.println(name);
writer.write("\n"+name);
}
writer.close();
}

catch(Exception e)
{
e.printStackTrace();
}
}
}