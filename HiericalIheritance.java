class Animal
{
void eat()
{
System.out.println("Eating...");
}
}
class Dag extends Animal
{
void sleep()
{
System.out.println("Sleeping...");
}
}
class BabyDog extends Animal
{
void darks()
{
System.out.println("darking....");
}
}
class HiericalIheritance
{
public static void main(String[]args)
{
BabyDog b = new BabyDog();
b.eat();
b.darks();
}
}
