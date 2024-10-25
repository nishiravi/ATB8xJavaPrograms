package October.ex_25102024.Arrays;

import javax.annotation.processing.SupportedSourceVersion;

public class Lab115_CreationArrays {
    public static void main(String[] args) {
        // 1 way to create an array
        int[] marks={90,78,68,100};
        System.out.println("length of array marks  is "+marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);


        // second way of creating an array
        int[] numbers=new int[5];
        numbers[0]=21;
        numbers[1]=22;
        numbers[2]=23;
        numbers[3]=24;
        numbers[4]=25;
        System.out.println("length of array numbers  is "+numbers.length);
        for(int i=0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }


    }
}
