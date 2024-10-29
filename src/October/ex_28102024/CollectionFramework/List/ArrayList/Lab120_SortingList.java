package October.ex_28102024.CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab120_SortingList {
    public static void main(String[] args) {
        List marks=new ArrayList<>();
        marks.add(158);
        marks.add(92);
        marks.add(83);
        Collections.sort(marks);
        System.out.println(marks);
        System.out.println("Reverse order");
       Collections.sort(marks,Collections.reverseOrder());
       System.out.println(marks);
            }
}
