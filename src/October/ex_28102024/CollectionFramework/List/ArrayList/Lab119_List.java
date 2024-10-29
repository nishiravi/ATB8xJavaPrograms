package October.ex_28102024.CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Lab119_List {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(1)); // returns false as 1 is integer
        System.out.println(list.contains("1")); // checks for string 1 , returns true as its present in the list
        System.out.println(list.isEmpty());

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println(" using for each loop");
        for (Object o:list)
        {
            System.out.println(o);
        }
            }
}
