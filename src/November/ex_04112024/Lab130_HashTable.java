package November.ex_04112024;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab130_HashTable {
    //Hashtable
    //- **Hashtable** class in Java is a part of the Java Collections Framework and implements a hash table data structure.
    //- It is similar to `HashMap` , but there are key differences, particularly regarding synchronization and handling of null values.
    //#### Key Features of Hashtable
    //- **Synchronized**: All methods in `Hashtable`  are synchronized, making it thread-safe.
    // This means multiple threads can access a `Hashtable`  without corrupting its state.
    //- **No Null Keys or Values**: `Hashtable`  does not allow null keys or values.
    // Attempting to insert a null key or value will result in a `NullPointerException` .
    //- **Legacy Class**: Although it is part of the Java Collections Framework, `Hashtable`  is considered a legacy class.
    // New applications are encouraged to use `HashMap`  unless synchronization is required.
    public static void main(String[] args) {

        Hashtable<Integer,String> obj1= new Hashtable<>();
        obj1.put(1,"one");
        obj1.put(2,"two");
        obj1.put(3,"three");
        obj1.put(4,"four");
        obj1.put(5,null); // Doesnt allow null values
//        HashMap<Integer,String> obj2= new HashMap<>();
//        obj2.put(1,"one");
//        obj2.put(2,"two");
//        obj2.put(3,"three");
//        obj2.put(4,"four");
//        obj2.put(5,null); // allows null values
       System.out.println(obj1);
       // how to iterate
        Enumeration<Integer> e=obj1.keys();
        while(e.hasMoreElements())
        {
            System.out.println(obj1.get(e.nextElement()));
        }
    }
}
