package October.ex_25102024.Arrays;

import java.util.Arrays;

public class Lab117_BinarySearch {
    public static void main(String[] args) {
        int[] marks={90,78,68,100};
        //Binary Search
        Arrays.sort(marks);
        int item=Arrays.binarySearch(marks,78); // gives the index of the element we are searching
        System.out.println("Index of the element we are searching   "+item);
        System.out.println(marks[item]+" is the value we searched ");
    }
}
