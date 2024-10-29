package October.ex_28102024.CollectionFramework.List.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab123_Vector {
    public static void main(String[] args) {

        // Vector is tread safe , performance is slow
        // execution is after each tread , one after one usage
        List<Integer> list=new Vector<>();
        list.add(15);
        list.add(16);
        list.add(18);
        list.add(19);
        list.add(16);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(2));
        System.out.println(list.indexOf(16));
        System.out.println(list.contains(18));
        System.out.println(list.lastIndexOf(16));
    }
}
