package October.ex_25102024.ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab118_ConvertingArraysToArraysList {
    public static void main(String[] args) {
        // 1 way to create an array
        int[] marks={90,78,68,100};
        List<int[]> numbers= (ArrayList<int[]>) Arrays.asList(marks);
        for(int i=0;i<numbers.size();i++)
        {
           System.out.println(numbers.get(i));
        }


    }
}
