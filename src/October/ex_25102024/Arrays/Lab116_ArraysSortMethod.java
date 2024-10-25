package October.ex_25102024.Arrays;

import java.util.Arrays;

public class Lab116_ArraysSortMethod {
    public static void main(String[] args) {
        int[] marks={90,78,68,100};
        //Sort
        Arrays.sort(marks);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
