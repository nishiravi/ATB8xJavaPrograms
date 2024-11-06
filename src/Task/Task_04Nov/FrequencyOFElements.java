package Task.Task_04Nov;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOFElements {
    public static void main(String[] args) {
        // add item to an Array
        Integer[] numbers = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};
        // HashMap to store the elements
        HashMap<Integer, Integer> map = new HashMap<>();
        // Iterate through an array to check the frequency of each item
        for (int num : numbers) {
            // check for item in the map , and increase the count if its presnet
            if (map.containsKey(num))  // check if the number in array is present as key in the map
            {
                // if key & num matches then increase the value of that key by 1
                map.put(num, map.get(num) + 1);
            } else
                // when key and num doesnt  match, add the item to the map and default value as 1
                map.put(num, 1);
        }
        // Iterate through the elements present in the map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "--> " + entry.getValue());
        }
    }
}
