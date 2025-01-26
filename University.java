class College
{
 String name="RBVRR";
 String address="Narayanguda";
void love()
{
System.out.println("My college.......");
}
}
class Department
{
 void romance()
{
College c = new College();
c.love();
System.out.println(c.name);
System.out.println(c.address);
System.out.println("From my University");
}
}
class University
{
public static void main(String[] args)
{
Department d = new Department();
d.romance();
}
}


