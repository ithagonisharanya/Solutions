interface Lamda
{
void show(int i,int j);
}
class Expression 
{
public static void main(String[] args)
{
System.out.println("Annonymus Inner class");

/*Lamda l = new Lamda()
{
 public void show()
{
System.out.println("AnonymasInnerClass");
}
};
l.show();*/


System.out.println("LAmdaExpression");
Lamda l = (i,j) ->
{
int sum=i+j;
 System.out.println("new one"+sum);
};
l.show(7,8);



}
}