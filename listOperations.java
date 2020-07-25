package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class listOperations {
    static ArrayList arr = new ArrayList(10);
    int fetchElements(int index)
    {
        
        return (Integer) arr.get(index);
        
    }
    void addElement(int ele)
    {
        arr.add(ele);
        System.out.println("Element is added successfully");
        Iterator itr = arr.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
    void removeElement(int ele)
    {
        arr.remove(ele);
    }
    void printElements()
    {
        Iterator i = arr.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}