package October.ex_30102024.CollectionFramework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab127_Set {
    public static void main(String[] args) {

        // List - allows to store the duplicate data
        // Set - Doesn't allow duplicate data , and its casesensitive , same data type
        // Classes: Hashset, LinkHashSet, Tree Set
        System.out.println(" using HashSet");
        // used when we just need to iterate over the data
        // while inserting Data is not stored in Order
        // In the output Data is not sorted
        // we can store null values
        Set a=new HashSet();
        a.add("A");
        a.add("B");
        a.add("C");
        a.add("D");
        a.add("Z");
        a.add("E");
        a.add("E");
        a.add("e");
        a.add("G");
        System.out.println(a);
        System.out.println(" using LinkHashSet");
        // used whenever insertion and deletion is needed
        // while inserting Data is stored in order ,
        // In the output Data is  not sorted
        // can store nullvalues
        Set b=new LinkedHashSet();
        b.add("A");
        b.add("B");
        b.add("C");
        b.add("K");
        b.add("D");
        b.add("Z");
        b.add("E");
        b.add("E");
        b.add("e");
        System.out.println(b);
        System.out.println(" using TreeSet");
        // used when sorting has to be performed
        // Data is sorted by default
        // cant store null values
        Set c=new TreeSet();
        c.add("A");
        c.add("B");
        c.add("C");
        c.add("D");
        c.add("E");
        c.add("E");
        c.add("e");
        c.add("Z");
        c.add("a");
        System.out.println(c);
    }
}
