package October.ex_28102024.CollectionFramework.List.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab124_LinkedList_ArrayList {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(15);
        list.add(16);
        list.add(18);
        list.add(19);
        list.add(16);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+"  ");
        }
        System.out.println();
System.out.println(" data stored using ArrayList ");
        List<Integer> listArray=new ArrayList<>();
        listArray.add(15);
        listArray.add(16);
        listArray.add(18);
        listArray.add(19);
        listArray.add(16);

        for(int j=0;j<listArray.size();j++)
        {
            System.out.print(listArray.get(j)+"  ");
        }
    }
}
