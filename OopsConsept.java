abstract class Person
{
private String name;
private int age;
public Person(String name, int age)
{
this.name= name;
this.age=age;
}
public String getName()
{
return name;
}
public int getAge()
{
return age;
}
public abstract void displayDetails();
}
class Student extends Person
{
private String studentId;
public Student (String name, int age, String studentId)
{
super(name,age);
this.studentId= studentId;
}
public String getStudentId()
{
return studentId;
}
public void displayDetails()
{
System.out.println(studentId);
System.out.println(getName());
System.out.println(getAge());
}
}
class OopsConsept
{
public static void main(String[] args)
{
Student s= new Student("sharanya",1,"1234");
s.displayDetails();
}
}



