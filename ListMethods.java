import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

class ListMethods
{
public static void main(String[] args)
{

List<Integer> list = new ArrayList<Integer>();
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
list.add(60);
list.add(70);
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
list.add(60);
list.add(70);
System.out.println(list);
//Removing
list.remove(3);
System.out.println(list);
//add String element
//list.add(3,"sharanya");
//System.out.println(list);
//retriing value
//get value
System.out.println(list.get(0));
//change the value
list.set(0,2136);
System.out.println(list);
//contains= true or false
System.out.println(list.isEmpty());
//for(int i=0;i<list.size();i++)
//{
//System.out.println(list.get(i));
//}
//for ecch
//for(int n:list)
//{
//System.out.println(n);
//}
//Itarater
//Iterator it =list.iterator();
//while(it.hasNext())
//{
//System.out.println(it.next());
//}
//sorted Array
Collections.sort(list);
System.out.println(list);
//reverse Oder
Collections.sort(list,Collections.reverseOrder());
System.out.println(list);
//addAll
list.addAll(list);
System.out.println(list);
//removeAll
list.removeAll(list);
System.out.println(list);
}
}
