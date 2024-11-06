package November.ex_04112024.CollectionFramework_Map;

import java.util.HashMap;
import java.util.Map;

public class LAb127_HashMap {
    public static void main(String[] args) {

        Map<String,String> m = new HashMap();
//         *********HAshMap******
//         output displayed is not sorted sometimes
//         allows only one null value
//        Put function is used to add the element
        // unique key can point to only one value
//         doest add the duplicate values in the internal memory or in the output
//        **HashMap** is a part of Java’s collection since Java 1.2.
//        It provides the basic implementation of the Map interface of Java.
//        It stores the data in (Key, Value) pairs.
//        **No Duplicate Key on HashMap**


        m.put("A", "a");
        m.put("A", "a");
        m.put("E", "e");
        m.put("C", "c");
        m.put("D", "d");
        m.put("B", "b");
        m.put("name", "Nishi");
        m.put("roll", "123");
        m.put("phone", "iphone");
        m.put("B", "n");
        m.put(null, "100");
        m.put(null, "200");
        m.put(null, "100");
        System.out.println(m);
        System.out.println(m.size());
        System.out.println(m.isEmpty());
        System.out.println(m.containsKey("name"));
        System.out.println(m.containsValue("123"));
        System.out.println(m.keySet()); // gives the list of keys
        System.out.println(m.values()); // gives the list of all the values
        System.out.println(m.get("phone")); // to get the value
        // how to iterate over the map
       for (Map.Entry<String, String> item : m.entrySet()) {
System.out.println(item.getKey()+ "->"+item.getValue());
     }
    }
}
