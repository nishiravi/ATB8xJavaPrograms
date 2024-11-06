package Task.Task_04Nov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(0, 20);
        data.add(0, 74);
        data.add(0, 86);
        data.add(0, 84);
        System.out.println(" sorted arraylist is ");
        Collections.sort(data);
        System.out.println(data);
        System.out.println(" Reverse order of Array List is ");
        Collections.sort(data, Collections.reverseOrder());
        Iterator<Integer> list = data.iterator();
        while (list.hasNext()) {
            System.out.println(list.next());
        }
    }
}
