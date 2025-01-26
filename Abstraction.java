abstract class Bike
{
abstract void run();
}
class Honda extends Bike
{
void run()//override
{
System.out.println("Be safty");
}
}
class Tvs
{
void drive(Bike b)
{
System.out.println("Drive Smoothly");
}
}
class Abstraction
{
public static void main(String[] args)
{
Bike b = new Honda();
b.run();
Tvs t = new Tvs();
t.drive(b);
}
}