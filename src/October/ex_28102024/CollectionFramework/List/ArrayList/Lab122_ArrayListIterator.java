package October.ex_28102024.CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab122_ArrayListIterator {
    public static void main(String[] args) {
        System.out.println(" store onlt integers in the arrayList");
        List<Integer> list=new ArrayList<>();
        list.add(15);
        list.add(16);
        list.add(18);
        list.add(19);
        Iterator<Integer> i=list.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
