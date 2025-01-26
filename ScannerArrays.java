import java.util.*;

public class ScannerArrays
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
int[] a= new int[5];
for(int i=0; i<a.length; i++)
{
System.out.print(i);
a[i]=sc.nextInt();
}
}
}