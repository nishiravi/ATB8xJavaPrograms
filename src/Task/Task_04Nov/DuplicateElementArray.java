package Task.Task_04Nov;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2, 5};
        // HashMap to store the elements
        HashMap<Integer, Integer> map = new HashMap<>();
        // Iterate through an array to check duplicate item
        for (int num : numbers) {
            // check for the Key in the map
            if (map.containsKey(num))  // check if the number in array is present as key in the map
            {
                // if key & num matches then increase the value of that key by 1
                map.put(num, map.get(num) + 1);
            } else
                // when key and num doesnt  match, add the item to the map and give default value as 1
                map.put(num, 1);
        }
        // Iterate and print only the duplicate input
        for (Map.Entry<Integer, Integer> list : map.entrySet()) {
            if (list.getValue() > 1) {
                System.out.println(list.getKey());
            }
        }
    }
}
