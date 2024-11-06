package Task.Task_04Nov;

import java.util.HashMap;
import java.util.Map;

public class IterateOverMap {
    public static void main(String[] args) {

        HashMap<String, String> data = new HashMap<>();
        data.put("name", "Nishi");
        data.put("roll", "123");
        data.put("phone", "iphone");
        for (Map.Entry list : data.entrySet()) {
            System.out.println(list.getKey() + "->" + list.getValue());
        }
    }
}
