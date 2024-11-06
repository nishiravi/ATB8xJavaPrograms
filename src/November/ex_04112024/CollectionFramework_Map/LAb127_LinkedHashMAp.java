package November.ex_04112024.CollectionFramework_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LAb127_LinkedHashMAp {
    public static void main(String[] args) {

        Map<String,String> m=new LinkedHashMap();
        // *********Linked HAshMap******
        // it maintains the order of insertion
        // unique key can point to only one value
        // allows only one null value
        // output displayed is not sorted sometimes
       // Put function is used to add the element
        // doest add the duplicate values in the internal memory or in the output
        m.put("A","a");
        m.put("A","a");
        m.put("E","e");
        m.put("C","c");
        m.put("D","d");
        m.put("B","b");
        m.put("B","n");
        m.put("name","Nishi");
        m.put("roll","123");
        m.put("phone","iphone");
        m.put(null,"100");
      m.put(null,"200");
        m.put(null,"100");
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
