import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

class TryCatchFinally
{
public static void main(String[] args)
{
int num=0;
try(
InputStreamReader in = new InputStreamReader(System.in);
BufferedReader bf = new BufferedReader(in))
{
System.out.println("Enter a number:");
num =Integer.parseInt(bf.readLine());
System.out.println(num);
}
catch(NumberFormatException e)
{
System.out.println("if it is not valid");
}
catch(IOException e)
{
System.out.println("hello:"+e.getMessage());
}

finally
{
System.out.println("Buffer Reader close");

}
}
}