import java.lang.String;
class ReverseString
{
public static void main(String[] args)
{
String name ="Shiva Sharanya";
StringBuilder sb = new StringBuilder(name);
sb.reverse();
System.out.println(sb);
}
}